using System;
using System.Drawing;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Windows.Forms;
using Info_sec.Ciphers;

namespace Info_sec.Forms
{
    public partial class MainForm : Form
    {
        private string ChooseFile { get; set; }
        private string ChooseKey { get; set; }

        public MainForm(string fileName, string keyName)
        {
            InitializeComponent();
            ChooseFile = fileName;
            ChooseKey = keyName;
            CheckChooseFile();
            CheckChooseKey();
        }

        private void CheckChooseFile()
        {
            if (string.IsNullOrEmpty(ChooseFile))
            {
                ChoiceFileLabel.ForeColor = Color.Red;
                ChoiceFileLabel.Text = @"❌";
                PathFileLabel.Text = "";
            }
            else
            {
                ChoiceFileLabel.ForeColor = Color.Green;
                ChoiceFileLabel.Text = @"✔";
                PathFileLabel.Text = ChooseFile;
            }
        }

        private void CheckChooseKey()
        {
            if (string.IsNullOrEmpty(ChooseKey))
            {
                ChoiseKeyLabel.ForeColor = Color.Red;
                ChoiseKeyLabel.Text = @"❌";
                PathKeyLabel.Text = "";
            }
            else
            {
                ChoiseKeyLabel.ForeColor = Color.Green;
                ChoiseKeyLabel.Text = @"✔";
                PathKeyLabel.Text = ChooseKey;
            }
        }

        private void CreateFileToolStripMenuItem_Click(object sender, EventArgs e)
        {
            var cf = new CreateFileForm(ChooseFile, ChooseKey, FileOrKey.File);
            cf.Show();
            Hide();
        }

        private void CreateKeyToolStripMenuItem_Click(object sender, EventArgs e)
        {
            var cf = new CreateFileForm(ChooseFile, ChooseKey, FileOrKey.Key);
            cf.Show();
            Hide();
        }

        private void OpenFileToolStripMenuItem_Click(object sender, EventArgs e)
        {
            var opf = new OpenFileDialog();
            opf.Filter = @"Text files(*.txt)|*.txt";
            if (opf.ShowDialog() == DialogResult.OK)
            {
                MessageBox.Show(@"File selected");
            }

            ChooseFile = opf.FileName;
            CheckChooseFile();
        }

        private void OpenKeyToolStripMenuItem_Click(object sender, EventArgs e)
        {
            var opf = new OpenFileDialog();
            opf.Filter = @"Text files(*.txt)|*.txt";
            if (opf.ShowDialog() == DialogResult.OK)
            {
                MessageBox.Show(@"File selected");
            }

            ChooseKey = opf.FileName;
            CheckChooseKey();
        }


        private void printFileToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(ChooseFile))
            {
                MessageBox.Show(@"Select a file", @"!!!",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Warning);
                return;
            }

