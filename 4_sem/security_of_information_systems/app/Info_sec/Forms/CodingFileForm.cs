using System;
using System.IO;
using System.Text;
using System.Windows.Forms;
using Info_sec.Ciphers;

namespace Info_sec.Forms
{
    public partial class CodingFileForm : Form
    {
        private string _fileName;
        private readonly string _keyName;
        
        public CodingFileForm(string fileName, bool variant, string key,TypeCipher typeCipher, string keyName)
        {
            InitializeComponent();
            _fileName = fileName;
            _keyName = keyName;
            string result;
            switch (typeCipher)
            {
                case TypeCipher.Caesar:
                {
                    result = new Caesar().Cipher(variant, File.ReadAllLines(_fileName), new[] { key });
                    break;
                }

                case TypeCipher.Trithemius:
                {
                    result = new Trithemius().Cipher(variant, File.ReadAllLines(_fileName), new[] { key });
                    break;
                }
                case TypeCipher.Gamma:
                {
                    result = new Gamma().Cipher( variant, File.ReadAllLines(_fileName), new[] { key });
                    break;
                }
                case TypeCipher.TrithemiusSlogan:
                {
                    result = new TrithemiusSlogan().Cipher(variant, File.ReadAllLines(_fileName), new[] { key });
                    break;
                }
                case TypeCipher.Symmetric:
                {
                    result = new Symmetric().Cipher(variant, File.ReadAllLines(_fileName), key.Split('\n'));
                    break;
                }
                case TypeCipher.Book:
                {
                    result = new Book().Cipher(variant, File.ReadAllLines(_fileName), File.ReadAllLines(_keyName));
                    break;
                }
                case TypeCipher.Bag:
                   
                {
                    result = new Bag().Cipher(variant, File.ReadAllLines(_fileName), key.Split('\n'));
                    break;
                }
                case TypeCipher.RSA:
                default:
                {
                    result = new Rsa().Cipher(variant, File.ReadAllLines(_fileName), key.Split('\n'));
                    break;
                }
            }
            
            if (result == null)
            {
                MessageBox.Show(variant ? "The encoding  was unsuccessful" : "The decoding was unsuccessful");
            }
            else
            {
                TextBox.Text = result;
                PathLabel.Text = _fileName;
                MessageBox.Show(variant ? "The encoding  was successful" : "The decoding was successful");
                TextBox.SelectionStart = 0;
            }
        }
        
        

        private void NextBut_Click(object sender, EventArgs e)
        {
            var mainForm = new MainForm(_fileName, _keyName);
            mainForm.Show();
            Hide();
        }

        private void saveToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            File.WriteAllText(_fileName, TextBox.Text,Encoding.Unicode);
        }

        private void saveAsToolStripMenuItem_Click(object sender, EventArgs e)
        {
            var svf = new SaveFileDialog();
            svf.Filter = @"Text files(*.txt)|*.txt";
            if (svf.ShowDialog() != DialogResult.OK) return;
            PathLabel.Text = svf.FileName;
            File.WriteAllText(svf.FileName, TextBox.Text,Encoding.Unicode);
            _fileName = svf.FileName;
        }

        private void CodingFileForm_FormClosing(object sender, FormClosingEventArgs e)
        {
            Close();
        }
    }
}