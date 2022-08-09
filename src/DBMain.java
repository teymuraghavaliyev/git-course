import javax.sound.midi.Soundbank;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBMain {
       private static final String URL = "jdbc:mysql://localhost:3306/java_lessons";
       private static final String USERNAME = "root";
       private static final String PASSWORD = "2258";

        public static void main(String[] args) throws SQLException {
            DBConnection dbConnection = new DBConnection();
            Connection connection = dbConnection.getConnection(URL,USERNAME,PASSWORD);

            Scanner scanner = new Scanner(System.in);
//INSERT

//            System.out.println("Enter name");
//            String name1 = scanner.nextLine();
//            System.out.println("Enter team");
//            String team1 = scanner.nextLine();
//            System.out.println("Enter number");
//            int number1 = scanner.nextInt();

//DELETE

//              System.out.println("enter id for delete ");
//              int id1 = scanner.nextInt();


//UPDATE

            System.out.println("Enter id for update");
            int id1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter name");
            String name1 = scanner.nextLine();
            System.out.println("Enter team");
            String team1 = scanner.nextLine();
            System.out.println("Enter number");
            int number1 = scanner.nextInt();




//INSERT
//        String insert = "insert into java_lessons.player (name,team,number) values (?,?,?)";
//        PreparedStatement preInsert = connection.prepareStatement(insert);
//        preInsert.setString(1,name1);
//        preInsert.setString(2,team1);
//        preInsert.setInt(3,number1);
//        preInsert.execute();

//DELETE
//            String delete = "delete from java_lessons.player where id=?";
//            PreparedStatement preDelete = connection.prepareStatement(delete);
//            preDelete.setInt(1,id1);
//         preDelete.executeUpdate();

//DELETE
            String update = "update java_lessons.player set name =?, team = ?, number = ? where id =?";
            PreparedStatement preUpdate = connection.prepareStatement(update);
            preUpdate.setInt(4,id1);
            preUpdate.setString(1,name1);
            preUpdate.setString(2,team1);
            preUpdate.setInt(3,number1);
            preUpdate.executeUpdate();







        String query = "Select * from java_lessons.player";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery(query);

        while (resultSet.next()){
            System.out.println(resultSet.getInt("id") +
                    " " + resultSet.getString("name")+
                    " " + resultSet.getString("team") +
                    " " + resultSet.getInt("number"));

        }

    }


}
