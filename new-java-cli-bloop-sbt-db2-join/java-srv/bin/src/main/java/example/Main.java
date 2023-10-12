package example;

import org.apache.log4j.PropertyConfigurator;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class Main {

  public static void main(String[] args) {
    final String username = System.getenv("DB_USERNAME");
    final String password = System.getenv("DB_PASSWORD");
    final String driver = System.getenv("DB_DRIVER");
    final String connectionStr = System.getenv("DB_CONNECTION_STR") + "/" + System.getenv("DB_SCHEMA");

    String PWD = System.getenv("PWD");
    PropertyConfigurator.configure(PWD + "/src/main/resources/log4j.xml");

    example.dto.Dog dog = new example.dto.Dog(driver, username, password, connectionStr);
    dog.operation("00", example.dto.SQLOPT.CREATE);
    dog.operation("01", example.dto.SQLOPT.INDEX);
    dog.operation("02", example.dto.SQLOPT.INSERT);
    dog.operation("03", example.dto.SQLOPT.CREATE);
    dog.operation("04", example.dto.SQLOPT.INSERT);
    dog.operation("05", example.dto.SQLOPT.CREATE);
    dog.operation("06", example.dto.SQLOPT.INSERT);
    dog.operation("07", example.dto.SQLOPT.CREATE);

    example.db.print.output.IOutput output = new example.db.print.output.ToConsole();
    for ( String tbl : new String[]{"dog","breedLookup","colorLookup", "dog_expanded"})
      example.db.DBQuery.query(username, password, connectionStr, tbl, output);

  }
}
