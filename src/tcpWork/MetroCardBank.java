package tcpWork;

import java.util.ArrayList;
import java.util.List;

public class MetroCardBank {
    private List<MetroCard> store;
    public List<MetroCard> getStore() {
        return store;
    }
    // Конструктор
    public MetroCardBank() {
        this.store = new ArrayList<>();
    }

    // Метод для пошуку пластикової картки за серійним номером
    public int findMetroCard(String serNum) {
        for (int i = 0; i < store.size(); i++) {
            MetroCard card = store.get(i);
            if (card.getSerNum().equals(serNum)) {
                return i; // Повертаємо індекс картки у списку
            }
        }
        return -1; // Якщо картка з даним серійним номером не знайдена
    }

    // Метод, що повертає кількість зареєстрованих пластикових карток
    public int numCards() {
        return store.size();
    }

    // Метод, який додає пластикову картку до сховища
    public void addCard(MetroCard newCard) {
        store.add(newCard);
    }

    // Метод, який видаляє картку за серійним номером
    public boolean removeCard(String serNum) {
        int index = findMetroCard(serNum);
        if (index != -1) {
            store.remove(index);
            return true;
        }
        return false;
    }

    // Метод поповнення рахунку для пластикової картки за серійним номером
    public boolean addMoney(String serNum, double money) {
        int index = findMetroCard(serNum);
        if (index != -1) {
            MetroCard card = store.get(index);
            double currentBalance = card.getBalance();
            card.setBalance(currentBalance + money);
            return true;
        }
        return false;
    }

    // Метод оплати поїздки для пластикової картки за серійним номером
    public boolean getMoney(String serNum, double money) {
        int index = findMetroCard(serNum);
        if (index != -1) {
            MetroCard card = store.get(index);
            double currentBalance = card.getBalance();
            if (currentBalance >= money) {
                card.setBalance(currentBalance - money);
                return true;
            }
        }
        return false;
    }

    // Перевизначення методу toString
    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder("List of MetroCards:");
        for (MetroCard c : store) {
            buf.append("\n\n").append(c);
        }
        return buf.toString();
    }
}
