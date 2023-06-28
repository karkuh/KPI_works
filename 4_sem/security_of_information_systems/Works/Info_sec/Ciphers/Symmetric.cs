using System.IO;
using System.Security.Cryptography;
using System.Text;

namespace Info_sec.Ciphers
{
    public class Symmetric : AbstractCipher
    {
        //Зарезервовуємо файл
        private const string DefaultLink = @"F:\Learn\4 семестр\БІС\Lab1\test.txt";

        public override string Cipher(bool variant, string[] text, string[] startKey)
        {
            SymmetricAlgorithm cryptic;

            switch (startKey[0])
            {
                case "DES":
                    cryptic = new DESCryptoServiceProvider();
                    cryptic.IV = Encoding.ASCII.GetBytes(startKey[1]);
                    break;
                case "AES":
                    cryptic = new AesCryptoServiceProvider();
                    cryptic.IV = Encoding.ASCII.GetBytes(startKey[1].Substring(0, 16));
                    break;
                default:
                    cryptic = new TripleDESCryptoServiceProvider();
                    cryptic.IV = Encoding.ASCII.GetBytes(startKey[1].Substring(0, 8));
                    break;
            }

            cryptic.Key = Encoding.ASCII.GetBytes(startKey[1]);


            switch (startKey[2])
            {
                case "CBC":
                    cryptic.Mode = CipherMode.CBC;
                    break;
                case "ECB":
                    cryptic.Mode = CipherMode.ECB;
                    break;
                default:
                    cryptic.Mode = CipherMode.CFB;
                    break;
            }


            FileStream stream;
            CryptoStream crStream;

            var res = new StringBuilder();

            if (variant)
            {
                File.Delete(DefaultLink);
                stream = new FileStream(DefaultLink, FileMode.OpenOrCreate, FileAccess.Write);

                crStream = new CryptoStream(stream, cryptic.CreateEncryptor(), CryptoStreamMode.Write);

                var data = Encoding.UTF8.GetBytes(string.Join("\n", text));
                crStream.Write(data, 0, data.Length);
            }
            else
            {
                stream = new FileStream(DefaultLink, FileMode.Open, FileAccess.Read);

                crStream = new CryptoStream(stream, cryptic.CreateDecryptor(), CryptoStreamMode.Read);

                var reader = new StreamReader(crStream);
                var result = reader.ReadToEnd();
                reader.Close();
                var temp = result.Split('\n');
                for (var i = 0; i < temp.Length-1; i++)
                {
                    res.Append(temp[i]);
                    res.AppendLine();
                }
                res.Append(temp[temp.Length-1]);
            }

            crStream.Close();
            stream.Close();
            return variant ? File.ReadAllText(DefaultLink) : res.ToString();
        }
    }
}