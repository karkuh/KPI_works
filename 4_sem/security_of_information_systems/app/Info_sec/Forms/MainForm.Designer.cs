namespace Info_sec.Forms
{
    partial class MainForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }

            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(MainForm));
            this.label1 = new System.Windows.Forms.Label();
            this.miniToolStrip = new System.Windows.Forms.MenuStrip();
            this.fileToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.createFileToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.openFileToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.printFileToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.keyToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.createKeyToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.openKeyToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.prinKeyToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.cryptToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.encryptionToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.decryptionToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.generationToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.infoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.ChoiceFileLabel = new System.Windows.Forms.Label();
            this.PathFileLabel = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.label3 = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.radioButton1 = new System.Windows.Forms.RadioButton();
            this.radioButton2 = new System.Windows.Forms.RadioButton();
            this.comboBox1 = new System.Windows.Forms.ComboBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.textBox2 = new System.Windows.Forms.TextBox();
            this.textBox3 = new System.Windows.Forms.TextBox();
            this.textBox4 = new System.Windows.Forms.TextBox();
            this.radioButton3 = new System.Windows.Forms.RadioButton();
            this.radioButton4 = new System.Windows.Forms.RadioButton();
            this.label6 = new System.Windows.Forms.Label();
            this.PathKeyLabel = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.ChoiseKeyLabel = new System.Windows.Forms.Label();
            this.radioButton5 = new System.Windows.Forms.RadioButton();
            this.comboBox2 = new System.Windows.Forms.ComboBox();
            this.textBox5 = new System.Windows.Forms.TextBox();
            this.button1 = new System.Windows.Forms.Button();
            this.comboBox3 = new System.Windows.Forms.ComboBox();
            this.radioButton6 = new System.Windows.Forms.RadioButton();
            this.button2 = new System.Windows.Forms.Button();
            this.LabelA = new System.Windows.Forms.Label();
            this.TextBoxA = new System.Windows.Forms.TextBox();
            this.LabelT1 = new System.Windows.Forms.Label();
            this.TextBoxT1 = new System.Windows.Forms.TextBox();
            this.LabelT = new System.Windows.Forms.Label();
            this.TextBoxT = new System.Windows.Forms.TextBox();
            this.LabelM = new System.Windows.Forms.Label();
            this.TextBoxM = new System.Windows.Forms.TextBox();
            this.LabelB = new System.Windows.Forms.Label();
            this.TextBoxB = new System.Windows.Forms.TextBox();
            this.button3 = new System.Windows.Forms.Button();
            this.checkBox1 = new System.Windows.Forms.CheckBox();
            this.numericUpDown1 = new System.Windows.Forms.NumericUpDown();
            this.radioButton7 = new System.Windows.Forms.RadioButton();
            this.miniToolStrip.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDown1)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.label1.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.label1.Location = new System.Drawing.Point(417, 305);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(81, 40);
            this.label1.TabIndex = 6;
            this.label1.Text = "Файл";
            // 
            // miniToolStrip
            // 
            this.miniToolStrip.AutoSize = false;
            this.miniToolStrip.Dock = System.Windows.Forms.DockStyle.None;
            this.miniToolStrip.Items.AddRange(new System.Windows.Forms.ToolStripItem[] { this.fileToolStripMenuItem, this.keyToolStripMenuItem, this.cryptToolStripMenuItem, this.infoToolStripMenuItem });
            this.miniToolStrip.Location = new System.Drawing.Point(0, 0);
            this.miniToolStrip.Name = "miniToolStrip";
            this.miniToolStrip.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.miniToolStrip.Size = new System.Drawing.Size(895, 30);
            this.miniToolStrip.TabIndex = 0;
            this.miniToolStrip.TabStop = true;
            this.miniToolStrip.Text = "miniToolStrip";
            // 
            // fileToolStripMenuItem
            // 
            this.fileToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] { this.createFileToolStripMenuItem, this.openFileToolStripMenuItem, this.printFileToolStripMenuItem });
            this.fileToolStripMenuItem.Name = "fileToolStripMenuItem";
            this.fileToolStripMenuItem.Size = new System.Drawing.Size(44, 26);
            this.fileToolStripMenuItem.Text = "File";
            // 
            // createFileToolStripMenuItem
            // 
            this.createFileToolStripMenuItem.Name = "createFileToolStripMenuItem";
            this.createFileToolStripMenuItem.Size = new System.Drawing.Size(148, 24);
            this.createFileToolStripMenuItem.Text = "Create File";
            this.createFileToolStripMenuItem.Click += new System.EventHandler(this.CreateFileToolStripMenuItem_Click);
            // 
            // openFileToolStripMenuItem
            // 
            this.openFileToolStripMenuItem.Name = "openFileToolStripMenuItem";
            this.openFileToolStripMenuItem.Size = new System.Drawing.Size(148, 24);
            this.openFileToolStripMenuItem.Text = "Open File";
            this.openFileToolStripMenuItem.Click += new System.EventHandler(this.OpenFileToolStripMenuItem_Click);
            // 
            // printFileToolStripMenuItem
            // 
            this.printFileToolStripMenuItem.Name = "printFileToolStripMenuItem";
            this.printFileToolStripMenuItem.Size = new System.Drawing.Size(148, 24);
            this.printFileToolStripMenuItem.Text = "Print File";
            this.printFileToolStripMenuItem.Click += new System.EventHandler(this.printFileToolStripMenuItem_Click);
            // 
            // keyToolStripMenuItem
            // 
            this.keyToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] { this.createKeyToolStripMenuItem, this.openKeyToolStripMenuItem, this.prinKeyToolStripMenuItem });
            this.keyToolStripMenuItem.Name = "keyToolStripMenuItem";
            this.keyToolStripMenuItem.Size = new System.Drawing.Size(45, 26);
            this.keyToolStripMenuItem.Text = "Key";
            this.keyToolStripMenuItem.Visible = false;
            // 
            // createKeyToolStripMenuItem
            // 
            this.createKeyToolStripMenuItem.Name = "createKeyToolStripMenuItem";
            this.createKeyToolStripMenuItem.Size = new System.Drawing.Size(149, 24);
            this.createKeyToolStripMenuItem.Text = "Create Key";
            this.createKeyToolStripMenuItem.Click += new System.EventHandler(this.CreateKeyToolStripMenuItem_Click);
            // 
            // openKeyToolStripMenuItem
            // 
            this.openKeyToolStripMenuItem.Name = "openKeyToolStripMenuItem";
            this.openKeyToolStripMenuItem.Size = new System.Drawing.Size(149, 24);
            this.openKeyToolStripMenuItem.Text = "Open Key";
            this.openKeyToolStripMenuItem.Click += new System.EventHandler(this.OpenKeyToolStripMenuItem_Click);
            // 
            // prinKeyToolStripMenuItem
            // 
            this.prinKeyToolStripMenuItem.Name = "prinKeyToolStripMenuItem";
            this.prinKeyToolStripMenuItem.Size = new System.Drawing.Size(149, 24);
            this.prinKeyToolStripMenuItem.Text = "Print Key";
            this.prinKeyToolStripMenuItem.Click += new System.EventHandler(this.printKeyToolStripMenuItem_Click);
            // 
            // cryptToolStripMenuItem
            // 
            this.cryptToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] { this.encryptionToolStripMenuItem, this.decryptionToolStripMenuItem, this.generationToolStripMenuItem });
            this.cryptToolStripMenuItem.Name = "cryptToolStripMenuItem";
            this.cryptToolStripMenuItem.Size = new System.Drawing.Size(56, 26);
            this.cryptToolStripMenuItem.Text = "Crypt";
            // 
            // encryptionToolStripMenuItem
            // 
            this.encryptionToolStripMenuItem.Name = "encryptionToolStripMenuItem";
            this.encryptionToolStripMenuItem.Size = new System.Drawing.Size(151, 24);
            this.encryptionToolStripMenuItem.Text = "Encryption";
            this.encryptionToolStripMenuItem.Click += new System.EventHandler(this.encryptionToolStripMenuItem_Click);
            // 
            // decryptionToolStripMenuItem
            // 
            this.decryptionToolStripMenuItem.Name = "decryptionToolStripMenuItem";
            this.decryptionToolStripMenuItem.Size = new System.Drawing.Size(151, 24);
            this.decryptionToolStripMenuItem.Text = "Decryption";
            this.decryptionToolStripMenuItem.Click += new System.EventHandler(this.decryptionToolStripMenuItem_Click);
            // 
            // generationToolStripMenuItem
            // 
            this.generationToolStripMenuItem.Name = "generationToolStripMenuItem";
            this.generationToolStripMenuItem.Size = new System.Drawing.Size(151, 24);
            this.generationToolStripMenuItem.Text = "Generation";
            this.generationToolStripMenuItem.Visible = false;
            this.generationToolStripMenuItem.Click += new System.EventHandler(this.generationToolStripMenuItem_Click);
            // 
            // infoToolStripMenuItem
            // 
            this.infoToolStripMenuItem.Name = "infoToolStripMenuItem";
            this.infoToolStripMenuItem.Size = new System.Drawing.Size(47, 26);
            this.infoToolStripMenuItem.Text = "Info";
            this.infoToolStripMenuItem.Click += new System.EventHandler(this.infoToolStripMenuItem_Click);
            // 
            // ChoiceFileLabel
            // 
            this.ChoiceFileLabel.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.ChoiceFileLabel.ForeColor = System.Drawing.Color.Red;
            this.ChoiceFileLabel.Location = new System.Drawing.Point(495, 305);
            this.ChoiceFileLabel.Name = "ChoiceFileLabel";
            this.ChoiceFileLabel.Size = new System.Drawing.Size(48, 40);
            this.ChoiceFileLabel.TabIndex = 9;
            // 
            // PathFileLabel
            // 
            this.PathFileLabel.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.PathFileLabel.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.PathFileLabel.Location = new System.Drawing.Point(68, 345);
            this.PathFileLabel.Name = "PathFileLabel";
            this.PathFileLabel.Size = new System.Drawing.Size(761, 40);
            this.PathFileLabel.TabIndex = 10;
            this.PathFileLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox1.Image")));
            this.pictureBox1.Location = new System.Drawing.Point(65, 33);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(761, 249);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox1.TabIndex = 11;
            this.pictureBox1.TabStop = false;
            // 
            // label3
            // 
            this.label3.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.label3.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.label3.Location = new System.Drawing.Point(65, 530);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(346, 40);
            this.label3.TabIndex = 14;
            this.label3.Text = "Введіть ключ шифрування:";
            // 
            // textBox1
            // 
            this.textBox1.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.textBox1.Location = new System.Drawing.Point(417, 530);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(100, 34);
            this.textBox1.TabIndex = 15;
            this.textBox1.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.textBox_KeyPress);
            // 
            // radioButton1
            // 
            this.radioButton1.Checked = true;
            this.radioButton1.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.radioButton1.Location = new System.Drawing.Point(419, 401);
            this.radioButton1.Name = "radioButton1";
            this.radioButton1.Size = new System.Drawing.Size(104, 24);
            this.radioButton1.TabIndex = 16;
            this.radioButton1.TabStop = true;
            this.radioButton1.Text = "Caesar";
            this.radioButton1.UseVisualStyleBackColor = true;
            this.radioButton1.CheckedChanged += new System.EventHandler(this.radioButton_CheckedChanged);
            // 
            // radioButton2
            // 
            this.radioButton2.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.radioButton2.Location = new System.Drawing.Point(419, 431);
            this.radioButton2.Name = "radioButton2";
            this.radioButton2.Size = new System.Drawing.Size(104, 24);
            this.radioButton2.TabIndex = 17;
            this.radioButton2.Text = "Trithemius";
            this.radioButton2.UseVisualStyleBackColor = true;
            this.radioButton2.CheckedChanged += new System.EventHandler(this.radioButton_CheckedChanged);
            // 
            // comboBox1
            // 
            this.comboBox1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(166)))), ((int)(((byte)(231)))), ((int)(((byte)(255)))));
            this.comboBox1.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.comboBox1.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.comboBox1.Font = new System.Drawing.Font("Times New Roman", 12F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.comboBox1.FormattingEnabled = true;
            this.comboBox1.Items.AddRange(new object[] { "Linear", "Nonlinear", "Slogan " });
            this.comboBox1.Location = new System.Drawing.Point(705, 429);
            this.comboBox1.Name = "comboBox1";
            this.comboBox1.Size = new System.Drawing.Size(121, 31);
            this.comboBox1.TabIndex = 20;
            this.comboBox1.Visible = false;
            this.comboBox1.SelectedIndexChanged += new System.EventHandler(this.comboBox1_SelectedIndexChanged);
            // 
            // label2
            // 
            this.label2.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.label2.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.label2.Location = new System.Drawing.Point(523, 530);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(36, 26);
            this.label2.TabIndex = 27;
            this.label2.Text = "p²";
            this.label2.Visible = false;
            // 
            // label4
            // 
            this.label4.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.label4.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.label4.Location = new System.Drawing.Point(681, 533);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(36, 26);
            this.label4.TabIndex = 28;
            this.label4.Text = "p";
            this.label4.Visible = false;
            // 
            // label5
            // 
            this.label5.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.label5.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.label5.Location = new System.Drawing.Point(65, 437);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(346, 40);
            this.label5.TabIndex = 29;
            this.label5.Text = "Оберіть метод шифрування:";
            // 
            // textBox2
            // 
            this.textBox2.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.textBox2.Location = new System.Drawing.Point(417, 530);
            this.textBox2.Name = "textBox2";
            this.textBox2.Size = new System.Drawing.Size(100, 34);
            this.textBox2.TabIndex = 30;
            this.textBox2.Visible = false;
            // 
            // textBox3
            // 
            this.textBox3.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.textBox3.Location = new System.Drawing.Point(565, 530);
            this.textBox3.Name = "textBox3";
            this.textBox3.Size = new System.Drawing.Size(100, 34);
            this.textBox3.TabIndex = 31;
            this.textBox3.Visible = false;
            this.textBox3.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.textBox_KeyPress);
            // 
            // textBox4
            // 
            this.textBox4.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.textBox4.Location = new System.Drawing.Point(726, 530);
            this.textBox4.Name = "textBox4";
            this.textBox4.Size = new System.Drawing.Size(100, 34);
            this.textBox4.TabIndex = 32;
            this.textBox4.Visible = false;
            this.textBox4.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.textBox_KeyPress);
            // 
            // radioButton3
            // 
            this.radioButton3.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.radioButton3.Location = new System.Drawing.Point(544, 401);
            this.radioButton3.Name = "radioButton3";
            this.radioButton3.Size = new System.Drawing.Size(104, 24);
            this.radioButton3.TabIndex = 33;
            this.radioButton3.Text = "Gamma";
            this.radioButton3.UseVisualStyleBackColor = true;
            this.radioButton3.CheckedChanged += new System.EventHandler(this.radioButton_CheckedChanged);
            // 
            // radioButton4
            // 
            this.radioButton4.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.radioButton4.Location = new System.Drawing.Point(544, 431);
            this.radioButton4.Name = "radioButton4";
            this.radioButton4.Size = new System.Drawing.Size(104, 24);
            this.radioButton4.TabIndex = 34;
            this.radioButton4.Text = "Book";
            this.radioButton4.UseVisualStyleBackColor = true;
            // 
            // label6
            // 
            this.label6.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.label6.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.label6.Location = new System.Drawing.Point(65, 585);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(346, 40);
            this.label6.TabIndex = 36;
            this.label6.Text = "Оберіть ключ шифрування:";
            this.label6.Visible = false;
            // 
            // PathKeyLabel
            // 
            this.PathKeyLabel.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.PathKeyLabel.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.PathKeyLabel.Location = new System.Drawing.Point(65, 625);
            this.PathKeyLabel.Name = "PathKeyLabel";
            this.PathKeyLabel.Size = new System.Drawing.Size(761, 40);
            this.PathKeyLabel.TabIndex = 38;
            this.PathKeyLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            this.PathKeyLabel.Visible = false;
            // 
            // label8
            // 
            this.label8.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.label8.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.label8.Location = new System.Drawing.Point(417, 585);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(81, 40);
            this.label8.TabIndex = 37;
            this.label8.Text = "Ключ";
            this.label8.Visible = false;
            // 
            // ChoiseKeyLabel
            // 
            this.ChoiseKeyLabel.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.ChoiseKeyLabel.ForeColor = System.Drawing.Color.Red;
            this.ChoiseKeyLabel.Location = new System.Drawing.Point(495, 585);
            this.ChoiseKeyLabel.Name = "ChoiseKeyLabel";
            this.ChoiseKeyLabel.Size = new System.Drawing.Size(48, 40);
            this.ChoiseKeyLabel.TabIndex = 39;
            this.ChoiseKeyLabel.Visible = false;
            // 
            // radioButton5
            // 
            this.radioButton5.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.radioButton5.Location = new System.Drawing.Point(419, 461);
            this.radioButton5.Name = "radioButton5";
            this.radioButton5.Size = new System.Drawing.Size(104, 24);
            this.radioButton5.TabIndex = 40;
            this.radioButton5.Text = "Symmetric";
            this.radioButton5.UseVisualStyleBackColor = true;
            // 
            // comboBox2
            // 
            this.comboBox2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(166)))), ((int)(((byte)(231)))), ((int)(((byte)(255)))));
            this.comboBox2.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.comboBox2.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.comboBox2.Font = new System.Drawing.Font("Times New Roman", 12F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.comboBox2.FormattingEnabled = true;
            this.comboBox2.Items.AddRange(new object[] { "DES", "AES", "TripleDES" });
            this.comboBox2.Location = new System.Drawing.Point(705, 429);
            this.comboBox2.Name = "comboBox2";
            this.comboBox2.Size = new System.Drawing.Size(121, 31);
            this.comboBox2.TabIndex = 41;
            this.comboBox2.Visible = false;
            this.comboBox2.SelectedIndexChanged += new System.EventHandler(this.comboBox2_SelectedIndexChanged);
            // 
            // textBox5
            // 
            this.textBox5.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.textBox5.Location = new System.Drawing.Point(417, 530);
            this.textBox5.Name = "textBox5";
            this.textBox5.Size = new System.Drawing.Size(248, 34);
            this.textBox5.TabIndex = 42;
            this.textBox5.Visible = false;
            // 
            // button1
            // 
            this.button1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(252)))), ((int)(((byte)(207)))), ((int)(((byte)(66)))));
            this.button1.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button1.Font = new System.Drawing.Font("Times New Roman", 10.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.button1.Location = new System.Drawing.Point(705, 530);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(121, 34);
            this.button1.TabIndex = 44;
            this.button1.Text = "Check";
            this.button1.UseVisualStyleBackColor = false;
            this.button1.Visible = false;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // comboBox3
            // 
            this.comboBox3.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(166)))), ((int)(((byte)(231)))), ((int)(((byte)(255)))));
            this.comboBox3.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.comboBox3.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.comboBox3.Font = new System.Drawing.Font("Times New Roman", 12F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.comboBox3.FormattingEnabled = true;
            this.comboBox3.Items.AddRange(new object[] { "CBC", "ECB", "CFB" });
            this.comboBox3.Location = new System.Drawing.Point(705, 482);
            this.comboBox3.Name = "comboBox3";
            this.comboBox3.Size = new System.Drawing.Size(121, 31);
            this.comboBox3.TabIndex = 45;
            this.comboBox3.Visible = false;
            // 
            // radioButton6
            // 
            this.radioButton6.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.radioButton6.Location = new System.Drawing.Point(544, 461);
            this.radioButton6.Name = "radioButton6";
            this.radioButton6.Size = new System.Drawing.Size(104, 24);
            this.radioButton6.TabIndex = 46;
            this.radioButton6.Text = "Bag";
            this.radioButton6.UseVisualStyleBackColor = true;
            // 
            // button2
            // 
            this.button2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(252)))), ((int)(((byte)(207)))), ((int)(((byte)(66)))));
            this.button2.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button2.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.button2.Location = new System.Drawing.Point(709, 579);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(117, 38);
            this.button2.TabIndex = 66;
            this.button2.Text = "OK";
            this.button2.UseVisualStyleBackColor = false;
            this.button2.Visible = false;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // LabelA
            // 
            this.LabelA.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.LabelA.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.LabelA.Location = new System.Drawing.Point(54, 666);
            this.LabelA.Name = "LabelA";
            this.LabelA.Size = new System.Drawing.Size(59, 40);
            this.LabelA.TabIndex = 65;
            this.LabelA.Text = "A:";
            this.LabelA.Visible = false;
            // 
            // TextBoxA
            // 
            this.TextBoxA.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.TextBoxA.Location = new System.Drawing.Point(119, 666);
            this.TextBoxA.Name = "TextBoxA";
            this.TextBoxA.ReadOnly = true;
            this.TextBoxA.Size = new System.Drawing.Size(556, 34);
            this.TextBoxA.TabIndex = 64;
            this.TextBoxA.Visible = false;
            // 
            // LabelT1
            // 
            this.LabelT1.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.LabelT1.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.LabelT1.Location = new System.Drawing.Point(479, 595);
            this.LabelT1.Name = "LabelT1";
            this.LabelT1.Size = new System.Drawing.Size(59, 40);
            this.LabelT1.TabIndex = 63;
            this.LabelT1.Text = "t⁻¹:";
            this.LabelT1.Visible = false;
            // 
            // TextBoxT1
            // 
            this.TextBoxT1.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.TextBoxT1.Location = new System.Drawing.Point(544, 595);
            this.TextBoxT1.Name = "TextBoxT1";
            this.TextBoxT1.ReadOnly = true;
            this.TextBoxT1.Size = new System.Drawing.Size(131, 34);
            this.TextBoxT1.TabIndex = 62;
            this.TextBoxT1.Visible = false;
            // 
            // LabelT
            // 
            this.LabelT.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.LabelT.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.LabelT.Location = new System.Drawing.Point(265, 595);
            this.LabelT.Name = "LabelT";
            this.LabelT.Size = new System.Drawing.Size(59, 40);
            this.LabelT.TabIndex = 61;
            this.LabelT.Text = "t:";
            this.LabelT.Visible = false;
            // 
            // TextBoxT
            // 
            this.TextBoxT.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.TextBoxT.Location = new System.Drawing.Point(330, 595);
            this.TextBoxT.Name = "TextBoxT";
            this.TextBoxT.Size = new System.Drawing.Size(131, 34);
            this.TextBoxT.TabIndex = 60;
            this.TextBoxT.Visible = false;
            this.TextBoxT.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.TextBoxM_KeyPress);
            // 
            // LabelM
            // 
            this.LabelM.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.LabelM.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.LabelM.Location = new System.Drawing.Point(54, 595);
            this.LabelM.Name = "LabelM";
            this.LabelM.Size = new System.Drawing.Size(59, 40);
            this.LabelM.TabIndex = 59;
            this.LabelM.Text = "m:";
            this.LabelM.Visible = false;
            // 
            // TextBoxM
            // 
            this.TextBoxM.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.TextBoxM.Location = new System.Drawing.Point(119, 595);
            this.TextBoxM.Name = "TextBoxM";
            this.TextBoxM.Size = new System.Drawing.Size(131, 34);
            this.TextBoxM.TabIndex = 58;
            this.TextBoxM.Visible = false;
            this.TextBoxM.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.TextBoxM_KeyPress);
            // 
            // LabelB
            // 
            this.LabelB.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.LabelB.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.LabelB.Location = new System.Drawing.Point(54, 527);
            this.LabelB.Name = "LabelB";
            this.LabelB.Size = new System.Drawing.Size(59, 40);
            this.LabelB.TabIndex = 57;
            this.LabelB.Text = "B:";
            this.LabelB.Visible = false;
            // 
            // TextBoxB
            // 
            this.TextBoxB.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.TextBoxB.Location = new System.Drawing.Point(119, 527);
            this.TextBoxB.Name = "TextBoxB";
            this.TextBoxB.Size = new System.Drawing.Size(556, 34);
            this.TextBoxB.TabIndex = 56;
            this.TextBoxB.Visible = false;
            // 
            // button3
            // 
            this.button3.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(252)))), ((int)(((byte)(207)))), ((int)(((byte)(66)))));
            this.button3.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button3.Font = new System.Drawing.Font("Times New Roman", 10.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.button3.Location = new System.Drawing.Point(709, 690);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(117, 38);
            this.button3.TabIndex = 67;
            this.button3.Text = "Generation";
            this.button3.UseVisualStyleBackColor = false;
            this.button3.Visible = false;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // checkBox1
            // 
            this.checkBox1.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.checkBox1.Location = new System.Drawing.Point(709, 631);
            this.checkBox1.Name = "checkBox1";
            this.checkBox1.Size = new System.Drawing.Size(117, 24);
            this.checkBox1.TabIndex = 68;
            this.checkBox1.Text = "Generation?";
            this.checkBox1.UseVisualStyleBackColor = true;
            this.checkBox1.Visible = false;
            this.checkBox1.CheckedChanged += new System.EventHandler(this.checkBox1_CheckedChanged);
            // 
            // numericUpDown1
            // 
            this.numericUpDown1.Location = new System.Drawing.Point(709, 662);
            this.numericUpDown1.Maximum = new decimal(new int[] { 10, 0, 0, 0 });
            this.numericUpDown1.Minimum = new decimal(new int[] { 5, 0, 0, 0 });
            this.numericUpDown1.Name = "numericUpDown1";
            this.numericUpDown1.Size = new System.Drawing.Size(120, 22);
            this.numericUpDown1.TabIndex = 69;
            this.numericUpDown1.Value = new decimal(new int[] { 5, 0, 0, 0 });
            this.numericUpDown1.Visible = false;
            // 
            // radioButton7
            // 
            this.radioButton7.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.radioButton7.Location = new System.Drawing.Point(419, 491);
            this.radioButton7.Name = "radioButton7";
            this.radioButton7.Size = new System.Drawing.Size(104, 24);
            this.radioButton7.TabIndex = 70;
            this.radioButton7.TabStop = true;
            this.radioButton7.Text = "RSA";
            this.radioButton7.UseVisualStyleBackColor = true;
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(7)))), ((int)(((byte)(22)))), ((int)(((byte)(92)))));
            this.ClientSize = new System.Drawing.Size(888, 740);
            this.Controls.Add(this.radioButton7);
            this.Controls.Add(this.numericUpDown1);
            this.Controls.Add(this.checkBox1);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.LabelA);
            this.Controls.Add(this.TextBoxA);
            this.Controls.Add(this.LabelT1);
            this.Controls.Add(this.TextBoxT1);
            this.Controls.Add(this.LabelT);
            this.Controls.Add(this.TextBoxT);
            this.Controls.Add(this.LabelM);
            this.Controls.Add(this.TextBoxM);
            this.Controls.Add(this.LabelB);
            this.Controls.Add(this.TextBoxB);
            this.Controls.Add(this.radioButton6);
            this.Controls.Add(this.comboBox3);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.textBox5);
            this.Controls.Add(this.comboBox2);
            this.Controls.Add(this.radioButton5);
            this.Controls.Add(this.ChoiseKeyLabel);
            this.Controls.Add(this.PathKeyLabel);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.radioButton4);
            this.Controls.Add(this.radioButton3);
            this.Controls.Add(this.textBox4);
            this.Controls.Add(this.textBox3);
            this.Controls.Add(this.textBox2);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.comboBox1);
            this.Controls.Add(this.radioButton2);
            this.Controls.Add(this.radioButton1);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.PathFileLabel);
            this.Controls.Add(this.ChoiceFileLabel);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.miniToolStrip);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Location = new System.Drawing.Point(15, 15);
            this.Name = "MainForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Info_sec";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.MainForm_FormClosing);
            this.miniToolStrip.ResumeLayout(false);
            this.miniToolStrip.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDown1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();
        }

        private System.Windows.Forms.ToolStripMenuItem generationToolStripMenuItem;

        private System.Windows.Forms.RadioButton radioButton7;

        private System.Windows.Forms.NumericUpDown numericUpDown1;

        private System.Windows.Forms.CheckBox checkBox1;

        private System.Windows.Forms.Button button3;

        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Label LabelA;
        private System.Windows.Forms.TextBox TextBoxA;
        private System.Windows.Forms.Label LabelT1;
        private System.Windows.Forms.TextBox TextBoxT1;
        private System.Windows.Forms.Label LabelT;
        private System.Windows.Forms.TextBox TextBoxT;
        private System.Windows.Forms.Label LabelM;
        private System.Windows.Forms.TextBox TextBoxM;
        private System.Windows.Forms.Label LabelB;
        private System.Windows.Forms.TextBox TextBoxB;

        private System.Windows.Forms.RadioButton radioButton6;

        private System.Windows.Forms.ComboBox comboBox3;

        private System.Windows.Forms.Button BackBut;

        private System.Windows.Forms.Button button1;

        private System.Windows.Forms.TextBox textBox5;

        private System.Windows.Forms.ComboBox comboBox2;

        private System.Windows.Forms.RadioButton radioButton5;

        private System.Windows.Forms.Label PathKeyLabel;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label ChoiseKeyLabel;

        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.ToolStripMenuItem keyToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem createKeyToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem openKeyToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem prinKeyToolStripMenuItem;

        private System.Windows.Forms.RadioButton radioButton4;

        private System.Windows.Forms.RadioButton radioButton3;

        private System.Windows.Forms.TextBox textBox2;
        private System.Windows.Forms.TextBox textBox3;
        private System.Windows.Forms.TextBox textBox4;

        private System.Windows.Forms.Label label5;

        private System.Windows.Forms.Label label4;

        private System.Windows.Forms.Label label2;

        private System.Windows.Forms.ComboBox comboBox1;

        private System.Windows.Forms.RadioButton radioButton2;

        private System.Windows.Forms.RadioButton radioButton1;

        private System.Windows.Forms.TextBox textBox1;

        private System.Windows.Forms.Label label3;


        private System.Windows.Forms.ToolStripMenuItem printFileToolStripMenuItem;

        private System.Windows.Forms.ToolStripMenuItem infoToolStripMenuItem;

        private System.Windows.Forms.ToolStripMenuItem decryptionToolStripMenuItem;

        private System.Windows.Forms.ToolStripMenuItem encryptionToolStripMenuItem;

        private System.Windows.Forms.ToolStripMenuItem cryptToolStripMenuItem;

        private System.Windows.Forms.PictureBox pictureBox1;

        private System.Windows.Forms.Label PathFileLabel;

        private System.Windows.Forms.Label ChoiceFileLabel;

        private System.Windows.Forms.ToolStripMenuItem openFileToolStripMenuItem;

        private System.Windows.Forms.ToolStripMenuItem createFileToolStripMenuItem;

        private System.Windows.Forms.MenuStrip miniToolStrip;
        private System.Windows.Forms.ToolStripMenuItem fileToolStripMenuItem;

        private System.Windows.Forms.Label label1;

        #endregion
    }
}