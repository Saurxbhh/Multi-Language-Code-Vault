Imports System.Data.OleDb
Imports System.IO
Public Class customers
    Dim conn As New OleDb.OleDbConnection
    Dim Myconnection As String = ("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" & Application.StartupPath & "\Carrental.accdb")
    Dim cmd As New OleDb.OleDbCommand
    Dim da As New OleDb.OleDbDataAdapter
    Dim result As Integer
    Dim imgpath As String
    Dim arrImage() As Byte
    Dim sql As String
    Private Sub customers_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        Call Btnload_Click(sender, e)
    End Sub

    Private Sub DataGridView1_CellClick(ByVal sender As Object, ByVal e As System.Windows.Forms.DataGridViewCellEventArgs) Handles DataGridView1.CellClick
        Dim arrimage() As Byte = Nothing

        Me.Text = DataGridView1.CurrentRow.Cells(0).Value.ToString
        Txtfullname.Text = DataGridView1.CurrentRow.Cells(1).Value.ToString
        Txtage.Text = DataGridView1.CurrentRow.Cells(2).Value.ToString
        Txtaddress.Text = DataGridView1.CurrentRow.Cells(3).Value.ToString
        Txtcontactno.Text = DataGridView1.CurrentRow.Cells(4).Value.ToString
        Txtdriverlicense.Text = DataGridView1.CurrentRow.Cells(5).Value.ToString
        txtemail.Text = DataGridView1.CurrentRow.Cells(6).Value.ToString

        If Not IsDBNull(arrimage) Then
            arrimage = DataGridView1.CurrentRow.Cells(7).Value
        End If

        Dim mstream As New System.IO.MemoryStream(arrimage)
        PictureBox1.Image = Image.FromStream(mstream)

    End Sub

    Public Sub cleartextfields()
        For Each crt As Control In GroupBox1.Controls
            If crt.GetType Is GetType(TextBox) Then
                crt.Text = Nothing
            End If
        Next

    End Sub

    Private Sub Btnadd_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Btnadd.Click
        cleartextfields()
        PictureBox1.Image = Nothing
    End Sub

    Private Sub Button5_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Btnupload.Click
        Try
            Dim OFD As FileDialog = New OpenFileDialog()

            OFD.Filter = "Image File (*.jpg;*.bmp;*.gif)| *.jpg;*.bmp;*.gif"

            If OFD.ShowDialog() = DialogResult.OK Then
                imgpath = OFD.FileName
                PictureBox1.ImageLocation = imgpath

            End If

            OFD = Nothing

        Catch ex As Exception
            MsgBox(ex.Message.ToString())

        End Try

    End Sub

    Private Sub Btndelete_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Btndelete.Click
        Try
            Sql = "DELETE * FROM tblcustomer  WHERE ID=" & Me.Text
            conn.Open()
            With dbcmd
                .CommandText = Sql
                .Connection = conn
            End With

            result = dbcmd.ExecuteNonQuery
            If result > 0 Then
                MsgBox("New customer record has been deleted!")
                conn.Close()
                Call Btnload_Click(sender, e)
                cleartextfields()

            Else
                MsgBox("No customer record has been deleted!")
            End If

        Catch ex As Exception
            MsgBox(ex.Message)
        Finally
            conn.Close()


        End Try
    End Sub

    Private Sub btnsave_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnsave.Click
        If Txtfullname.Text.Equals(String.Empty) And _
            Txtage.Text.Equals(String.Empty) And _
            Txtaddress.Text.Equals(String.Empty) And _
            Txtcontactno.Text.Equals(String.Empty) And _
            Txtdriverlicense.Text.Equals(String.Empty) And _
            txtemail.Text.Equals(String.Empty) Then

            MessageBox.Show("Please fill in all the required inputs", "FBS Car Rental System", MessageBoxButtons.OK, MessageBoxIcon.Warning)

        Else

            Try

                Dim mstream As New System.IO.MemoryStream
                PictureBox1.Image.Save(mstream, System.Drawing.Imaging.ImageFormat.Jpeg)
                arrImage = mstream.GetBuffer
                Dim filesize As UInt32
                filesize = mstream.Length

                mstream.Close()
                conn.ConnectionString = Myconnection

                conn.Open()

                sql = "INSERT INTO tblcustomer(FULL_NAME,AGE,ADDRESS,CONTACT_NO,DRIVER_LICENSE_NO,EMAIL_ADD,studimg) " & _
               " VALUES (@FULLNAME, @AGE, @ADDRESS, @CONTACT_NO, @DRIVER_LICENSE_NO, @EMAIL_ADD, @studimg)"

                cmd.Connection = conn
                cmd.CommandText = sql
                cmd.Parameters.AddWithValue("@FULLNAME", Txtfullname.Text)
                cmd.Parameters.AddWithValue("@AGE", Txtage.Text)
                cmd.Parameters.AddWithValue("@ADDRESS", Txtaddress.Text)
                cmd.Parameters.AddWithValue("@CONTACT_NO", Txtcontactno.Text)
                cmd.Parameters.AddWithValue("@DRIVER_LICENSE_NO", Txtdriverlicense.Text)
                cmd.Parameters.AddWithValue("@EMAIL_ADD", txtemail.Text)
                cmd.Parameters.AddWithValue("@studimg", arrImage)


                Dim r As Integer
                r = cmd.ExecuteNonQuery()
                If r > 0 Then
                    MsgBox("New customer record has been saved!")
                    conn.Close()
                    Call Btnload_Click(sender, e)
                    cleartextfields()
                    PictureBox1.Image = Nothing
                Else
                    MsgBox("No customer record has been saved!")


                End If
                conn.Close()


            Catch ex As Exception
                If ex.Message = "Object reference not set to an instance of an object." Or _
                    ex.Message = "Data type mismatch in criteria expression." Then
                    MessageBox.Show("Please fill in all the required inputs", "FBS Car Rental System", MessageBoxButtons.OK, MessageBoxIcon.Warning)
                Else
                    InputBox("", "", ex.Message)
                End If
            End Try
        End If

    End Sub

    Private Sub Txtsearch_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Txtsearch.TextChanged
        Try

            conn.Open()
            dbdt = New DataTable

            With dbcmd
                .Connection = conn
                .CommandText = "Select * from tblcustomer where FULL_NAME like '" & Txtsearch.Text & "%'"
            End With

            dbda.SelectCommand = dbcmd
            dbda.Fill(dbdt)

            DataGridView1.DataSource = dbdt

        Catch ex As Exception
            MsgBox(ex.Message)
        End Try
        dbda.Dispose()

        conn.Close()
    End Sub

    Private Sub Txtcontactno_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs)
    End Sub

    Private Sub Btnload_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Btnload.Click
        dbdt = New DataTable
        Try
            Sql = "SELECT * FROM tblcustomer"

            conn.ConnectionString = Myconnection
            conn.Open()
            With dbcmd
                .CommandText = Sql
                .Connection = conn
            End With

            dbda.SelectCommand = dbcmd
            dbda.Fill(dbdt)
            DataGridView1.DataSource = dbdt


        Catch ex As Exception
            MsgBox(ex.Message)
        Finally
            conn.Close()


        End Try
    End Sub


    Private Sub Txtfullname_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Txtfullname.TextChanged
        DisallowNumber(Txtfullname)
    End Sub

    Private Sub Txtage_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Txtage.TextChanged
        DisallowLetter(Txtage)
    End Sub

    Private Sub Txtcontactno_TextChanged_1(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Txtcontactno.TextChanged
        DisallowLetter(Txtcontactno)
    End Sub

    Private Sub Txtdriverlicense_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Txtdriverlicense.TextChanged
        DisallowLetter(Txtdriverlicense)
    End Sub
End Class