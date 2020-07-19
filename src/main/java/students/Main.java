package students;

public class Main {
    public static void main(String[] args) {
//        Создание студентов
        Student firstStudent = new Student("Peter", "England");
        Student secondStudent = new Student("Andrew", "France");

//        Создание учителей
        Teacher economicTeacher = new Teacher("Alex", "Economic");
        Teacher managementTeacher = new Teacher("Svetlana", "Management");
        Teacher lowTeacher = new Teacher("Petr", "Low");

//        Обучение студентов учителями разных предметов
        lowTeacher.teachStudent(firstStudent);
        lowTeacher.teachStudent(secondStudent);
        economicTeacher.teachStudent(firstStudent);
        managementTeacher.teachStudent(secondStudent);

//        Проверка знаний студентов учителями
        System.out.println("Teachers check knowledge");
        lowTeacher.checkKnowledge(firstStudent);
        lowTeacher.checkKnowledge(secondStudent);

//        Проверка знаний у студентов напрямую
        System.out.println("We check knowledge");
        firstStudent.showKnowledge();
        secondStudent.showKnowledge();

//        Взять со студента деньги
        int firstStudentMoney = firstStudent.getMoney();
        System.out.println("Student " + firstStudent.name + " payed " + firstStudentMoney);
        int secondStudentMoney = secondStudent.getMoney();
        System.out.println("Student " + secondStudent.name + " payed " + secondStudentMoney);


    }
}
