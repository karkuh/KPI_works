using System.Text;

namespace Info_sec.Ciphers
{
    public class TrithemiusSlogan:Caesar
    {
        
        public override string Cipher(bool variant, string[] text, string[] key)
        {

            var cipherText = new StringBuilder();

            foreach (var lineOfText in text)
            {

                for (var i = 0; i < lineOfText.Length; i++)
                {
                    if (variant)
                    {
                        int intSymbol = lineOfText[i];
                        int intKey = key[0][i % key.Length];
                        var res = (intSymbol + intKey) % AlphabetSize;
                        cipherText.Append((char)res);
                    }
                    else
                    {
                        int intSymbol = lineOfText[i];
                        int intKey = key[0][i % key.Length];
                        var res = (intSymbol - intKey% AlphabetSize) % AlphabetSize;
                        cipherText.Append((char)res);

                    }


                }
                cipherText.AppendLine();

            }


            return cipherText.ToString();
        }

    }
}