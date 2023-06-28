using System;
using System.Text;

namespace Info_sec.Ciphers
{
    public class Trithemius:Caesar
    {
        public override string Cipher(bool variant, string[] text, string[] startKey)
        {
            var cipherText = new StringBuilder();

            var keys = startKey[0].Split(' ');
            var a = int.Parse(keys[0]);
            var b = int.Parse(keys[1]);
            var c = int.Parse(keys[2]);
            
            
            foreach (var lineOfText in text)
            {

                for (var i = 0; i < lineOfText.Length; i++)
                {
                    var key = a * i * i + b * i + c;

                    if (variant)
                    {
                        int intSymbol = lineOfText[i];
                        var res = (intSymbol + key) % AlphabetSize;
                        cipherText.Append((char)res);
                    }
                    else
                    {
                        int intSymbol = lineOfText[i];
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