package friends;

public class Man implements Friend {
    public final String GENDER = "Male";

    public void shaveFace() {
        System.out.println("I'm shaving my face");
    }

    @Override
    public void goToBar() {
        System.out.println("Go to bar very noise until 6:00AM");
    }

    @Override
    public void offerMoney(int money) {
        System.out.println("I will buy sony playstation on " + money + "$");
    }


    @Override
    public int askMoney() {
        return 0;
    }
}
