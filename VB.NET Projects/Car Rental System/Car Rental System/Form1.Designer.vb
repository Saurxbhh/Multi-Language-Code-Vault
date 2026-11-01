<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Mainform
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container
        Me.Btncustomers = New System.Windows.Forms.Button
        Me.Btncars = New System.Windows.Forms.Button
        Me.Btnexit = New System.Windows.Forms.Button
        Me.Label1 = New System.Windows.Forms.Label
        Me.MenuStrip1 = New System.Windows.Forms.MenuStrip
        Me.RentACarBookToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.BookToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.RentDetailsToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.RentDetailsToolStripMenuItem1 = New System.Windows.Forms.ToolStripMenuItem
        Me.HistoryToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.Label3 = New System.Windows.Forms.Label
        Me.GroupBox1 = New System.Windows.Forms.GroupBox
        Me.Label2 = New System.Windows.Forms.Label
        Me.Label4 = New System.Windows.Forms.Label
        Me.Timer1 = New System.Windows.Forms.Timer(Me.components)
        Me.NfRentExpiration = New System.Windows.Forms.NotifyIcon(Me.components)
        Me.Btnlogin = New System.Windows.Forms.Button
        Me.PictureBox1 = New System.Windows.Forms.PictureBox
        Me.MenuStrip1.SuspendLayout()
        Me.GroupBox1.SuspendLayout()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'Btncustomers
        '
        Me.Btncustomers.BackColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.Btncustomers.Enabled = False
        Me.Btncustomers.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Btncustomers.Font = New System.Drawing.Font("MS Reference Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Btncustomers.ForeColor = System.Drawing.Color.Black
        Me.Btncustomers.Location = New System.Drawing.Point(20, 16)
        Me.Btncustomers.Name = "Btncustomers"
        Me.Btncustomers.Size = New System.Drawing.Size(219, 44)
        Me.Btncustomers.TabIndex = 0
        Me.Btncustomers.Text = "Add Customers"
        Me.Btncustomers.UseVisualStyleBackColor = False
        '
        'Btncars
        '
        Me.Btncars.BackColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.Btncars.Enabled = False
        Me.Btncars.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Btncars.Font = New System.Drawing.Font("MS Reference Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Btncars.ForeColor = System.Drawing.Color.Black
        Me.Btncars.Location = New System.Drawing.Point(267, 16)
        Me.Btncars.Name = "Btncars"
        Me.Btncars.Size = New System.Drawing.Size(226, 44)
        Me.Btncars.TabIndex = 1
        Me.Btncars.Text = "Cars"
        Me.Btncars.UseVisualStyleBackColor = False
        '
        'Btnexit
        '
        Me.Btnexit.BackColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.Btnexit.Enabled = False
        Me.Btnexit.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Btnexit.Font = New System.Drawing.Font("MS Reference Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Btnexit.ForeColor = System.Drawing.Color.Black
        Me.Btnexit.Location = New System.Drawing.Point(513, 16)
        Me.Btnexit.Name = "Btnexit"
        Me.Btnexit.Size = New System.Drawing.Size(243, 44)
        Me.Btnexit.TabIndex = 3
        Me.Btnexit.Text = "Exit"
        Me.Btnexit.UseVisualStyleBackColor = False
        '
        'Label1
        '
        Me.Label1.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Cooper Black", 21.75!, System.Drawing.FontStyle.Underline, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.ForeColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.Label1.Location = New System.Drawing.Point(355, 28)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(237, 34)
        Me.Label1.TabIndex = 6
        Me.Label1.Text = "FBS Car Rental"
        Me.Label1.TextAlign = System.Drawing.ContentAlignment.TopCenter
        '
        'MenuStrip1
        '
        Me.MenuStrip1.BackColor = System.Drawing.Color.FromArgb(CType(CType(246, Byte), Integer), CType(CType(247, Byte), Integer), CType(CType(235, Byte), Integer))
        Me.MenuStrip1.Enabled = False
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.RentACarBookToolStripMenuItem, Me.RentDetailsToolStripMenuItem, Me.HistoryToolStripMenuItem})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.Size = New System.Drawing.Size(951, 24)
        Me.MenuStrip1.TabIndex = 8
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'RentACarBookToolStripMenuItem
        '
        Me.RentACarBookToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.BookToolStripMenuItem})
        Me.RentACarBookToolStripMenuItem.Name = "RentACarBookToolStripMenuItem"
        Me.RentACarBookToolStripMenuItem.Size = New System.Drawing.Size(73, 20)
        Me.RentACarBookToolStripMenuItem.Text = "Rent a Car"
        '
        'BookToolStripMenuItem
        '
        Me.BookToolStripMenuItem.Name = "BookToolStripMenuItem"
        Me.BookToolStripMenuItem.Size = New System.Drawing.Size(101, 22)
        Me.BookToolStripMenuItem.Text = "Book"
        '
        'RentDetailsToolStripMenuItem
        '
        Me.RentDetailsToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.RentDetailsToolStripMenuItem1})
        Me.RentDetailsToolStripMenuItem.Name = "RentDetailsToolStripMenuItem"
        Me.RentDetailsToolStripMenuItem.Size = New System.Drawing.Size(54, 20)
        Me.RentDetailsToolStripMenuItem.Text = "Details"
        '
        'RentDetailsToolStripMenuItem1
        '
        Me.RentDetailsToolStripMenuItem1.Name = "RentDetailsToolStripMenuItem1"
        Me.RentDetailsToolStripMenuItem1.Size = New System.Drawing.Size(136, 22)
        Me.RentDetailsToolStripMenuItem1.Text = "Rent Details"
        '
        'HistoryToolStripMenuItem
        '
        Me.HistoryToolStripMenuItem.Name = "HistoryToolStripMenuItem"
        Me.HistoryToolStripMenuItem.Size = New System.Drawing.Size(57, 20)
        Me.HistoryToolStripMenuItem.Text = "History"
        '
        'Label3
        '
        Me.Label3.Anchor = CType((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Right), System.Windows.Forms.AnchorStyles)
        Me.Label3.AutoSize = True
        Me.Label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.ForeColor = System.Drawing.Color.White
        Me.Label3.Location = New System.Drawing.Point(891, 33)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(0, 20)
        Me.Label3.TabIndex = 11
        '
        'GroupBox1
        '
        Me.GroupBox1.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.GroupBox1.BackColor = System.Drawing.Color.FromArgb(CType(CType(65, Byte), Integer), CType(CType(123, Byte), Integer), CType(CType(142, Byte), Integer))
        Me.GroupBox1.Controls.Add(Me.Btnexit)
        Me.GroupBox1.Controls.Add(Me.Btncars)
        Me.GroupBox1.Controls.Add(Me.Btncustomers)
        Me.GroupBox1.Location = New System.Drawing.Point(74, 65)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(784, 71)
        Me.GroupBox1.TabIndex = 12
        Me.GroupBox1.TabStop = False
        '
        'Label2
        '
        Me.Label2.Anchor = CType((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Right), System.Windows.Forms.AnchorStyles)
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.ForeColor = System.Drawing.Color.White
        Me.Label2.Location = New System.Drawing.Point(848, 33)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(0, 20)
        Me.Label2.TabIndex = 13
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.Location = New System.Drawing.Point(12, 33)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(57, 20)
        Me.Label4.TabIndex = 15
        Me.Label4.Text = "Label4"
        '
        'Timer1
        '
        '
        'NfRentExpiration
        '
        Me.NfRentExpiration.BalloonTipIcon = System.Windows.Forms.ToolTipIcon.Info
        Me.NfRentExpiration.BalloonTipText = "Sample"
        Me.NfRentExpiration.BalloonTipTitle = "Rent Expiration"
        Me.NfRentExpiration.Text = "Rent Expiration"
        Me.NfRentExpiration.Visible = True
        '
        'Btnlogin
        '
        Me.Btnlogin.Anchor = CType((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Right), System.Windows.Forms.AnchorStyles)
        Me.Btnlogin.BackColor = System.Drawing.Color.White
        Me.Btnlogin.BackgroundImage = Global.Carrentalsystem.My.Resources.Resources.small_p266908_n277810
        Me.Btnlogin.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.Btnlogin.FlatAppearance.BorderSize = 0
        Me.Btnlogin.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Btnlogin.ForeColor = System.Drawing.Color.Black
        Me.Btnlogin.Location = New System.Drawing.Point(854, 1)
        Me.Btnlogin.Name = "Btnlogin"
        Me.Btnlogin.Size = New System.Drawing.Size(86, 23)
        Me.Btnlogin.TabIndex = 9
        Me.Btnlogin.UseVisualStyleBackColor = False
        '
        'PictureBox1
        '
        Me.PictureBox1.Anchor = CType((((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left) _
                    Or System.Windows.Forms.AnchorStyles.Right), System.Windows.Forms.AnchorStyles)
        Me.PictureBox1.Image = Global.Carrentalsystem.My.Resources.Resources._1dba88e10a0d028a002d4c7e4645b1c2_1_1_
        Me.PictureBox1.Location = New System.Drawing.Point(0, 142)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(952, 298)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 4
        Me.PictureBox1.TabStop = False
        '
        'Mainform
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.FromArgb(CType(CType(56, Byte), Integer), CType(CType(61, Byte), Integer), CType(CType(63, Byte), Integer))
        Me.ClientSize = New System.Drawing.Size(951, 456)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Btnlogin)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.MenuStrip1)
        Me.ForeColor = System.Drawing.Color.FromArgb(CType(CType(246, Byte), Integer), CType(CType(247, Byte), Integer), CType(CType(235, Byte), Integer))
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog
        Me.MainMenuStrip = Me.MenuStrip1
        Me.MaximizeBox = False
        Me.MinimizeBox = False
        Me.Name = "Mainform"
        Me.SizeGripStyle = System.Windows.Forms.SizeGripStyle.Hide
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "FBS Car Rental System"
        Me.WindowState = System.Windows.Forms.FormWindowState.Maximized
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        Me.GroupBox1.ResumeLayout(False)
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents Btncustomers As System.Windows.Forms.Button
    Friend WithEvents Btncars As System.Windows.Forms.Button
    Friend WithEvents Btnexit As System.Windows.Forms.Button
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents MenuStrip1 As System.Windows.Forms.MenuStrip
    Friend WithEvents RentACarBookToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents RentDetailsToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents BookToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents RentDetailsToolStripMenuItem1 As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents Btnlogin As System.Windows.Forms.Button
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Timer1 As System.Windows.Forms.Timer
    Friend WithEvents NfRentExpiration As System.Windows.Forms.NotifyIcon
    Friend WithEvents HistoryToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem

End Class
