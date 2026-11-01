<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class rentdetails
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
        Me.DtgRentDetails = New System.Windows.Forms.DataGridView
        Me.GroupBox1 = New System.Windows.Forms.GroupBox
        Me.Btnload = New System.Windows.Forms.Button
        Me.Btndelete = New System.Windows.Forms.Button
        Me.btnclose = New System.Windows.Forms.Button
        Me.BtnReturn = New System.Windows.Forms.Button
        CType(Me.DtgRentDetails, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox1.SuspendLayout()
        Me.SuspendLayout()
        '
        'DtgRentDetails
        '
        Me.DtgRentDetails.AllowUserToAddRows = False
        Me.DtgRentDetails.AllowUserToDeleteRows = False
        Me.DtgRentDetails.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.DtgRentDetails.Location = New System.Drawing.Point(17, 19)
        Me.DtgRentDetails.Name = "DtgRentDetails"
        Me.DtgRentDetails.ReadOnly = True
        Me.DtgRentDetails.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect
        Me.DtgRentDetails.Size = New System.Drawing.Size(702, 252)
        Me.DtgRentDetails.TabIndex = 0
        '
        'GroupBox1
        '
        Me.GroupBox1.BackColor = System.Drawing.Color.FromArgb(CType(CType(65, Byte), Integer), CType(CType(123, Byte), Integer), CType(CType(142, Byte), Integer))
        Me.GroupBox1.Controls.Add(Me.DtgRentDetails)
        Me.GroupBox1.Location = New System.Drawing.Point(121, 23)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(728, 283)
        Me.GroupBox1.TabIndex = 1
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Rent Details"
        '
        'Btnload
        '
        Me.Btnload.BackColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.Btnload.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Btnload.Location = New System.Drawing.Point(12, 129)
        Me.Btnload.Name = "Btnload"
        Me.Btnload.Size = New System.Drawing.Size(103, 51)
        Me.Btnload.TabIndex = 2
        Me.Btnload.Text = "Load"
        Me.Btnload.UseVisualStyleBackColor = False
        '
        'Btndelete
        '
        Me.Btndelete.BackColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.Btndelete.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Btndelete.Location = New System.Drawing.Point(12, 186)
        Me.Btndelete.Name = "Btndelete"
        Me.Btndelete.Size = New System.Drawing.Size(103, 51)
        Me.Btndelete.TabIndex = 4
        Me.Btndelete.Text = "Delete"
        Me.Btndelete.UseVisualStyleBackColor = False
        '
        'btnclose
        '
        Me.btnclose.BackColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.btnclose.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.btnclose.Location = New System.Drawing.Point(12, 243)
        Me.btnclose.Name = "btnclose"
        Me.btnclose.Size = New System.Drawing.Size(103, 51)
        Me.btnclose.TabIndex = 5
        Me.btnclose.Text = "Close"
        Me.btnclose.UseVisualStyleBackColor = False
        '
        'BtnReturn
        '
        Me.BtnReturn.BackColor = System.Drawing.Color.FromArgb(CType(CType(161, Byte), Integer), CType(CType(218, Byte), Integer), CType(CType(237, Byte), Integer))
        Me.BtnReturn.Enabled = False
        Me.BtnReturn.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.BtnReturn.Location = New System.Drawing.Point(12, 23)
        Me.BtnReturn.Name = "BtnReturn"
        Me.BtnReturn.Size = New System.Drawing.Size(103, 51)
        Me.BtnReturn.TabIndex = 6
        Me.BtnReturn.Text = "Return"
        Me.BtnReturn.UseVisualStyleBackColor = False
        '
        'rentdetails
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.FromArgb(CType(CType(56, Byte), Integer), CType(CType(61, Byte), Integer), CType(CType(63, Byte), Integer))
        Me.ClientSize = New System.Drawing.Size(861, 328)
        Me.Controls.Add(Me.BtnReturn)
        Me.Controls.Add(Me.btnclose)
        Me.Controls.Add(Me.Btndelete)
        Me.Controls.Add(Me.Btnload)
        Me.Controls.Add(Me.GroupBox1)
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog
        Me.MaximizeBox = False
        Me.MinimizeBox = False
        Me.Name = "rentdetails"
        Me.SizeGripStyle = System.Windows.Forms.SizeGripStyle.Hide
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "rentdetails"
        CType(Me.DtgRentDetails, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox1.ResumeLayout(False)
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents DtgRentDetails As System.Windows.Forms.DataGridView
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents Btnload As System.Windows.Forms.Button
    Friend WithEvents Btndelete As System.Windows.Forms.Button
    Friend WithEvents btnclose As System.Windows.Forms.Button
    Friend WithEvents BtnReturn As System.Windows.Forms.Button
End Class
