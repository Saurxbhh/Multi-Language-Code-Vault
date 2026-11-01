Public Class penalty
    Public Carname = ""
    Public CustomerName = ""

    Private Sub Btnokay_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Btnokay.Click
        Try
            Sql = "UPDATE tblrentcar SET TOTAL = TOTAL + " & Val(txttotal.Text) & " WHERE CAR_NAME ='" & Carname & "' AND FULL_NAME ='" & CustomerName & "'"
            conn.Open()
            With dbcmd
                .CommandText = Sql
                .Connection = conn
            End With

            result = dbcmd.ExecuteNonQuery
            If result > 0 Then
                MsgBox("Penalty has been paid")
                conn.Close()
            Else
                MsgBox("Nothing has been paid!")
            End If

        Catch ex As Exception
            MsgBox(ex.Message)
        Finally
            conn.Close()
        End Try


        Try
            Sql = "INSERT INTO tblpenalty(FULL_NAME,PENALTY,PROCESSED_BY) VALUES ('" & CustomerName & "','" & txttotal.Text & "','" & Mainform.Label3.Text & "')"
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

        payment.Btnreceipt.PerformClick()
        Me.Close()

    End Sub

    Private Sub txtchange_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtchange.TextChanged
        If Val(txtchange.Text) < 0 Then
            txtchange.Text = 0
        End If
    End Sub

    Private Sub txtamountreceived_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtamountreceived.TextChanged
        txtchange.Text = Val(txtamountreceived.Text) - Val(txttotal.Text)
    End Sub
End Class