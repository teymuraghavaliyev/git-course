import java.sql.*;
import java.util.Scanner;

public class SecondMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Add new player:  ");
            System.out.println("enter name");
            String name = scan.next();
            System.out.println("enter team");
            String team = scan.next();
            System.out.println("enter number");
            Integer number = scan.nextInt();





        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/java_lessons",
                    "root",
                    "2258");
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "insert into players(name,team,number) values (?,?,?)"
            );
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,team);
            preparedStatement.setInt(3,number);

            System.out.println("added new player");



            ResultSet resultSet = statement.executeQuery(
                    "Select * from players"
            );
            while (resultSet.next()){
                System.out.print(resultSet.getInt("ID"));
                System.out.print(" ");
                System.out.print(resultSet.getString("NAME"));
                System.out.print(" ");
                System.out.print(resultSet.getString("TEAM"));
                System.out.print(" ");
                System.out.print(resultSet.getInt("NUMBER"));
                System.out.println();

            }

//            String query = "CREATE TABLE players("
//                    + "ID int NOT NULL," + "NAME varchar(50)," + "TEAM varchar(30)" +"NUMBER int NOT NULL" + "PRIMARY KEY(ID))";
//            statement.execute(query);




            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
