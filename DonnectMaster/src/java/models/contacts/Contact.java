package models.contacts;

import exceptions.InfoException;
import java.sql.Date;
import java.util.Objects;
import services.Validator;

/**
 *
 * @author Mohammad
 */
public class Contact implements Comparable<Contact> {

    private int id;

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    private String name;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     * @throws exceptions.InfoException
     */
    public void setName(String name) throws InfoException {
        if (!Validator.isEmpty(name)) {
            this.name = name;
        } else {
            throw new InfoException("Correct your first name...");
        }
    }

    private String family;

    /**
     * Get the value of family
     *
     * @return the value of family
     */
    public String getFamily() {
        return family;
    }

    /**
     * Set the value of family
     *
     * @param family new value of family
     * @throws exceptions.InfoException
     */
    public void setFamily(String family) throws InfoException {
        if (!Validator.isEmpty(family)) {
            this.family = family;
        } else {
            throw new InfoException("Correct your last name...");
        }
    }

    private String nick;

    /**
     * Get the value of nick
     *
     * @return the value of nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * Set the value of nick
     *
     * @param nick new value of nick
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    private String email;

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     * @throws exceptions.InfoException
     */
    public void setEmail(String email) throws InfoException {
        if (!Validator.isEmpty(email) && Validator.isEmailValid(email)) {
            this.email = email;
        } else {
            throw new InfoException("Correct your email address...");
        }
    }

    private String mobile1;

    /**
     * Get the value of mobile1
     *
     * @return the value of mobile1
     */
    public String getMobile1() {
        return mobile1;
    }

    /**
     * Set the value of mobile1
     *
     * @param mobile1 new value of mobile1
     * @throws exceptions.InfoException
     */
    public void setMobile1(String mobile1) throws InfoException {
        if (!Validator.isEmpty(mobile1) && Validator.isMobileValid(mobile1)) {
            this.mobile1 = mobile1;
        } else {
            throw new InfoException("Correct your mobile number...");
        }
    }

    private String mobile2;

    /**
     * Get the value of mobile2
     *
     * @return the value of mobile2
     */
    public String getMobile2() {
        return mobile2;
    }

    /**
     * Set the value of mobile2
     *
     * @param mobile2 new value of mobile2
     */
    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    private String mobile3;

    /**
     * Get the value of mobile3
     *
     * @return the value of mobile3
     */
    public String getMobile3() {
        return mobile3;
    }

    /**
     * Set the value of mobile3
     *
     * @param mobile3 new value of mobile3
     */
    public void setMobile3(String mobile3) {
        this.mobile3 = mobile3;
    }

    private String home;

    /**
     * Get the value of home
     *
     * @return the value of home
     */
    public String getHome() {
        return home;
    }

    /**
     * Set the value of home
     *
     * @param home new value of home
     */
    public void setHome(String home) {
        this.home = home;
    }

    private String work;

    /**
     * Get the value of work
     *
     * @return the value of work
     */
    public String getWork() {
        return work;
    }

    /**
     * Set the value of work
     *
     * @param work new value of work
     */
    public void setWork(String work) {
        this.work = work;
    }

    private String other;

    /**
     * Get the value of other
     *
     * @return the value of other
     */
    public String getOther() {
        return other;
    }

    /**
     * Set the value of other
     *
     * @param other new value of other
     */
    public void setOther(String other) {
        this.other = other;
    }

    private String address;

    /**
     * Get the value of address
     *
     * @return the value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the value of address
     *
     * @param address new value of address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    private Date birthday;

    /**
     * Get the value of birthday
     *
     * @return the value of birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Set the value of birthday
     *
     * @param birthday new value of birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private String note;

    /**
     * Get the value of note
     *
     * @return the value of note
     */
    public String getNote() {
        return note;
    }

    /**
     * Set the value of note
     *
     * @param note new value of note
     */
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public int compareTo(Contact o) {
        if (Contacts.sort_type == Contacts.SORT_TYPE.FIRST_NAME) {
            return this.name.compareTo(o.name);
        } else {
            return this.family.compareTo(o.family);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contact c = (Contact) o;
        return this.mobile1.equals(c.mobile1);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.mobile1);
        return hash;
    }
}
