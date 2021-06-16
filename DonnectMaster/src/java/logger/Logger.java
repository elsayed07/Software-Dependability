package logger;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Dehghan
 */
public interface Logger {

    void log(String ssn, String description) throws Exception;

    ArrayList<ArrayList<String>> showLogs(String startDate, String endDate);
}
