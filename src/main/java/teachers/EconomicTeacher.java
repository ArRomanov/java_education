package teachers;

public class EconomicTeacher extends TeacherBase {

    // Учитель создается через родительский конструктор
    public EconomicTeacher(String name, String object) {
        super(name, object);
    }

    // Рассказать об экономике может только учитель экономики
    public void tellAboutEconomic(){
        System.out.println("Economic is good");
    }

    // Все методы родительского класса как бы появляются здесь (наследуются), но мы их не видим


}
