using System.ComponentModel;

namespace Info_sec.Forms
{
    partial class RsaKeyGeneration
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private IContainer components = null;

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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(RsaKeyGeneration));
            this.generationButton = new System.Windows.Forms.Button();
            this.TextBoxPublic = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.TextBoxPrivate = new System.Windows.Forms.TextBox();
            this.PublicOpenKey = new System.Windows.Forms.Button();
            this.PublicSaveKey = new System.Windows.Forms.Button();
            this.PrivateOpenKey = new System.Windows.Forms.Button();
            this.PrivateSaveKey = new System.Windows.Forms.Button();
            this.EncOrDecButton = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // generationButton
            // 
            this.generationButton.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(252)))), ((int)(((byte)(207)))), ((int)(((byte)(66)))));
            this.generationButton.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.generationButton.Font = new System.Drawing.Font("Times New Roman", 10.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.generationButton.Location = new System.Drawing.Point(426, 230);
            this.generationButton.Name = "generationButton";
            this.generationButton.Size = new System.Drawing.Size(117, 38);
            this.generationButton.TabIndex = 68;
            this.generationButton.Text = "Generation";
            this.generationButton.UseVisualStyleBackColor = false;
            this.generationButton.Click += new System.EventHandler(this.generationButton_Click);
            // 
            // TextBoxPublic
            // 
            this.TextBoxPublic.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.TextBoxPublic.Location = new System.Drawing.Point(62, 82);
            this.TextBoxPublic.Name = "TextBoxPublic";
            this.TextBoxPublic.ReadOnly = true;
            this.TextBoxPublic.Size = new System.Drawing.Size(308, 34);
            this.TextBoxPublic.TabIndex = 69;
            // 
            // label5
            // 
            this.label5.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.label5.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.label5.Location = new System.Drawing.Point(62, 30);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(308, 40);
            this.label5.TabIndex = 71;
            this.label5.Text = "Public Key";
            this.label5.TextAlign = System.Drawing.ContentAlignment.TopCenter;
            // 
            // label1
            // 
            this.label1.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.label1.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.label1.Location = new System.Drawing.Point(62, 248);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(308, 40);
            this.label1.TabIndex = 73;
            this.label1.Text = "Private Key";
            this.label1.TextAlign = System.Drawing.ContentAlignment.TopCenter;
            // 
            // TextBoxPrivate
            // 
            this.TextBoxPrivate.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))));
            this.TextBoxPrivate.Location = new System.Drawing.Point(62, 300);
            this.TextBoxPrivate.Name = "TextBoxPrivate";
            this.TextBoxPrivate.ReadOnly = true;
            this.TextBoxPrivate.Size = new System.Drawing.Size(308, 34);
            this.TextBoxPrivate.TabIndex = 72;
            // 
            // PublicOpenKey
            // 
            this.PublicOpenKey.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(252)))), ((int)(((byte)(207)))), ((int)(((byte)(66)))));
            this.PublicOpenKey.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.PublicOpenKey.Font = new System.Drawing.Font("Times New Roman", 10.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.PublicOpenKey.Location = new System.Drawing.Point(62, 156);
            this.PublicOpenKey.Name = "PublicOpenKey";
            this.PublicOpenKey.Size = new System.Drawing.Size(81, 38);
            this.PublicOpenKey.TabIndex = 74;
            this.PublicOpenKey.Text = "Open";
            this.PublicOpenKey.UseVisualStyleBackColor = false;
            this.PublicOpenKey.Click += new System.EventHandler(this.OpenFile);
            // 
            // PublicSaveKey
            // 
            this.PublicSaveKey.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(252)))), ((int)(((byte)(207)))), ((int)(((byte)(66)))));
            this.PublicSaveKey.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.PublicSaveKey.Font = new System.Drawing.Font("Times New Roman", 10.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.PublicSaveKey.Location = new System.Drawing.Point(289, 156);
            this.PublicSaveKey.Name = "PublicSaveKey";
            this.PublicSaveKey.Size = new System.Drawing.Size(81, 38);
            this.PublicSaveKey.TabIndex = 75;
            this.PublicSaveKey.Text = "Save";
            this.PublicSaveKey.UseVisualStyleBackColor = false;
            this.PublicSaveKey.Click += new System.EventHandler(this.SaveFile);
            // 
            // PrivateOpenKey
            // 
            this.PrivateOpenKey.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(252)))), ((int)(((byte)(207)))), ((int)(((byte)(66)))));
            this.PrivateOpenKey.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.PrivateOpenKey.Font = new System.Drawing.Font("Times New Roman", 10.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.PrivateOpenKey.Location = new System.Drawing.Point(62, 374);
            this.PrivateOpenKey.Name = "PrivateOpenKey";
            this.PrivateOpenKey.Size = new System.Drawing.Size(81, 38);
            this.PrivateOpenKey.TabIndex = 76;
            this.PrivateOpenKey.Text = "Open";
            this.PrivateOpenKey.UseVisualStyleBackColor = false;
            this.PrivateOpenKey.Click += new System.EventHandler(this.OpenFile);
            // 
            // PrivateSaveKey
            // 
            this.PrivateSaveKey.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(252)))), ((int)(((byte)(207)))), ((int)(((byte)(66)))));
            this.PrivateSaveKey.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.PrivateSaveKey.Font = new System.Drawing.Font("Times New Roman", 10.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.PrivateSaveKey.Location = new System.Drawing.Point(289, 374);
            this.PrivateSaveKey.Name = "PrivateSaveKey";
            this.PrivateSaveKey.Size = new System.Drawing.Size(81, 38);
            this.PrivateSaveKey.TabIndex = 77;
            this.PrivateSaveKey.Text = "Save";
            this.PrivateSaveKey.UseVisualStyleBackColor = false;
            this.PrivateSaveKey.Click += new System.EventHandler(this.SaveFile);
            // 
            // EncOrDecButton
            // 
            this.EncOrDecButton.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(99)))), ((int)(((byte)(232)))), ((int)(((byte)(51)))));
            this.EncOrDecButton.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.EncOrDecButton.Font = new System.Drawing.Font("Times New Roman", 10.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.EncOrDecButton.Location = new System.Drawing.Point(599, 374);
            this.EncOrDecButton.Name = "EncOrDecButton";
            this.EncOrDecButton.Size = new System.Drawing.Size(153, 38);
            this.EncOrDecButton.TabIndex = 78;
            this.EncOrDecButton.Text = "Text_change";
            this.EncOrDecButton.UseVisualStyleBackColor = false;
            this.EncOrDecButton.Click += new System.EventHandler(this.EncOrDecButton_Click);
            // 
            // button1
            // 
            this.button1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(232)))), ((int)(((byte)(77)))), ((int)(((byte)(46)))));
            this.button1.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button1.Font = new System.Drawing.Font("Times New Roman", 10.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.button1.Location = new System.Drawing.Point(599, 25);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(153, 38);
            this.button1.TabIndex = 79;
            this.button1.Text = "Back";
            this.button1.UseVisualStyleBackColor = false;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // RsaKeyGeneration
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(7)))), ((int)(((byte)(22)))), ((int)(((byte)(92)))));
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.EncOrDecButton);
            this.Controls.Add(this.PrivateSaveKey);
            this.Controls.Add(this.PrivateOpenKey);
            this.Controls.Add(this.PublicSaveKey);
            this.Controls.Add(this.PublicOpenKey);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.TextBoxPrivate);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.TextBoxPublic);
            this.Controls.Add(this.generationButton);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "RsaKeyGeneration";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "RSA_Key_Generation";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.RsaKeyGeneration_FormClosing);
            this.ResumeLayout(false);
            this.PerformLayout();
        }

        private System.Windows.Forms.Button button1;

        private System.Windows.Forms.Button EncOrDecButton;

        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button PublicOpenKey;
        private System.Windows.Forms.Button PublicSaveKey;
        private System.Windows.Forms.Button PrivateOpenKey;
        private System.Windows.Forms.Button PrivateSaveKey;

        private System.Windows.Forms.TextBox TextBoxPublic;
        private System.Windows.Forms.TextBox TextBoxPrivate;

        private System.Windows.Forms.Button generationButton;

        #endregion
    }
}