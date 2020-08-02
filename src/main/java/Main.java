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
    }
}
