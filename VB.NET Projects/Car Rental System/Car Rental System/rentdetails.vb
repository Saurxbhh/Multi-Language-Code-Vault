Public Class rentdetails

    Private Sub Btnload_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Btnload.Click
        dbdt = New DataTable
        Try
            Sql = "SELECT * FROM tblrentdetails WHERE Returned=0"
            conn.Open()
            With dbcmd
                .CommandText = Sql
                .Connection = conn
            End With

            dbda.SelectCommand = dbcmd
            dbda.Fill(dbdt)
            DtgRentDetails.DataSource = dbdt


        Catch ex As Exception
            MsgBox(ex.Message)
        Finally
            conn.Close()


        End Try
    End Sub

    Private Sub btnclose_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnclose.Click
        Me.Close()
    End Sub



    Public Sub cleartextfields()
        For Each crt As Control In GroupBox1.Controls
            If crt.GetType Is GetType(TextBox) Then
                crt.Text = Nothing
            End If
        Next

    End Sub

    Private Sub Btndelete_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Btndelete.Click
        Try
            Sql = "DELETE FROM tblrentdetails WHERE ID=" & Me.Text
            conn.Open()
            With dbcmd
                .CommandText = Sql
                .Connection = conn
            End With

            result = dbcmd.ExecuteNonQuery
            If result > 0 Then
                MsgBox("New record has been deleted!")
                conn.Close()
                Call Btnload_Click(sender, e)
                cleartextfields()

            Else
                MsgBox("No record has been deleted!")
            End If

        Catch ex As Exception
            MsgBox(ex.Message)
        Finally
            conn.Close()


        End Try
    End Sub

    Private Sub rentdetails_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
    End Sub

    Private Sub DtgRentDetails_CellClick(ByVal sender As Object, ByVal e As System.Windows.Forms.DataGridViewCellEventArgs) Handles DtgRentDetails.CellClick
        BtnReturn.Enabled = True
        Me.Text = DtgRentDetails.CurrentRow.Cells("ID").Value
    End Sub

    Private Sub DtgRentDetails_CellValueChanged(ByVal sender As Object, ByVal e As System.Windows.Forms.DataGridViewCellEventArgs) Handles DtgRentDetails.CellValueChanged
        MessageBox.Show("Return value has been changed to " & DtgRentDetails.CurrentRow.Cells("Returned").Value)
    End Sub

    Private Sub BtnReturn_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BtnReturn.Click
        Dim CarName = DtgRentDetails.CurrentRow.Cells("CAR_NAME").Value
        penalty.Carname = CarName
        penalty.CustomerName = DtgRentDetails.CurrentRow.Cells("FULL_NAME").Value

        Dim OverLappedRentDays As Integer = 0
        Dim RentExpiration As Date = CDate(DtgRentDetails.CurrentRow.Cells("RENT_DATE").Value)
        Dim OverLappedPenalty As Integer = 500
        Dim TotalOverLappedPenalty As Integer = 0

        OverLappedRentDays = Date.Now.Day - RentExpiration.Day
        TotalOverLappedPenalty = OverLappedRentDays * OverLappedPenalty

        If OverLappedRentDays > 0 Then
            MessageBox.Show(CarName & " has exceeded " & OverLappedRentDays & " days." & vbNewLine & _
                "As a result there is a penalty every day that it exceeds from the rent expiration date.", "Car rental system", MessageBoxButtons.OK, MessageBoxIcon.Warning)
            penalty.txttotal.Text = TotalOverLappedPenalty
            penalty.ShowDialog()

            Try
                Sql = "UPDATE tblrentdetails SET Returned = 1 WHERE ID=" & Me.Text
                conn.Open()
                With dbcmd
                    .CommandText = Sql
                    .Connection = conn
                End With

                result = dbcmd.ExecuteNonQuery
                If result > 0 Then
                    MsgBox("The " & DtgRentDetails.CurrentRow.Cells("CAR_NAME").Value & " has been returned.")
                    conn.Close()
                    Call Btnload_Click(sender, e)
                    cleartextfields()

                Else
                    MsgBox("No record has been deleted!")
                End If

            Catch ex As Exception
                MsgBox(ex.Message)
            Finally
                conn.Close()
            End Try

            Try
                Sql = "UPDATE tblcar SET STATUS = 'Available' WHERE CAR_NAME='" & CarName & "'"
                conn.Open()
                With dbcmd
                    .CommandText = Sql
                    .Connection = conn
                End With

                dbcmd.ExecuteNonQuery()
            Catch ex As Exception
                MsgBox(ex.Message)
            Finally
                conn.Close()
            End Try

        End If
    End Sub

End Class