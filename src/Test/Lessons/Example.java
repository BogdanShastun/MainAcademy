package Test.Lessons;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Example {
  private static String DB_NAME = "jdbc:mysql://localhost/mydbtest";
  private static String DB_LOGIN = "root";
  private static String DB_PASSWORD = "1111";
  private static String INSERT_1 = "insert into students (firstname, lastname, age) " +
      "values ('Mike', 'Fisher', 29)";

  private static String INSERT_2 = "insert into students (firstname, lastname, age, email) " +
      "values ('Nikola', 'Pazolini', 66, 'mmm@gmail.com');";
  private static String DELETE = "delete from students where firstname='Fisher';";
  private static String INSERT_3 = "insert into students (\n" +
      "firstname, lastname, age) \n" +
      "values ( 'Mike', 'Fisher', 29), ( 'Markus', 'Bad', 33 );";

  public static void main(String[] args) {
    try {

      Class.forName("com.mysql.jdbc.Driver").newInstance();

      Connection connection = DriverManager.getConnection(DB_NAME, DB_LOGIN, DB_PASSWORD);
      Statement statement = connection.createStatement();

      statement.execute(INSERT_3);
      //statement.executeUpdate(INSERT_2);
      //statement.execute(DELETE);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}