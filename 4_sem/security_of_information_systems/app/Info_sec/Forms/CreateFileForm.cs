using System;
using System.IO;
using System.Text;
using System.Windows.Forms;

namespace Info_sec.Forms
{
    public partial class CreateFileForm : Form
    {
        private string _fileName;
        private string _keyName;
        private readonly FileOrKey _fileOrKey;

        public CreateFileForm(string fileName, string keyName, FileOrKey fileOrKey)
        {
            InitializeComponent();
            _fileName = fileName;
            _keyName = keyName;
            _fileOrKey = fileOrKey;
            TextBox.SelectionStart = 0;
        }

        private void SelectBut_Click(object sender, EventArgs e)
        {
            var svf = new SaveFileDialog();
            svf.Filter = @"Text files(*.txt)|*.txt";
            if (svf.ShowDialog() == DialogResult.OK)
            {
                if (_fileOrKey == FileOrKey.File)
                {
                    _fileName = svf.FileName;
                }
                else
                {
                    _keyName = svf.FileName;
                }
            }

            PathLabel.Text = svf.FileName;
        }

        private void OkBut_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(TextBox.Text))
            {
                MessageBox.Show(@"Enter the text", @"!!!",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Warning);
            }
            else if (string.IsNullOrEmpty(PathLabel.Text))
            {
                MessageBox.Show(@"Select a path", @"!!!",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Warning);
            }
            else
            {
                File.WriteAllText(_fileOrKey == FileOrKey.File ? _fileName : _keyName, TextBox.Text, Encoding.Unicode);
                var mainForm = new MainForm(_fileName, _keyName);
                mainForm.Show();
                Hide(); 
            }

        }

        private void CreateFileForm_FormClosing(object sender, FormClosingEventArgs e)
        {
           
            Close();
        }
    }
}