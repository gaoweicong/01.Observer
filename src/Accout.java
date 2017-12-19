import java.util.ArrayList;
import java.util.List;

public class Accout implements Subject {
    private double money;
    private List<Observer> list = new ArrayList<>();

    public double getMoney() {
        return money;
    }

    public void addMoney(double money) {
        this.money += money;
        notifyObserver();
    }

    @Override
    public void initObserver(Observer ob) {
        list.add(ob);
    }

    @Override
    public void notifyObserver() {
        for (Observer ob : list) {
            ob.update();
        }
    }

    @Override
    public void removeObserver(Observer ob) {
        list.remove(ob);
    }
}
