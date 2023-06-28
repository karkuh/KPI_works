using System.Linq;
using System.Security.Cryptography;
using System.Text;

namespace Info_sec.Ciphers
{
    public class Rsa : AbstractCipher
    {
        public override string Cipher(bool variant, string[] text, string[] startKey)
        {

            var cp = new CspParameters();
            var rsa = new RSACryptoServiceProvider(cp);
            rsa.FromXmlString(startKey[0]);
            var res = new StringBuilder();

            foreach (var lineOfText in text)
            {
                if (variant)
                {
                    var byteToEncrypt = Encoding.Unicode.GetBytes(lineOfText);
                    var encryptBytes = rsa.Encrypt(byteToEncrypt, false);
                    res.Append(string.Join(" ", encryptBytes.Select(b => b.ToString())));
                }
                else
                {
                    var encryptBytes = lineOfText.Split(' ').Select(byte.Parse).ToArray();
                    var decryptBytes = rsa.Decrypt(encryptBytes, false);
                    res.Append(Encoding.Unicode.GetString(decryptBytes));
                }

                res.AppendLine();
            }


            return res.ToString();
        }
    }
}