            var printFile = new PrintFileForm(ChooseFile, ChooseKey, FileOrKey.File);
            printFile.Show();
            Hide();
        }

        private void printKeyToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(ChooseKey))
            {
                MessageBox.Show(@"Select a key", @"!!!",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Warning);
                return;
            }

            var printFile = new PrintFileForm(ChooseFile, ChooseKey, FileOrKey.Key);
            printFile.Show();
            Hide();
        }

        private void EncOrDec(bool variant)
        {
            string encOrDec = variant ? "encryption" : "decryption";
            if (string.IsNullOrEmpty(ChooseFile))
            {
                MessageBox.Show(@"Select a file", @"!!!",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Warning);
                return;
            }

            Form codingFile = null;
            if (radioButton1.Checked)
            {
                bool isNumeric = int.TryParse(textBox1.Text, out _);
                if (isNumeric)
                {
                    codingFile = new CodingFileForm(ChooseFile, variant, textBox1.Text, TypeCipher.Caesar, ChooseKey);
                    codingFile.Show();
                    Hide();
                }
                else
                {
                    MessageBox.Show($@"Enter the correct {encOrDec} key", @"!!!",
                        MessageBoxButtons.OK,
                        MessageBoxIcon.Warning);
                    return;
                }
            }
            else if (radioButton2.Checked)
            {
                if (comboBox1.Text == (string)comboBox1.Items[0])
                {
                    if (string.IsNullOrEmpty(textBox3.Text) || string.IsNullOrEmpty(textBox4.Text))
                    {
                        MessageBox.Show($@"Enter the correct {encOrDec} key", @"!!!",
                            MessageBoxButtons.OK,
                            MessageBoxIcon.Warning);
                        return;
                    }

                    var key = "0 " + textBox3.Text + " " + textBox4.Text;
                    codingFile = new CodingFileForm(ChooseFile, variant, key, TypeCipher.Trithemius, ChooseKey);
                }
                else if (comboBox1.Text == (string)comboBox1.Items[1])
                {
                    if (string.IsNullOrEmpty(textBox3.Text) || string.IsNullOrEmpty(textBox4.Text) ||
                        string.IsNullOrEmpty(textBox1.Text))
                    {
                        MessageBox.Show($@"Enter the correct {encOrDec} key", @"!!!",
                            MessageBoxButtons.OK,
                            MessageBoxIcon.Warning);
                        return;
                    }

                    var key = textBox1.Text + " " + textBox3.Text + " " + textBox4.Text;
                    codingFile = new CodingFileForm(ChooseFile, variant, key, TypeCipher.Trithemius, ChooseKey);
                }
                else if (comboBox1.Text == (string)comboBox1.Items[2])
                {
                    if (string.IsNullOrEmpty(textBox2.Text))
                    {
                        MessageBox.Show($@"Enter the correct {encOrDec} key", @"!!!",
                            MessageBoxButtons.OK,
                            MessageBoxIcon.Warning);
                        return;
                    }

                    codingFile = new CodingFileForm(ChooseFile, variant, textBox2.Text, TypeCipher.TrithemiusSlogan,
                        ChooseKey);
                }
            }
            else if (radioButton3.Checked)
            {
                if (string.IsNullOrEmpty(textBox1.Text))
                {
                    MessageBox.Show($@"Enter the correct {encOrDec} key", @"!!!",
                        MessageBoxButtons.OK,
                        MessageBoxIcon.Warning);
                    return;
                }

                codingFile = new CodingFileForm(ChooseFile, variant, textBox1.Text, TypeCipher.Gamma, ChooseKey);
            }
            else if (radioButton4.Checked)
            {
                if (string.IsNullOrEmpty(ChooseKey))
                {
                    MessageBox.Show(@"Select a key", @"!!!",
                        MessageBoxButtons.OK,
                        MessageBoxIcon.Warning);
                    return;
                }

                codingFile = new CodingFileForm(ChooseFile, variant, textBox1.Text, TypeCipher.Book, ChooseKey);
            }
            else if (radioButton5.Checked)
            {
                if (CheckKeyDes(comboBox2.SelectedIndex))
                {
                    codingFile = new CodingFileForm(ChooseFile, variant,
                        $"{comboBox2.Items[comboBox2.SelectedIndex]}\n{textBox5.Text}\n{comboBox3.Items[comboBox2.SelectedIndex]}",
                        TypeCipher.Symmetric, ChooseKey);
                }
                else
                {
                    return;
                }
            }
            else if (radioButton6.Checked)
            {
                if (variant ? string.IsNullOrEmpty(TextBoxA.Text) : string.IsNullOrEmpty(TextBoxT1.Text))
                {
                    MessageBox.Show(@"Select a key", @"!!!",
                        MessageBoxButtons.OK,
                        MessageBoxIcon.Warning);
                    return;
                }

                codingFile = new CodingFileForm(ChooseFile, variant,
                    $"{TextBoxB.Text}\n{TextBoxM.Text}\n{TextBoxT.Text}\n{TextBoxT1.Text}\n{TextBoxA.Text}",
                    TypeCipher.Bag, ChooseKey);
            }


            codingFile?.Show();
            Hide();
        }

        private void encryptionToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (radioButton7.Checked)
            {
                if (string.IsNullOrEmpty(ChooseFile))
                {
                    MessageBox.Show(@"Select a file", @"!!!",
                        MessageBoxButtons.OK,
                        MessageBoxIcon.Warning);
                    return;
                }

                var rsa = new RsaKeyGeneration(ChooseFile, ChooseKey, true);
                rsa.Show();
                Hide();
            }

            EncOrDec(true);
        }

        private void decryptionToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (radioButton7.Checked)
            {
                if (string.IsNullOrEmpty(ChooseFile))
                {
                    MessageBox.Show(@"Select a file", @"!!!",
                        MessageBoxButtons.OK,
                        MessageBoxIcon.Warning);
                    return;
                }

                var rsa = new RsaKeyGeneration(ChooseFile, ChooseKey, false);
                rsa.Show();
                Hide();
            }

            EncOrDec(false);
        }

        private void infoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show(@"ТР-12 
Каркушевський Владислав
Варіант: 16",
                @"Information",
                MessageBoxButtons.OK,
                MessageBoxIcon.Information);
        }


        private void radioButton_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton1.Checked)
            {
                Trithemius(false);
                Gamma(false);
                Book(false);
                Des(false);
                Bag(false);
                Caesar(true);
            }
            else if (radioButton2.Checked)
            {
                Caesar(false);
                Gamma(false);
                Book(false);
                Des(false);
                Bag(false);
                Trithemius(true);
            }
            else if (radioButton3.Checked)
            {
                Caesar(false);
                Trithemius(false);
                Book(false);
                Des(false);
                Bag(false);
                Gamma(true);
            }
            else if (radioButton4.Checked)
            {
                Caesar(false);
                Trithemius(false);
                Gamma(false);
                Des(false);
                Bag(false);
                Book(true);
            }
            else if (radioButton5.Checked)
            {
                Caesar(false);
                Trithemius(false);
                Gamma(false);
                Book(false);
                Bag(false);
                Des(true);
            }
            else if (radioButton6.Checked)
            {
                Caesar(false);
                Trithemius(false);
                Gamma(false);
                Book(false);
                Des(false);
                Bag(true);
                
            }
            else if (radioButton7.Checked)
            {
                Caesar(false);
                Trithemius(false);
                Gamma(false);
                Book(false);
                Des(false);
                Bag(false);
                Rsa(true);

            }
        }


        private void Caesar(bool boolean)
        {
            textBox1.Visible = boolean;
            textBox1.Text = "";
            label3.Visible = boolean;
            Size = new Size(Width, 650);
        }

        private void Trithemius(bool boolean)
        {
            comboBox1.Visible = boolean;
            comboBox1.SelectedIndex = 2;
            textBox2.Visible = boolean;
            textBox2.Text = "";
            label3.Visible = boolean;
            Size = new Size(Width, 650);
            if (!boolean)
            {
                textBox1.Visible = false;
                textBox2.Visible = false;
                textBox3.Visible = false;
                textBox4.Visible = false;
                label2.Visible = false;
                label4.Visible = false;
            }
        }

        private void Gamma(bool boolean)
        {
            textBox1.Visible = boolean;
            textBox1.Text = "";
            label3.Visible = boolean;
            Size = new Size(Width, 650);
        }

        private void Book(bool boolean)
        {
            label6.Visible = boolean;
            PathKeyLabel.Visible = boolean;
            label8.Visible = boolean;
            ChoiseKeyLabel.Visible = boolean;
            keyToolStripMenuItem.Visible = boolean;
            Size = new Size(Width, 650);
        }

        private void Des(bool boolean)
        {
            label3.Visible = boolean;
            textBox5.Visible = boolean;
            textBox5.Text = "";
            comboBox2.Visible = boolean;
            comboBox2.SelectedIndex = 0;
            comboBox3.Visible = boolean;
            comboBox3.SelectedIndex = 0;
            button1.Visible = boolean;
            Size = new Size(Width, 650);
        }

        private void Bag(bool boolean)
        {
            LabelA.Visible = boolean;
            TextBoxA.Visible = boolean;
            LabelB.Visible = boolean;
            TextBoxB.Visible = boolean;
            LabelA.Visible = boolean;
            TextBoxT.Visible = boolean;
            LabelT.Visible = boolean;
            TextBoxT.Visible = boolean;
            LabelT1.Visible = boolean;
            TextBoxT1.Visible = boolean;
            LabelM.Visible = boolean;
            TextBoxM.Visible = boolean;
            button2.Visible = boolean;
            checkBox1.Visible = boolean;
            Size = new Size(Width, 650);
            if (boolean) return;
            button3.Visible = false;
            numericUpDown1.Visible = false;
            checkBox1.Checked = false;
        }

        private void Rsa(bool boolean)
        {
            generationToolStripMenuItem.Visible = boolean;
            Size = new Size(Width, 500);
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (comboBox1.SelectedIndex == 0)
            {
                textBox1.Visible = false;
                textBox2.Visible = false;
                textBox3.Visible = true;
                textBox4.Visible = true;
                textBox3.Text = "";
                textBox4.Text = "";
                label2.Visible = false;
                label4.Visible = true;
            }
            else if (comboBox1.SelectedIndex == 1)
            {
                textBox1.Visible = true;
                textBox2.Visible = false;
                textBox3.Visible = true;
                textBox4.Visible = true;
                textBox1.Text = "";
                textBox3.Text = "";
                textBox4.Text = "";
                label2.Visible = true;
                label4.Visible = true;
            }
            else if (comboBox1.SelectedIndex == 2)
            {
                textBox1.Visible = false;
                textBox2.Visible = true;
                textBox3.Visible = false;
                textBox4.Visible = false;
                textBox2.Text = "";
                label2.Visible = false;
                label4.Visible = false;
            }
        }

        private void MainForm_FormClosing(object sender, FormClosingEventArgs e)
        {
            Close();
        }

        private void textBox_KeyPress(object sender, KeyPressEventArgs e)
        {
            if ((e.KeyChar <= 47 || e.KeyChar >= 58) && e.KeyChar != 8 && e.KeyChar != 45)
                e.Handled = true;
        }

        private bool CheckKeyDes(int selectedIndex)
        {
            switch (selectedIndex)
            {
                case 0:
                    if (Encoding.ASCII.GetByteCount(textBox5.Text) == 8)
                    {
                        MessageBox.Show(@"Good key");
                        return true;
                    }

                    break;
                case 1:
                    if (Encoding.ASCII.GetByteCount(textBox5.Text) == 16 ||
                        Encoding.ASCII.GetByteCount(textBox5.Text) == 24 ||
                        Encoding.ASCII.GetByteCount(textBox5.Text) == 32)
                    {
                        MessageBox.Show(@"Good key");
                        return true;
                    }

                    break;
                case 2:
                    if (Encoding.ASCII.GetByteCount(textBox5.Text) == 24)
                    {
                        if (TripleDES.IsWeakKey(Encoding.ASCII.GetBytes(textBox5.Text)))
                        {
                            MessageBox.Show(@"Weak key");
                            return false;
                        }
                        else
                        {
                            MessageBox.Show(@"Good key");
                            return true;
                        }
                    }

                    break;
            }


            MessageBox.Show(@"Incorrect size key: " + Encoding.ASCII.GetByteCount(textBox5.Text));
            return false;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            CheckKeyDes(comboBox2.SelectedIndex);
        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            textBox5.Text = "";
        }


        private void TextBoxM_KeyPress(object sender, KeyPressEventArgs e)
        {
            if ((e.KeyChar <= 47 || e.KeyChar >= 58) && e.KeyChar != 8)
                e.Handled = true;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(TextBoxT.Text) || string.IsNullOrEmpty(TextBoxM.Text) ||
                string.IsNullOrEmpty(TextBoxB.Text))
            {
                MessageBox.Show(@"Enter the value ", @"!!!",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Warning);

                return;
            }

            var arrayB = TextBoxB.Text.Split(',').Select(int.Parse).ToArray();
            if (!BagGenerate.IsSuperIncreasing(arrayB))
            {
                MessageBox.Show(@"This array is not super increasing", @"!!!",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Warning);

                return;
            }

            if (arrayB.Sum() > int.Parse(TextBoxM.Text))
            {
                MessageBox.Show(@"B > m", @"!!!",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Warning);

                return;
            }

            if (!BagGenerate.EuclideanAlgorithm(int.Parse(TextBoxT.Text), int.Parse(TextBoxM.Text)))
            {
                MessageBox.Show(@"with the selected coefficients, the algorithm is not crypto-resistant", @"!!!",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Warning);
                return;
            }

            TextBoxT1.Text = BagGenerate.GenerationT1(int.Parse(TextBoxT.Text), int.Parse(TextBoxM.Text)).ToString();
            TextBoxA.Text = BagGenerate.GenerationA(TextBoxB.Text.Split(',').Select(int.Parse).ToArray(),
                int.Parse(TextBoxT.Text), int.Parse(TextBoxM.Text));
        }

        private void button3_Click(object sender, EventArgs e)
        {
            TextBoxB.Text = BagGenerate.GenerationB(int.Parse(numericUpDown1.Text));
            TextBoxM.Text = BagGenerate.GenerationM(TextBoxB.Text);
            TextBoxT.Text = BagGenerate.GenerationT(TextBoxM.Text);
            TextBoxT1.Text = BagGenerate.GenerationT1(int.Parse(TextBoxT.Text), int.Parse(TextBoxM.Text)).ToString();
            TextBoxA.Text = BagGenerate.GenerationA(TextBoxB.Text.Split(',').Select(int.Parse).ToArray(),
                int.Parse(TextBoxT.Text), int.Parse(TextBoxM.Text));
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            button3.Visible = checkBox1.Checked;
            numericUpDown1.Visible = checkBox1.Checked;
        }

        private void generationToolStripMenuItem_Click(object sender, EventArgs e)
        {
            var rsa = new RsaKeyGeneration(ChooseFile, ChooseKey, null);
            rsa.Show();
            Hide();
        }
    }
}