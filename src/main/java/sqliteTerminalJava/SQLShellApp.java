package sqliteTerminalJava;

import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteStatement;
import com.almworks.sqlite4java.SQLiteException;

public class SQLShellApp extends ShellApp {

    SQLiteConnection db;
    SQLiteStatement st;

    protected void begin() {
        System.out.println("SQL Shell Application");
        try {
          db = new SQLiteConnection();
          db.open(true);
        } catch (SQLiteException e) {
          System.out.println(e.toString());
        }
    }

    protected String getPrompt() {
        return ">";
    }

    protected String processInput(String input) {
        String returnValue = db.debug(input);
        return returnValue;
    }        

    protected void end() {
      db.dispose();
    }
}
