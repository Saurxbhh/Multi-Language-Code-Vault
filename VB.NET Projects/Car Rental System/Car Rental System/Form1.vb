Public Class Mainform
    Private DtRentDetails As New DataTable
    Private Today = Date.Now

    Public Sub LoadRentDetails()
        DtRentDetails = New DataTable
        Try
            Sql = "SELECT * FROM tblrentdetails  WHERE Returned = 0"
            conn.Open()
            With dbcmd
                .CommandText = Sql
                .Connection = conn
            End With

            dbda.SelectCommand = dbcmd
            dbda.Fill(DtRentDetails)

        Catch ex As Exception
            MsgBox(ex.Message)
        Finally
            conn.Close()
        End Try
    End Sub

    Public Sub CheckCarExpiry()
        Dim ExpiredCars As New List(Of String)
        Dim ExpiredCarMessage As String = "The " & vbNewLine
        Dim CarIndex = 1

        For Each Row As DataRow In DtRentDetails.Rows
            Dim RentExpiration As Date = CDate(Row.Item("RENT_DATE").ToString)
            If Date.Compare(RentExpiration, Today) < 0 Then
                ExpiredCars.Add(Row.Item("CAR_NAME"))
                ExpiredCarMessage &= CarIndex & ". " & Row.Item("CAR_NAME") & vbNewLine
            End If
            CarIndex += 1
        Next

        If Not ExpiredCars.Count.Equals(0) Then
            MessageBox.Show(ExpiredCarMessage & "has been expired!")
        End If
    End Sub

    Public Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        Timer1.Start()

        LoadRentDetails()
        If IsUserLoggedIn Then
            CheckCarExpiry()
        End If
    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Btncustomers.Click
        customers.Show()
    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Btncars.Click
        Cars.Show()
    End Sub

    Private Sub Button4_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Btnexit.Click
        Me.Close()
    End Sub

    Private Sub BookToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles BookToolStripMenuItem.Click
        Booking.Show()
    End Sub

    Private Sub RentDetailsToolStripMenuItem1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles RentDetailsToolStripMenuItem1.Click
        rentdetails.Show()
    End Sub

    Private Sub Btnlogin_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Btnlogin.Click
        Login.Show()
        If Btnlogin.Text = "Log Out" Then
            Login.Show()
            Btnlogin.Text = ""
            Label2.Text = Nothing
            Label3.Text = Nothing
            Booking.Txtprocess.Text = ""
            Btncustomers.Enabled = False
            Btncars.Enabled = False
            Btnexit.Enabled = False
            MenuStrip1.Enabled = False

            IsUserLoggedIn = False
        End If

    End Sub

    Private Sub btnadmin_Click(ByVal sender As System.Object, ByVal e As System.EventArgs)
        Addadmin.Show()
    End Sub

    Private Sub Timer1_Tick(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Timer1.Tick
        Label4.Text = DateTime.Now
    End Sub

    Private Sub HistoryToolStripMenuItem_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles HistoryToolStripMenuItem.Click
        History.Show()
    End Sub
End Class
