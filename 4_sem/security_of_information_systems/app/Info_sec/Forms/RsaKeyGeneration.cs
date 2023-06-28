using System;
using System.IO;
using System.Security.Cryptography;
using System.Text;
using System.Windows.Forms;
using Info_sec.Ciphers;

namespace Info_sec.Forms
{
    public partial class RsaKeyGeneration : Form
    {
        private string ChooseFile { get; set; }
        private string ChooseKey { get; set; }
        private bool Variant { get; set; }
        private string PubKey { get; set; }
        private string PrvKey { get; set; }

        public RsaKeyGeneration(string fileName, string keyName, bool? variant)
        {
            InitializeComponent();
            ChooseFile = fileName;
            ChooseKey = keyName;
            
            switch (variant)
            {
                case null:
                    EncOrDecButton.Visible = false;
                    return;
                case true:
                    Variant = true;
                    label1.Visible = false;
                    PrivateSaveKey.Visible = false;
                    PrivateOpenKey.Visible = false;
                    TextBoxPrivate.Visible = false;
                    generationButton.Visible = false;
                    break;
                default:
                    Variant = false;
                    label5.Visible = false;
                    PublicSaveKey.Visible = false;
                    PublicOpenKey.Visible = false;
                    TextBoxPublic.Visible = false;
                    generationButton.Visible = false;
                    break;
            }

            EncOrDecButton.Text = (bool)variant ? "Encrypt" : "Decrypt";
        }

        private void EncOrDecButton_Click(object sender, EventArgs e)
        {
            var key = Variant ? PubKey : PrvKey;
            if (string.IsNullOrEmpty(key))
            {
                MessageBox.Show(@"Select a file", @"!!!",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Warning);
                return;
            }
            var codingFile = new CodingFileForm(ChooseFile, Variant, key, TypeCipher.RSA, ChooseKey);
            codingFile.Show();
            Hide();
        }


        private void RsaKeyGeneration_FormClosing(object sender, FormClosingEventArgs e)
        {
            Close();
        }

        private void generationButton_Click(object sender, EventArgs e)
        {
            var rsa = new RSACryptoServiceProvider();
            PubKey = rsa.ToXmlString(false);
            PrvKey = rsa.ToXmlString(true);

            TextBoxPublic.Text = PubKey.GetHashCode().ToString();
            TextBoxPrivate.Text = PrvKey.GetHashCode().ToString();
        }


        private void SaveFile(object sender, EventArgs e)
        {
            if (sender.GetHashCode() == PublicOpenKey.GetHashCode())
            {
                if (string.IsNullOrEmpty(TextBoxPublic.Text))
                {
                    MessageBox.Show(@"Select a file", @"!!!",
                        MessageBoxButtons.OK,
                        MessageBoxIcon.Warning);
                    return;
                }
            }
            else if (string.IsNullOrEmpty(TextBoxPrivate.Text))
            {
                MessageBox.Show(@"Select a file", @"!!!",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Warning);
                return;
            }
            
            var svf = new SaveFileDialog();
            svf.Filter = @"Text files(*.txt)|*.txt";
            if (svf.ShowDialog() == DialogResult.OK)
            {
                File.WriteAllText(svf.FileName, sender.GetHashCode() == PublicOpenKey.GetHashCode() ? PubKey : PrvKey, Encoding.Unicode);
                MessageBox.Show(@"File saved");
            }
        }

        private void OpenFile(object sender, EventArgs e)
        {
            
            var opf = new OpenFileDialog();
            opf.Filter = @"Text files(*.txt)|*.txt";
            if (opf.ShowDialog() == DialogResult.OK)
            {
                MessageBox.Show(@"File selected");
                if (sender.GetHashCode() == PublicOpenKey.GetHashCode())
                {
                    PubKey = File.ReadAllText(opf.FileName);
                    TextBoxPublic.Text = PubKey.GetHashCode().ToString();
                }
                else
                {
                    PrvKey = File.ReadAllText(opf.FileName);
                    TextBoxPrivate.Text = PrvKey.GetHashCode().ToString();
                }
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            var fm1 = new MainForm(ChooseFile,ChooseKey);
            fm1.Show();
            Hide();
        }
    }
}