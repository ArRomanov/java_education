import friends.Friend;
import friends.Man;
import friends.Woman;
import teachers.EconomicTeacher;
import teachers.PhysicTeacher;

public class Main {
    public static void main(String[] args) {
        EconomicTeacher economicTeacher = new EconomicTeacher("Mary", "Economic");
        PhysicTeacher physicTeacher = new PhysicTeacher("Igor", "Physic");

        economicTeacher.checkHomework();
        physicTeacher.checkHomework();

        economicTeacher.spendParentMeet();
        physicTeacher.spendParentMeet();

        economicTeacher.whatIsObject();
        physicTeacher.whatIsObject();

        economicTeacher.tellAboutEconomic();
        physicTeacher.tellAboutPhysic();


        // Все классы в java наследуются от класса Object и, соответственно, имеют те же методы
        System.out.println(economicTeacher.toString());
        System.out.println(physicTeacher.toString());

        System.out.println(economicTeacher.equals(physicTeacher));
        System.out.println(economicTeacher.equals(economicTeacher));



        //Интерфейсы
        System.out.println("\nИнтерфейсы\n");

        Man justMan = new Man();
        Friend friendMan = new Man();
        Woman justWoman = new Woman();
        Friend friendWoman = new Woman();
        // Все, кто реализует интерфейс друга могут делать все, что мы ожидаем от друга
        beFriendWithPerson(justMan);
        beFriendWithPerson(friendMan);
        beFriendWithPerson(justWoman);
        beFriendWithPerson(friendWoman);

        // Те, от кого мы не ожидаем дружеского поведения (не ожидаем интерфейса Friend) все равно могут выполнять дружеские методы
//        goToBarWithMan(friendMan); //Если на вход ожидается тип Man, то сюда не сможет попасть friendMan, несмотря на то, что он мужчина, потому что он в первую очередь друг (Friend)
        goToBarWithMan(justMan);
//        goToBarWithWomen(friendWoman); //Если на вход ожидается тип Woman, то сюда не сможет попасть friendWoman, несмотря на то, что она женщина, потому что она в первую очередь друг (Friend)
        goToBarWithWomen(justWoman);


    }

    public static void beFriendWithPerson(Friend person){
        person.goToBar();
        person.askMoney();
        person.offerMoney(100);
    }

    public static void goToBarWithMan(Man person){
        person.shaveFace();
        person.goToBar();
    }

    public static void goToBarWithWomen(Woman person){
        person.doMakeUp();
        person.goToBar();
    }
}
