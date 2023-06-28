using System;
using System.Windows.Forms;

namespace Info_sec.Forms
{
    public partial class PrintFileForm : Form
    {
        private readonly string _fileName;
        private readonly string _keyName;

        public PrintFileForm(string fileName, string keyName, FileOrKey fileOrKey)
        {
            InitializeComponent();
            TextBox.Text = System.IO.File.ReadAllText(fileOrKey == FileOrKey.File ? fileName : keyName);
            _fileName = fileName;
            _keyName = keyName;
            TextBox.SelectionStart = 0;
        }

        private void BackBut_Click(object sender, EventArgs e)
        {
            var fm1 = new MainForm(_fileName,_keyName);
            fm1.Show();
            Hide();
        }

        private void PrintFileForm_FormClosing(object sender, FormClosingEventArgs e)
        {
           Close();
        }
    }
}