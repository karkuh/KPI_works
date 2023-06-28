using System;
using System.Linq;
using System.Text;

namespace Info_sec.Ciphers
{
    public class Gamma : AbstractCipher
    {
        private string GenerationGamma(string[] text, int sead)
        {
            var maxLen = text[0].Length;
            for (var i = 1; i < text.Length; i++)
            {
                if (text[i].Length > maxLen)
                {
                    maxLen = text[i].Length;
                }
            }
            var random = new Random(sead);
            var randomSymbols = Enumerable.Range(0, maxLen).Select(x => (char)random.Next(1, AlphabetSize));
            return string.Concat(randomSymbols);
        }

        public override string Cipher(bool variant, string[] text, string[] startKey)
        {
            var cipherText = new StringBuilder();

            var key = GenerationGamma(text, int.Parse(startKey[0]));

            foreach (var lineOfText in text)
            {
                for (var i = 0; i < lineOfText.Length; i++)
                {
                    int intSymbol = lineOfText[i];
                    int keyCharValue = key[i];
                    var res = intSymbol ^ keyCharValue;
                    cipherText.Append((char)res);
                }

                cipherText.AppendLine();
            }

            return cipherText.ToString();
        }
    }
}