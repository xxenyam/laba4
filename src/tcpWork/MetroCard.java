package tcpWork;

import java.io.Serializable;

public class MetroCard implements Serializable {
    private String serNum;
    private double balance;
    private User usr;
    private String colledge;

    // Конструктор за замовчуванням
    public MetroCard() {
        this.serNum = "";
        this.balance = 0.0;
        this.usr = null;
        this.colledge = "";
    }

    // Геттери та сеттери
    public String getSerNum() {
        return serNum;
    }

    public void setSerNum(String serNum) {
        this.serNum = serNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getUsr() {
        return usr;
    }

    public void setUsr(User usr) {
        this.usr = usr;
    }

    public String getColledge() {
        return colledge;
    }

    public void setColledge(String colledge) {
        this.colledge = colledge;
    }

    // Перевизначення методу toString
    @Override
    public String toString() {
        return "No: " + serNum + "\nUser: " + usr + "\nColledge: " + colledge + "\nBalance: " + balance;
    }
}

