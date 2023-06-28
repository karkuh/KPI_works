namespace Info_sec.Ciphers
{
    public abstract class AbstractCipher
    {
        protected const int AlphabetSize = 55295;
            
        public  abstract string Cipher(bool variant, string[] text, string[] startKey);
    }
}