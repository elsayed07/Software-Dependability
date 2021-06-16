package db;

import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author Mohammad
 */
public class DB {

    private Connection con = null;
    public Statement statement = null;
    private static DB db;

    private DB() {
        try {
            // load required libraries
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            // create a connection to database
            con = DriverManager.getConnection(Config.DB_SERVER + "" + Config.DB_DATABASE + "?user=" + Config.DB_USER + "&password=" + Config.DB_PASSWORD);
            statement = con.createStatement();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static DB getDB() {
        if (db == null) {
            db = new DB();
        }
        return db;
    }
}
