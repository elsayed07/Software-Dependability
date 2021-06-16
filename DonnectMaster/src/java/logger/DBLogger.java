package logger;

import java.sql.SQLException;
import java.util.ArrayList;
import db.DB;

/**
 *
 * @author Mohammad Dehghan
 */
public class DBLogger implements Logger {

    @Override
    public void log(String ssn, String description) throws SQLException {
        DB.getDB().statement.execute("insert into logs (ssn, date, description)"
                + " values ('" + ssn + "', now(), '" + description + "')");
    }

    @Override
    public ArrayList<ArrayList<String>> showLogs(String startDate, String endDate) {
        return null;
    }

}
