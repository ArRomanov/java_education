package teachers;

public class PhysicTeacher extends TeacherBase {

    // Учитель создается через родительский конструктор
    public PhysicTeacher(String name, String object) {
        super(name, object);
    }

    // Рассказать о физике может только учитель физики
    public void tellAboutPhysic(){
        System.out.println("Physic is good");
    }

    // Все методы родительского класса как бы появляются здесь (наследуются), но мы их не видим
}
