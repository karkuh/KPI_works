using System;
using System.Collections.Generic;
using System.Text;

namespace Info_sec.Ciphers
{
    public class Book : AbstractCipher
    {
        public override string Cipher(bool variant, string[] text, string[] startKey)
        {
            var cipherText = new StringBuilder();

            var random = new Random();

            foreach (var oneLine in text)
            {
                if (variant)
                {
                    for (var i = 0; i < oneLine.Length; i++)
                    {
                        var temp = Crypt(random, oneLine[i], startKey);
                        if (temp == null)
                        {
                            return null;
                        }

                        if (i != oneLine.Length - 1)
                        {
                            cipherText.Append(temp + ",");
                        }
                        else
                        {
                            cipherText.Append(temp);
                        }
                    }
                }
                else
                {
                    var arr = oneLine.Split(',');
                    foreach (var t in arr)
                    {
                        cipherText.Append(Encrypt(t, startKey));
                    }
                }
                
                cipherText.AppendLine();
            }

            return cipherText.ToString();
        }

        private static string Crypt(Random random, char symbol, string[] startKey)
        {
            var result = new List<string>();

            for (var i = 0; i < startKey.Length; i++)
            {
                for (var j = 0; j < startKey[i].Length; j++)
                {
                    if (char.ToLower(startKey[i][j]).Equals(char.ToLower(symbol)))
                    {
                        result.Add($"{i}/{j}");
                    }
                }
            }

            return result.Count == 0 ? null : result[random.Next(0, result.Count)];
        }

        private static char? Encrypt(string symbol, string[] startKey)
        {
            var arr = symbol.Split('/');
            var indexI = int.Parse(arr[0]);
            var indexJ = int.Parse(arr[1]);
            if (indexI >= startKey.Length || indexJ >= startKey[indexI].Length)
            {
                return null;
            }

            return char.ToLower(startKey[indexI][indexJ]);
        }
    }
}