<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Cars
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
        Me.DataGridView1 = New System.Windows.Forms.DataGridView
        Me.GroupBox1 = New System.Windows.Forms.GroupBox
        Me.Btnsave = New System.Windows.Forms.Button
        Me.btndelete = New System.Windows.Forms.Button
        Me.Btnexit = New System.Windows.Forms.Button
        Me.Btnload = New System.Windows.Forms.Button
        Me.Txtcarname = New System.Windows.Forms.TextBox
        Me.Txtplateno = New System.Windows.Forms.TextBox
        Me.Txtcarbrand = New System.Windows.Forms.TextBox
        Me.GroupBox2 = New System.Windows.Forms.GroupBox
        Me.Label8 = New System.Windows.Forms.Label
        Me.txtavailable = New System.Windows.Forms.TextBox
        Me.Label7 = New System.Windows.Forms.Label
        Me.Btnupload = New System.Windows.Forms.Button
        Me.PictureBox1 = New System.Windows.Forms.PictureBox
        Me.Label4 = New System.Windows.Forms.Label
        Me.Label5 = New System.Windows.Forms.Label
        Me.Label6 = New System.Windows.Forms.Label
        Me.Txtcarseats = New System.Windows.Forms.TextBox
        Me.Txtcondition = New System.Windows.Forms.TextBox
        Me.Txtrentday = New System.Windows.Forms.TextBox
        Me.Label3 = New System.Windows.Forms.Label
        Me.Label2 = New System.Windows.Forms.Label
        Me.Label1 = New System.Windows.Forms.Label
        Me.GroupBox3 = New System.Windows.Forms.GroupBox
        Me.Cboxstatus = New System.Windows.Forms.ComboBox
        Me.Btnupdate = New System.Windows.Forms.Button
        Me.Label17 = New System.Windows.Forms.Label
        Me.Label9 = New System.Windows.Forms.Label
        Me.PictureBox2 = New System.Windows.Forms.PictureBox
        Me.Label10 = New System.Windows.Forms.Label
        Me.Label11 = New System.Windows.Forms.Label
        Me.Label12 = New System.Windows.Forms.Label
        Me.txtcseats = New System.Windows.Forms.TextBox
        Me.Txtcondi = New System.Windows.Forms.TextBox
        Me.txtrent = New System.Windows.Forms.TextBox
        Me.Label13 = New System.Windows.Forms.Label
        Me.Label14 = New System.Windows.Forms.Label
        Me.Label15 = New System.Windows.Forms.Label
        Me.Txtcbrand = New System.Windows.Forms.TextBox
        Me.Txtpno = New System.Windows.Forms.TextBox
        Me.Txtcname = New System.Windows.Forms.TextBox
        Me.Label16 = New System.Windows.Forms.Label
        Me.Btnadd = New System.Windows.Forms.Button
        Me.Label18 = New System.Windows.Forms.Label
        Me.Txtsearch = New System.Windows.Forms.TextBox
        CType(Me.DataGridView1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox1.SuspendLayout()
        Me.GroupBox2.SuspendLayout()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox3.SuspendLayout()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'DataGridView1
        '
        Me.DataGridView1.Anchor = CType((((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left) _
                    Or System.Windows.Forms.AnchorStyles.Right), System.Windows.Forms.AnchorStyles)
        Me.DataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.DataGridView1.Location = New System.Drawing.Point(21, 19)
        Me.DataGridView1.Name = "DataGridView1"
        Me.DataGridView1.ReadOnly = True
        Me.DataGridView1.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect
        Me.DataGridView1.Size = New System.Drawing.Size(553, 315)
        Me.DataGridView1.TabIndex = 0
        '
        'GroupBox1
        '
        Me.GroupBox1.BackColor = System.Drawing.Color.FromArgb(CType(CType(65, Byte), Integer), CType(CType(123, Byte), Integer), CType(CType(142, Byte), Integer))
        Me.GroupBox1.Controls.Add(Me.DataGridView1)
        Me.GroupBox1.Location = New System.Drawing.Point(262, 44)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(586, 349)
        Me.GroupBox1.TabIndex = 1
        Me.GroupBox1.TabStop = False
        '
        'Btnsave
        '
        Me.Btnsave.BackColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.Btnsave.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Btnsave.ForeColor = System.Drawing.Color.Black
        Me.Btnsave.Location = New System.Drawing.Point(458, 410)
        Me.Btnsave.Name = "Btnsave"
        Me.Btnsave.Size = New System.Drawing.Size(100, 41)
        Me.Btnsave.TabIndex = 2
        Me.Btnsave.Text = "Save"
        Me.Btnsave.UseVisualStyleBackColor = False
        '
        'btndelete
        '
        Me.btndelete.BackColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.btndelete.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.btndelete.ForeColor = System.Drawing.Color.Black
        Me.btndelete.Location = New System.Drawing.Point(586, 410)
        Me.btndelete.Name = "btndelete"
        Me.btndelete.Size = New System.Drawing.Size(100, 41)
        Me.btndelete.TabIndex = 3
        Me.btndelete.Text = "Delete"
        Me.btndelete.UseVisualStyleBackColor = False
        '
        'Btnexit
        '
        Me.Btnexit.BackColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.Btnexit.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Btnexit.ForeColor = System.Drawing.Color.Black
        Me.Btnexit.Location = New System.Drawing.Point(716, 410)
        Me.Btnexit.Name = "Btnexit"
        Me.Btnexit.Size = New System.Drawing.Size(100, 41)
        Me.Btnexit.TabIndex = 4
        Me.Btnexit.Text = "Exit"
        Me.Btnexit.UseVisualStyleBackColor = False
        '
        'Btnload
        '
        Me.Btnload.BackColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.Btnload.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Btnload.ForeColor = System.Drawing.Color.Black
        Me.Btnload.Location = New System.Drawing.Point(325, 410)
        Me.Btnload.Name = "Btnload"
        Me.Btnload.Size = New System.Drawing.Size(100, 41)
        Me.Btnload.TabIndex = 5
        Me.Btnload.Text = "Load"
        Me.Btnload.UseVisualStyleBackColor = False
        '
        'Txtcarname
        '
        Me.Txtcarname.Enabled = False
        Me.Txtcarname.Location = New System.Drawing.Point(67, 15)
        Me.Txtcarname.Name = "Txtcarname"
        Me.Txtcarname.Size = New System.Drawing.Size(150, 20)
        Me.Txtcarname.TabIndex = 6
        '
        'Txtplateno
        '
        Me.Txtplateno.Enabled = False
        Me.Txtplateno.Location = New System.Drawing.Point(67, 41)
        Me.Txtplateno.MaxLength = 7
        Me.Txtplateno.Name = "Txtplateno"
        Me.Txtplateno.Size = New System.Drawing.Size(150, 20)
        Me.Txtplateno.TabIndex = 7
        '
        'Txtcarbrand
        '
        Me.Txtcarbrand.Enabled = False
        Me.Txtcarbrand.Location = New System.Drawing.Point(67, 67)
        Me.Txtcarbrand.Name = "Txtcarbrand"
        Me.Txtcarbrand.Size = New System.Drawing.Size(150, 20)
        Me.Txtcarbrand.TabIndex = 8
        '
        'GroupBox2
        '
        Me.GroupBox2.BackColor = System.Drawing.Color.FromArgb(CType(CType(65, Byte), Integer), CType(CType(123, Byte), Integer), CType(CType(142, Byte), Integer))
        Me.GroupBox2.Controls.Add(Me.Label8)
        Me.GroupBox2.Controls.Add(Me.txtavailable)
        Me.GroupBox2.Controls.Add(Me.Label7)
        Me.GroupBox2.Controls.Add(Me.Btnupload)
        Me.GroupBox2.Controls.Add(Me.PictureBox1)
        Me.GroupBox2.Controls.Add(Me.Label4)
        Me.GroupBox2.Controls.Add(Me.Label5)
        Me.GroupBox2.Controls.Add(Me.Label6)
        Me.GroupBox2.Controls.Add(Me.Txtcarseats)
        Me.GroupBox2.Controls.Add(Me.Txtcondition)
        Me.GroupBox2.Controls.Add(Me.Txtrentday)
        Me.GroupBox2.Controls.Add(Me.Label3)
        Me.GroupBox2.Controls.Add(Me.Label2)
        Me.GroupBox2.Controls.Add(Me.Label1)
        Me.GroupBox2.Controls.Add(Me.Txtcarbrand)
        Me.GroupBox2.Controls.Add(Me.Txtplateno)
        Me.GroupBox2.Controls.Add(Me.Txtcarname)
        Me.GroupBox2.ForeColor = System.Drawing.Color.Black
        Me.GroupBox2.Location = New System.Drawing.Point(12, 29)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(234, 347)
        Me.GroupBox2.TabIndex = 10
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "Add Car"
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(9, 174)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(56, 13)
        Me.Label8.TabIndex = 25
        Me.Label8.Text = "Availability"
        '
        'txtavailable
        '
        Me.txtavailable.Enabled = False
        Me.txtavailable.Location = New System.Drawing.Point(67, 171)
        Me.txtavailable.Name = "txtavailable"
        Me.txtavailable.Size = New System.Drawing.Size(150, 20)
        Me.txtavailable.TabIndex = 24
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(9, 198)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(40, 13)
        Me.Label7.TabIndex = 21
        Me.Label7.Text = "Picture"
        '
        'Btnupload
        '
        Me.Btnupload.BackColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.Btnupload.Enabled = False
        Me.Btnupload.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Btnupload.ForeColor = System.Drawing.Color.Black
        Me.Btnupload.Location = New System.Drawing.Point(92, 302)
        Me.Btnupload.Name = "Btnupload"
        Me.Btnupload.Size = New System.Drawing.Size(80, 28)
        Me.Btnupload.TabIndex = 20
        Me.Btnupload.Text = "Upload"
        Me.Btnupload.UseVisualStyleBackColor = False
        '
        'PictureBox1
        '
        Me.PictureBox1.Enabled = False
        Me.PictureBox1.Location = New System.Drawing.Point(65, 198)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(156, 98)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 19
        Me.PictureBox1.TabStop = False
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(14, 148)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(54, 13)
        Me.Label4.TabIndex = 18
        Me.Label4.Text = "Rent/Day"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(14, 122)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(51, 13)
        Me.Label5.TabIndex = 17
        Me.Label5.Text = "Condition"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(15, 96)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(53, 13)
        Me.Label6.TabIndex = 16
        Me.Label6.Text = "Car Seats"
        '
        'Txtcarseats
        '
        Me.Txtcarseats.Enabled = False
        Me.Txtcarseats.Location = New System.Drawing.Point(67, 93)
        Me.Txtcarseats.Name = "Txtcarseats"
        Me.Txtcarseats.Size = New System.Drawing.Size(150, 20)
        Me.Txtcarseats.TabIndex = 15
        '
        'Txtcondition
        '
        Me.Txtcondition.Enabled = False
        Me.Txtcondition.Location = New System.Drawing.Point(67, 119)
        Me.Txtcondition.Name = "Txtcondition"
        Me.Txtcondition.Size = New System.Drawing.Size(150, 20)
        Me.Txtcondition.TabIndex = 14
        '
        'Txtrentday
        '
        Me.Txtrentday.Enabled = False
        Me.Txtrentday.Location = New System.Drawing.Point(67, 145)
        Me.Txtrentday.Name = "Txtrentday"
        Me.Txtrentday.Size = New System.Drawing.Size(150, 20)
        Me.Txtrentday.TabIndex = 13
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(14, 70)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(54, 13)
        Me.Label3.TabIndex = 12
        Me.Label3.Text = "Car Brand"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(22, 44)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(46, 13)
        Me.Label2.TabIndex = 11
        Me.Label2.Text = "Plate no"
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(15, 18)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(54, 13)
        Me.Label1.TabIndex = 10
        Me.Label1.Text = "Car Name"
        '
        'GroupBox3
        '
        Me.GroupBox3.BackColor = System.Drawing.Color.FromArgb(CType(CType(65, Byte), Integer), CType(CType(123, Byte), Integer), CType(CType(142, Byte), Integer))
        Me.GroupBox3.Controls.Add(Me.Cboxstatus)
        Me.GroupBox3.Controls.Add(Me.Btnupdate)
        Me.GroupBox3.Controls.Add(Me.Label17)
        Me.GroupBox3.Controls.Add(Me.Label9)
        Me.GroupBox3.Controls.Add(Me.PictureBox2)
        Me.GroupBox3.Controls.Add(Me.Label10)
        Me.GroupBox3.Controls.Add(Me.Label11)
        Me.GroupBox3.Controls.Add(Me.Label12)
        Me.GroupBox3.Controls.Add(Me.txtcseats)
        Me.GroupBox3.Controls.Add(Me.Txtcondi)
        Me.GroupBox3.Controls.Add(Me.txtrent)
        Me.GroupBox3.Controls.Add(Me.Label13)
        Me.GroupBox3.Controls.Add(Me.Label14)
        Me.GroupBox3.Controls.Add(Me.Label15)
        Me.GroupBox3.Controls.Add(Me.Txtcbrand)
        Me.GroupBox3.Controls.Add(Me.Txtpno)
        Me.GroupBox3.Controls.Add(Me.Txtcname)
        Me.GroupBox3.ForeColor = System.Drawing.Color.Black
        Me.GroupBox3.Location = New System.Drawing.Point(867, 46)
        Me.GroupBox3.Name = "GroupBox3"
        Me.GroupBox3.Size = New System.Drawing.Size(234, 381)
        Me.GroupBox3.TabIndex = 13
        Me.GroupBox3.TabStop = False
        '
        'Cboxstatus
        '
        Me.Cboxstatus.FormattingEnabled = True
        Me.Cboxstatus.Items.AddRange(New Object() {"Available", "Unavailable"})
        Me.Cboxstatus.Location = New System.Drawing.Point(67, 171)
        Me.Cboxstatus.Name = "Cboxstatus"
        Me.Cboxstatus.Size = New System.Drawing.Size(150, 21)
        Me.Cboxstatus.TabIndex = 25
        '
        'Btnupdate
        '
        Me.Btnupdate.BackColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.Btnupdate.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Btnupdate.ForeColor = System.Drawing.Color.Black
        Me.Btnupdate.Location = New System.Drawing.Point(79, 325)
        Me.Btnupdate.Name = "Btnupdate"
        Me.Btnupdate.Size = New System.Drawing.Size(91, 39)
        Me.Btnupdate.TabIndex = 24
        Me.Btnupdate.Text = "Update Details"
        Me.Btnupdate.UseVisualStyleBackColor = False
        '
        'Label17
        '
        Me.Label17.AutoSize = True
        Me.Label17.Location = New System.Drawing.Point(9, 174)
        Me.Label17.Name = "Label17"
        Me.Label17.Size = New System.Drawing.Size(56, 13)
        Me.Label17.TabIndex = 23
        Me.Label17.Text = "Availability"
        '
        'Label9
        '
        Me.Label9.AutoSize = True
        Me.Label9.Location = New System.Drawing.Point(6, 202)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(40, 13)
        Me.Label9.TabIndex = 21
        Me.Label9.Text = "Picture"
        '
        'PictureBox2
        '
        Me.PictureBox2.Location = New System.Drawing.Point(26, 221)
        Me.PictureBox2.Name = "PictureBox2"
        Me.PictureBox2.Size = New System.Drawing.Size(192, 98)
        Me.PictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox2.TabIndex = 19
        Me.PictureBox2.TabStop = False
        '
        'Label10
        '
        Me.Label10.AutoSize = True
        Me.Label10.Location = New System.Drawing.Point(14, 148)
        Me.Label10.Name = "Label10"
        Me.Label10.Size = New System.Drawing.Size(54, 13)
        Me.Label10.TabIndex = 18
        Me.Label10.Text = "Rent/Day"
        '
        'Label11
        '
        Me.Label11.AutoSize = True
        Me.Label11.Location = New System.Drawing.Point(14, 122)
        Me.Label11.Name = "Label11"
        Me.Label11.Size = New System.Drawing.Size(51, 13)
        Me.Label11.TabIndex = 17
        Me.Label11.Text = "Condition"
        '
        'Label12
        '
        Me.Label12.AutoSize = True
        Me.Label12.Location = New System.Drawing.Point(15, 96)
        Me.Label12.Name = "Label12"
        Me.Label12.Size = New System.Drawing.Size(53, 13)
        Me.Label12.TabIndex = 16
        Me.Label12.Text = "Car Seats"
        '
        'txtcseats
        '
        Me.txtcseats.Enabled = False
        Me.txtcseats.Location = New System.Drawing.Point(67, 93)
        Me.txtcseats.Name = "txtcseats"
        Me.txtcseats.Size = New System.Drawing.Size(150, 20)
        Me.txtcseats.TabIndex = 15
        '
        'Txtcondi
        '
        Me.Txtcondi.Enabled = False
        Me.Txtcondi.Location = New System.Drawing.Point(67, 119)
        Me.Txtcondi.Name = "Txtcondi"
        Me.Txtcondi.Size = New System.Drawing.Size(150, 20)
        Me.Txtcondi.TabIndex = 14
        '
        'txtrent
        '
        Me.txtrent.Enabled = False
        Me.txtrent.Location = New System.Drawing.Point(67, 145)
        Me.txtrent.Name = "txtrent"
        Me.txtrent.Size = New System.Drawing.Size(150, 20)
        Me.txtrent.TabIndex = 13
        '
        'Label13
        '
        Me.Label13.AutoSize = True
        Me.Label13.Location = New System.Drawing.Point(14, 70)
        Me.Label13.Name = "Label13"
        Me.Label13.Size = New System.Drawing.Size(54, 13)
        Me.Label13.TabIndex = 12
        Me.Label13.Text = "Car Brand"
        '
        'Label14
        '
        Me.Label14.AutoSize = True
        Me.Label14.Location = New System.Drawing.Point(22, 44)
        Me.Label14.Name = "Label14"
        Me.Label14.Size = New System.Drawing.Size(46, 13)
        Me.Label14.TabIndex = 11
        Me.Label14.Text = "Plate no"
        '
        'Label15
        '
        Me.Label15.AutoSize = True
        Me.Label15.Location = New System.Drawing.Point(15, 18)
        Me.Label15.Name = "Label15"
        Me.Label15.Size = New System.Drawing.Size(54, 13)
        Me.Label15.TabIndex = 10
        Me.Label15.Text = "Car Name"
        '
        'Txtcbrand
        '
        Me.Txtcbrand.Enabled = False
        Me.Txtcbrand.Location = New System.Drawing.Point(67, 67)
        Me.Txtcbrand.Name = "Txtcbrand"
        Me.Txtcbrand.Size = New System.Drawing.Size(150, 20)
        Me.Txtcbrand.TabIndex = 8
        '
        'Txtpno
        '
        Me.Txtpno.Enabled = False
        Me.Txtpno.Location = New System.Drawing.Point(67, 41)
        Me.Txtpno.Name = "Txtpno"
        Me.Txtpno.Size = New System.Drawing.Size(150, 20)
        Me.Txtpno.TabIndex = 7
        '
        'Txtcname
        '
        Me.Txtcname.Enabled = False
        Me.Txtcname.Location = New System.Drawing.Point(67, 15)
        Me.Txtcname.Name = "Txtcname"
        Me.Txtcname.Size = New System.Drawing.Size(150, 20)
        Me.Txtcname.TabIndex = 6
        '
        'Label16
        '
        Me.Label16.AutoSize = True
        Me.Label16.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label16.ForeColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.Label16.Location = New System.Drawing.Point(897, 9)
        Me.Label16.Name = "Label16"
        Me.Label16.Size = New System.Drawing.Size(160, 31)
        Me.Label16.TabIndex = 14
        Me.Label16.Text = "Car Details"
        '
        'Btnadd
        '
        Me.Btnadd.BackColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.Btnadd.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Btnadd.ForeColor = System.Drawing.Color.Black
        Me.Btnadd.Location = New System.Drawing.Point(58, 382)
        Me.Btnadd.Name = "Btnadd"
        Me.Btnadd.Size = New System.Drawing.Size(151, 31)
        Me.Btnadd.TabIndex = 15
        Me.Btnadd.Text = "Click to Add car"
        Me.Btnadd.UseVisualStyleBackColor = False
        '
        'Label18
        '
        Me.Label18.AutoSize = True
        Me.Label18.ForeColor = System.Drawing.Color.White
        Me.Label18.Location = New System.Drawing.Point(327, 15)
        Me.Label18.Name = "Label18"
        Me.Label18.Size = New System.Drawing.Size(75, 13)
        Me.Label18.TabIndex = 24
        Me.Label18.Text = "Search for Car"
        '
        'Txtsearch
        '
        Me.Txtsearch.Location = New System.Drawing.Point(408, 12)
        Me.Txtsearch.Name = "Txtsearch"
        Me.Txtsearch.Size = New System.Drawing.Size(161, 20)
        Me.Txtsearch.TabIndex = 25
        '
        'Cars
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.FromArgb(CType(CType(56, Byte), Integer), CType(CType(61, Byte), Integer), CType(CType(63, Byte), Integer))
        Me.ClientSize = New System.Drawing.Size(1129, 472)
        Me.Controls.Add(Me.Label18)
        Me.Controls.Add(Me.Txtsearch)
        Me.Controls.Add(Me.Btnadd)
        Me.Controls.Add(Me.Label16)
        Me.Controls.Add(Me.GroupBox3)
        Me.Controls.Add(Me.Btnexit)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.btndelete)
        Me.Controls.Add(Me.Btnload)
        Me.Controls.Add(Me.Btnsave)
        Me.MaximizeBox = False
        Me.MinimizeBox = False
        Me.Name = "Cars"
        Me.SizeGripStyle = System.Windows.Forms.SizeGripStyle.Hide
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Cars"
        CType(Me.DataGridView1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox2.PerformLayout()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox3.ResumeLayout(False)
        Me.GroupBox3.PerformLayout()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents DataGridView1 As System.Windows.Forms.DataGridView
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents Btnsave As System.Windows.Forms.Button
    Friend WithEvents btndelete As System.Windows.Forms.Button
    Friend WithEvents Btnexit As System.Windows.Forms.Button
    Friend WithEvents Btnload As System.Windows.Forms.Button
    Friend WithEvents Txtcarname As System.Windows.Forms.TextBox
    Friend WithEvents Txtplateno As System.Windows.Forms.TextBox
    Friend WithEvents Txtcarbrand As System.Windows.Forms.TextBox
    Friend WithEvents GroupBox2 As System.Windows.Forms.GroupBox
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents Txtcarseats As System.Windows.Forms.TextBox
    Friend WithEvents Txtcondition As System.Windows.Forms.TextBox
    Friend WithEvents Txtrentday As System.Windows.Forms.TextBox
    Friend WithEvents Label7 As System.Windows.Forms.Label
    Friend WithEvents Btnupload As System.Windows.Forms.Button
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents GroupBox3 As System.Windows.Forms.GroupBox
    Friend WithEvents Label9 As System.Windows.Forms.Label
    Friend WithEvents PictureBox2 As System.Windows.Forms.PictureBox
    Friend WithEvents Label10 As System.Windows.Forms.Label
    Friend WithEvents Label11 As System.Windows.Forms.Label
    Friend WithEvents Label12 As System.Windows.Forms.Label
    Friend WithEvents txtcseats As System.Windows.Forms.TextBox
    Friend WithEvents Txtcondi As System.Windows.Forms.TextBox
    Friend WithEvents txtrent As System.Windows.Forms.TextBox
    Friend WithEvents Label13 As System.Windows.Forms.Label
    Friend WithEvents Label14 As System.Windows.Forms.Label
    Friend WithEvents Label15 As System.Windows.Forms.Label
    Friend WithEvents Txtcbrand As System.Windows.Forms.TextBox
    Friend WithEvents Txtpno As System.Windows.Forms.TextBox
    Friend WithEvents Txtcname As System.Windows.Forms.TextBox
    Friend WithEvents Label16 As System.Windows.Forms.Label
    Friend WithEvents Label17 As System.Windows.Forms.Label
    Friend WithEvents Btnadd As System.Windows.Forms.Button
    Friend WithEvents Label8 As System.Windows.Forms.Label
    Friend WithEvents txtavailable As System.Windows.Forms.TextBox
    Friend WithEvents Btnupdate As System.Windows.Forms.Button
    Friend WithEvents Cboxstatus As System.Windows.Forms.ComboBox
    Friend WithEvents Label18 As System.Windows.Forms.Label
    Friend WithEvents Txtsearch As System.Windows.Forms.TextBox
End Class
