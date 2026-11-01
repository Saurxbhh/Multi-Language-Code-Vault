Public Class History

    Private Sub ComboBox1_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles ComboBox1.SelectedIndexChanged
        If ComboBox1.Text = "Rent Details" Then
            dbdt = New DataTable
            Try
                Sql = "SELECT * FROM tblrentdetails "
                conn.Open()
                With dbcmd
                    .CommandText = Sql
                    .Connection = conn
                End With

                dbda.SelectCommand = dbcmd
                dbda.Fill(dbdt)
                DataGridView1.DataSource = dbdt
                Label4.Text = Nothing
            Catch ex As Exception
                MsgBox(ex.Message)
            Finally
                conn.Close()
            End Try

        ElseIf ComboBox1.Text = "Booking List" Then
            dbdt = New DataTable
            Try
                Sql = "SELECT * FROM tblrentcar"
                conn.Open()
                With dbcmd
                    .CommandText = Sql
                    .Connection = conn
                End With

                dbda.SelectCommand = dbcmd
                dbda.Fill(dbdt)
                DataGridView1.DataSource = dbdt
                Dim TotalMoto = 0
                Dim TotalSales = 0
                For Each Row As DataRow In dbdt.Rows
                    TotalSales += Val(Row.Item("TOTAL"))
                Next
                Label4.Text = TotalSales
            Catch ex As Exception
                MsgBox(ex.Message)
            Finally
                conn.Close()
            End Try
        ElseIf ComboBox1.Text = "Penalty List" Then
            dbdt = New DataTable
            Try
                Sql = "SELECT * FROM tblpenalty"
                conn.Open()
                With dbcmd
                    .CommandText = Sql
                    .Connection = conn
                End With

                dbda.SelectCommand = dbcmd
                dbda.Fill(dbdt)
                DataGridView1.DataSource = dbdt
                Dim TotalMoto = 0
                Dim TotalSales = 0
                For Each Row As DataRow In dbdt.Rows
                    TotalSales += Val(Row.Item("PENALTY"))
                Next
                Label4.Text = TotalSales
            Catch ex As Exception
                MsgBox(ex.Message)
            Finally
                conn.Close()
            End Try
        End If
    End Sub
End Class