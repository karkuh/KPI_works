using System;
using System.Linq;
using System.Text;

namespace Info_sec.Ciphers
{
    public class BagGenerate : Bag
    {
        public static string GenerationB(int number)
        {
            var b = new StringBuilder();

            var random = new Random();
            for (int i = 1; i <= number; i++)
            {
                var low = (int)((Math.Pow(2, i - 1) - 1) * Math.Pow(2, number) + 1);
                var max = (int)(Math.Pow(2, i - 1) * Math.Pow(2, number));

                b.Append(random.Next(low, max + 1) + ",");
            }

            b.Remove(b.Length - 1, 1);
            return string.Join(",", b);
        }

        public static string GenerationM(string b)
        {
            var listB = b.Split(',').Select(int.Parse).ToArray();
            return new Random().Next(listB.Sum() + 1, listB.Sum() + 1000).ToString();
        }

        public static string GenerationT(string m)
        {
            int t;
            var random = new Random();
            var numberM = int.Parse(m);

            do
            {
                t = random.Next(7, numberM);
            } while (!EuclideanAlgorithm(t, numberM));

            return t.ToString();
        }

        public static int GenerationT1(int t, int m)
        {
            var m0 = m;
            int x = 0, y = 1;

            if (m == 1)
            {
                return 0;
            }

            while (t > 1)
            {
                var q = t / m;
                var t0 = m;

                m = t % m;
                t = t0;
                t0 = x;

                x = y - q * x;
                y = t0;
            }

            if (y < 0)
            {
                y += m0;
            }

            return y;
        }

        public static string GenerationA(int[] b, int t, int m)
        {
            var arrayA = new StringBuilder();
            for (int i = 0; i < b.Length - 1; i++)
            {
                arrayA.Append(b[i] * t % m + ",");
            }

            arrayA.Append(b[b.Length - 1] * t % m);
            return arrayA.ToString();
        }


        public static bool IsSuperIncreasing(int[] sequence)
        {
            var sum = 0;

            foreach (var t in sequence)
            {
                if (t <= sum)
                {
                    return false;
                }

                sum += t;
            }

            return true;
        }

        public static bool EuclideanAlgorithm(int a, int b)
        {
            a = Math.Abs(a);
            b = Math.Abs(b);

            while (b != 0)
            {
                int temp = b;
                b = a % b;
                a = temp;
            }


            return a == 1;
        }
    }
}