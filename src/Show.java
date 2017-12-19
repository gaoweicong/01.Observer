public class Show implements Observer {
    private Accout accout;

    public Show(Accout accout) {
        this.accout = accout;
        this.accout.initObserver(this);
    }

    @Override
    public void update() {
        double money = this.accout.getMoney();
        System.out.println("观察者1:::" + money);
    }
}
