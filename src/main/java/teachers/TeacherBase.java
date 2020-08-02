package teachers;

public class TeacherBase {
//Общий класс учителя (родительский)

    //Все учителя имеют имя и предмет
    public TeacherBase(String name, String object) {
        this.name = name;
        this.object = object;
    }

    public String name;
    public String object;

    //Все учителя умеют делать эти действия:

    public void checkHomework() {
        System.out.println(name + ": I have checked homework");
    }

    public void spendParentMeet() {
        System.out.println(name + ": I have spent parent meet");
    }

    public void whatIsObject(){
        System.out.println("My object is " + object);
    }

}
