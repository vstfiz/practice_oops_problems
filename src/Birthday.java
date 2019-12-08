import Connection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Birthday {
    public void wishBirthday() throws SQLException, ClassNotFoundException {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Current Month: ");
        int currentMonth = scanner.nextInt();
        scanner.nextLine();
        Connection connection = databaseConnection.getConnection();
        for (int i = 0 ; i<1;i++){
            System.out.print("Enter friend name : ");
            String name = scanner.nextLine();
            System.out.print("Enter DOB of friend(DD-MM-YYYY) : ");
            String dob = scanner.nextLine();
            PreparedStatement p = connection.prepareStatement("insert into bday values(?,?);");
            p.setString(1,name);
            p.setString(2,dob);
            p.executeUpdate();
        }
        PreparedStatement s = connection.prepareStatement("select * from bday");
        ResultSet r = s.executeQuery();
        while (r.next()){
            if(Integer.parseInt(r.getString(2).substring(3,5)) > currentMonth){
                System.out.println("Happy Birthday, "+r.getString(1)+"!");
            }
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Birthday birthday = new Birthday();
        birthday.wishBirthday();
    }
}