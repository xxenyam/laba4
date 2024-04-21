package tcpWork;

// Клас, який представляє операцію відображення балансу на картці
public class ShowBalanceOperation extends CardOperation {
    private String serNum; // Серійний номер картки, для якої потрібно показати баланс

    // Конструктор
    public ShowBalanceOperation(String serNum) {
        this.serNum = serNum;
    }

    // Методи доступу до серійного номера картки
    public String getSerNum() {
        return serNum;
    }

    public void setSerNum(String serNum) {
        this.serNum = serNum;
    }
}
