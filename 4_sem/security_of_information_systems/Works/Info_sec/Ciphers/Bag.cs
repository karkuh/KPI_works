using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Info_sec.Ciphers
{
    public class Bag : AbstractCipher
    {
        public override string Cipher(bool variant, string[] text, string[] startKey)
        {
            var cipherText = new StringBuilder();
            var b = startKey[0].Split(',').Select(int.Parse).ToArray();
            var m = int.Parse(startKey[1]);
            var t1 = int.Parse(startKey[3]);
            var a = startKey[4].Split(',').Select(int.Parse).ToArray();
            foreach (var oneLine in text)
            {
                if (variant)
                {
                    var temp = new StringBuilder();
                    foreach (var t in oneLine) //кожен символ конвертуємо в 16-бітний код
                    {
                        temp.Append(Convert.ToString(Convert.ToInt32(t), 2).PadLeft(16, '0'));
                    }

                    while (temp.Length % a.Length != 0) // додаємо невистачаючі символи
                    {
                        temp.Append("0");
                    }

                    var blocks = new List<string>();

                    for (int i = 0; i < temp.Length; i += a.Length) //ділимо на блоки
                    {
                        blocks.Add(temp.ToString().Substring(i, a.Length));
                    }

                    var encryptedBlocks = new List<int>();
                    foreach (var block in blocks) //шифруємо
                    {
                        var encryptedBlock = 0;
                        for (int i = 0; i < block.Length; i++)
                        {
                            if (block[i] == '1')
                            {
                                encryptedBlock += a[i];
                            }
                        }

                        encryptedBlocks.Add(encryptedBlock);
                    }

                    for (int i = 0; i < encryptedBlocks.Count - 1; i++)
                    {
                        cipherText.Append(encryptedBlocks[i] + ",");
                    }

                    cipherText.Append(encryptedBlocks[encryptedBlocks.Count - 1]);
                }
                else
                {
                    var blocks = oneLine.Split(','); //розбиваємо на блоки
                    for (int i = 0; i < blocks.Length; i++) //множимо на t1
                    {
                        blocks[i] = ((int.Parse(blocks[i]) * t1) % m).ToString();
                    }

                    var binaryBlocks = new List<string>();
                    foreach (var t in blocks) //перетворюємо число на двійковий код
                    {
                        Stack<int> stack = new Stack<int>();
                        int number = int.Parse(t);
                        for (int j = b.Length - 1; j >= 0; j--)
                        {
                            if (b[j] <= number)
                            {
                                stack.Push(1);
                                number -= b[j];
                            }
                            else
                            {
                                stack.Push(0);
                            }
                        }

                        binaryBlocks.Add(string.Join("", stack));
                    }

                    var allBinary = string.Join("", binaryBlocks); //створюємо бінарне значення
                    var last = allBinary.Length % 16;
                    for (int i = 0; i < allBinary.Length - last; i += 16) // перетворюємо на символи
                    {
                        cipherText.Append(Convert.ToChar(Convert.ToUInt16(allBinary.Substring(i, 16), 2)));
                    }
                }

                cipherText.AppendLine();
            }

            return cipherText.ToString();
        }
    }
}