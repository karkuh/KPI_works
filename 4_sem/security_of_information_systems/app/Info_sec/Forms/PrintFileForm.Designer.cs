using System.ComponentModel;

namespace Info_sec.Forms
{
    partial class PrintFileForm
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(PrintFileForm));
            this.BackBut = new System.Windows.Forms.Button();
            this.TextBox = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // BackBut
            // 
            this.BackBut.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(252)))), ((int)(((byte)(207)))), ((int)(((byte)(66)))));
            this.BackBut.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.BackBut.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.BackBut.Location = new System.Drawing.Point(917, 49);
            this.BackBut.Name = "BackBut";
            this.BackBut.Size = new System.Drawing.Size(112, 47);
            this.BackBut.TabIndex = 4;
            this.BackBut.Text = "Back";
            this.BackBut.UseVisualStyleBackColor = false;
            this.BackBut.Click += new System.EventHandler(this.BackBut_Click);
            // 
            // TextBox
            // 
            this.TextBox.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(166)))), ((int)(((byte)(231)))), ((int)(((byte)(255)))));
            this.TextBox.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.TextBox.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.TextBox.ForeColor = System.Drawing.SystemColors.WindowText;
            this.TextBox.Location = new System.Drawing.Point(64, 126);
            this.TextBox.Multiline = true;
            this.TextBox.Name = "TextBox";
            this.TextBox.ReadOnly = true;
            this.TextBox.ScrollBars = System.Windows.Forms.ScrollBars.Both;
            this.TextBox.Size = new System.Drawing.Size(965, 487);
            this.TextBox.TabIndex = 6;
            // 
            // PrintFileForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(7)))), ((int)(((byte)(22)))), ((int)(((byte)(92)))));
            this.ClientSize = new System.Drawing.Size(1096, 662);
            this.Controls.Add(this.TextBox);
            this.Controls.Add(this.BackBut);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "PrintFileForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Caesar";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.PrintFileForm_FormClosing);
            this.ResumeLayout(false);
            this.PerformLayout();
        }

        private System.Windows.Forms.TextBox TextBox;

        private System.Windows.Forms.Button BackBut;

        #endregion
    }
}