using System.Text;

namespace Info_sec.Ciphers
{
    public  class Caesar:AbstractCipher
    {
        public override string Cipher(bool variant, string[] text, string[] startKey)
        {
            var cipherText = new StringBuilder();

            var key = int.Parse(startKey[0]);
            foreach (var lineOfText in text)
            {
                foreach (var t in lineOfText)
                {
                    if (variant)
                    {
                        int intSymbol = t;
                        var res = (intSymbol + key) % AlphabetSize;
                        cipherText.Append((char)res);
                    }
                    else
                    {
                        
                        int intSymbol = t;
                        var res = (intSymbol - key% AlphabetSize) % AlphabetSize;
                        cipherText.Append((char)res);
                    }
                }

                cipherText.AppendLine();
            }


            return cipherText.ToString();
        }
       
    }
}