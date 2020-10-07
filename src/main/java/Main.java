import models.Man;
import models.User;

public class Main {
    public static void main(String[] args) {
        Man man1 = new Man("Vasiliy");
        System.out.println(man1.getName());
        System.out.println(man1.getAge());

        Man man2 = new Man();
        System.out.println(man2.getName());
        System.out.println(man2.getAge());

        Man man3 = new Man("Andrey", 30);
        System.out.println(man3.getName());
        System.out.println(man3.getAge());


        User user = new User();
        user.setEmail("kek@lol");
    }
}
