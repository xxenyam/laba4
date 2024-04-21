package tcpWork;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User implements Serializable {
    private static final DateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
    private static final DateFormat dateParser = dateFormatter;
    private String name;
    private String surName;
    private String sex;
    private Date birthday;

    // Конструктор з параметрами
    public User(String name, String surName, String sex, String birthday) {
        this.name = name;
        this.surName = surName;
        this.sex = sex;
        try {
            this.birthday = dateParser.parse(birthday);
        } catch (ParseException ex) {
            System.out.println("Error: " + ex);
        }
    }

    // Геттери та сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    // Перевизначення методу toString
    @Override
    public String toString() {
        return name + " " + surName + " " + sex + " " + dateFormatter.format(birthday);
    }
}
