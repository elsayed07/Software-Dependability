package logger;

/**
 *
 * @author Mohammad Dehghan
 */
public class LogFactory {

    public static Logger getLogger(String type) {
        if (type.equalsIgnoreCase("db") || type.equalsIgnoreCase("database")) {
            return new DBLogger();
        } else {
            return new FileLogger();
        }
    }
}
