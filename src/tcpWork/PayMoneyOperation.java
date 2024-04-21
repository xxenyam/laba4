package tcpWork;

// Клас, який представляє операцію оплати поїздки на метро
public class PayMoneyOperation extends CardOperation {
    private String serNum; // Серійний номер картки, з якої будуть зняті кошти
    private double money; // Сума коштів для оплати

    // Конструктор
    public PayMoneyOperation(String serNum, double money) {
        this.serNum = serNum;
        this.money = money;
    }

    // Методи доступу до серійного номера картки та суми коштів для оплати
    public String getSerNum() {
        return serNum;
    }

    public void setSerNum(String serNum) {
        this.serNum = serNum;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
