public class Main {

    public static void main(String[] args) {
        Accout subject = new Accout();
        Observer observer = new Show(subject);
        subject.addMoney(1000);
    }
}
