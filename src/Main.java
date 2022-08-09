import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/java_lessons",
                    "root",
                    "2258");
            Statement statement = connection.createStatement();






//            ResultSet resultSet = statement.executeQuery(
//                    "Select * from persons"
//            );
//            while (resultSet.next()){
//                System.out.print(resultSet.getInt("id"));
//                System.out.print(" ");
//                System.out.print(resultSet.getString("name"));
//                System.out.print(" ");
//                System.out.print(resultSet.getInt("age"));
//                System.out.println();
//
//            }

//            String query = "CREATE TABLE ITEM("
//                    + "ID int NOT NULL," + "PRODUCT varchar(50)," + "PRIMARY KEY(ID))";
//            statement.execute(query);

            statement.executeUpdate("DELETE from persons where id = 4");


            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
