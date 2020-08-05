package friends;

public class Woman implements Friend {
    public final String GENDER = "Female";

    public void doMakeUp() {
        System.out.println("I'm doing makeup");
    }

    @Override
    public void goToBar() {
        System.out.println("Go to bar very quite until 6:00PM");
    }

    @Override
    public void offerMoney(int money) {
        System.out.println("I will buy new dress on " + money + "$");
    }

    @Override
    public int askMoney() {
        return 100;
    }
}
