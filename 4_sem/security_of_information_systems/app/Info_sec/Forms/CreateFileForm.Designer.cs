using System.ComponentModel;

namespace Info_sec.Forms
{
    partial class CreateFileForm
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(CreateFileForm));
            this.OkBut = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.SelectBut = new System.Windows.Forms.Button();
            this.TextBox = new System.Windows.Forms.TextBox();
            this.PathLabel = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // OkBut
            // 
            this.OkBut.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(252)))), ((int)(((byte)(207)))), ((int)(((byte)(66)))));
            this.OkBut.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.OkBut.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.OkBut.Location = new System.Drawing.Point(951, 549);
            this.OkBut.Name = "OkBut";
            this.OkBut.Size = new System.Drawing.Size(112, 47);
            this.OkBut.TabIndex = 5;
            this.OkBut.Text = "OK";
            this.OkBut.UseVisualStyleBackColor = false;
            this.OkBut.Click += new System.EventHandler(this.OkBut_Click);
            // 
            // label1
            // 
            this.label1.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.label1.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.label1.Location = new System.Drawing.Point(107, 504);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(290, 36);
            this.label1.TabIndex = 6;
            this.label1.Text = "Select the file location";
            // 
            // SelectBut
            // 
            this.SelectBut.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(252)))), ((int)(((byte)(207)))), ((int)(((byte)(66)))));
            this.SelectBut.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.SelectBut.Location = new System.Drawing.Point(403, 507);
            this.SelectBut.Name = "SelectBut";
            this.SelectBut.Size = new System.Drawing.Size(70, 25);
            this.SelectBut.TabIndex = 7;
            this.SelectBut.UseVisualStyleBackColor = false;
            this.SelectBut.Click += new System.EventHandler(this.SelectBut_Click);
            // 
            // TextBox
            // 
            this.TextBox.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(166)))), ((int)(((byte)(231)))), ((int)(((byte)(255)))));
            this.TextBox.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.TextBox.Font = new System.Drawing.Font("Times New Roman", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.TextBox.ForeColor = System.Drawing.SystemColors.WindowText;
            this.TextBox.Location = new System.Drawing.Point(75, 59);
            this.TextBox.Multiline = true;
            this.TextBox.Name = "TextBox";
            this.TextBox.ScrollBars = System.Windows.Forms.ScrollBars.Both;
            this.TextBox.Size = new System.Drawing.Size(988, 421);
            this.TextBox.TabIndex = 8;
            // 
            // PathLabel
            // 
            this.PathLabel.Font = new System.Drawing.Font("Times New Roman", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.PathLabel.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.PathLabel.Location = new System.Drawing.Point(107, 559);
            this.PathLabel.Name = "PathLabel";
            this.PathLabel.Size = new System.Drawing.Size(771, 36);
            this.PathLabel.TabIndex = 9;
            // 
            // CreateFileForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(7)))), ((int)(((byte)(22)))), ((int)(((byte)(92)))));
            this.ClientSize = new System.Drawing.Size(1148, 630);
            this.Controls.Add(this.PathLabel);
            this.Controls.Add(this.TextBox);
            this.Controls.Add(this.SelectBut);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.OkBut);
            this.ForeColor = System.Drawing.SystemColors.ControlText;
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "CreateFileForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Info_sec";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.CreateFileForm_FormClosing);
            this.ResumeLayout(false);
            this.PerformLayout();
        }

        private System.Windows.Forms.Label PathLabel;

        private System.Windows.Forms.TextBox TextBox;


        private System.Windows.Forms.Button SelectBut;

        private System.Windows.Forms.Button OkBut;
        private System.Windows.Forms.Label label1;


        #endregion
    }
}