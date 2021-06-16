package models.contacts;

import java.util.ArrayList;
import db.DB;
import exceptions.InfoException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Mohammad
 */
public class Contacts extends ArrayList<Contact> {

    public static enum SORT_TYPE {
        FIRST_NAME,
        LAST_NAME
    }

    public static enum DISPLAY_TYPE {
        FIRST_LAST,
        LAST_FIRST
    }

    public static SORT_TYPE sort_type = SORT_TYPE.FIRST_NAME;
    public static DISPLAY_TYPE display_type = DISPLAY_TYPE.FIRST_LAST;

    public static ArrayList<Contact> fetchContacts() throws SQLException, InfoException {
        ArrayList<Contact> cs = new ArrayList<>();
        Contact c;
        ResultSet rs = DB.getDB().statement.executeQuery("SELECT * FROM divice.people;");
        while (rs.next()) {
            c = new Contact();
            c.setId(rs.getInt("id"));
            c.setName(rs.getString("name"));
            c.setFamily(rs.getString("family"));
            c.setNick(rs.getString("nick"));
            c.setMobile1(rs.getString("mobile1"));
            c.setMobile2(rs.getString("mobile2"));
            c.setMobile3(rs.getString("mobile3"));
            c.setHome(rs.getString("home"));
            c.setWork(rs.getString("work"));
            c.setOther(rs.getString("other"));
            c.setAddress(rs.getString("address"));
            c.setEmail(rs.getString("email"));
            c.setBirthday(rs.getDate("birthday"));
            c.setNote(rs.getString("note"));
            cs.add(c);
        }
        return cs;
    }

    public static boolean addNewContact(Contact c) {
        boolean b = false;
        //
        return b;
    }

    public static boolean removeContact(int id) {
        boolean b = false;
        //
        return b;
    }

    public static ArrayList<Contact> searchByName(String input) {
        ArrayList<Contact> cs = new ArrayList<>();
        // Retrieve from db
        // Search in first names, last names and nick names
        return cs;
    }

    public static ArrayList<Contact> searchByNumber(String input) {
        ArrayList<Contact> cs = new ArrayList<>();
        // Retrieve from db
        // Search in mobile1, mobile2, mobile3, home, work, other
        return cs;
    }
}
