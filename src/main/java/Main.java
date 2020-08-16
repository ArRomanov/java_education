import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person someMan = new Person("Ivan", 31);
        Person someWoman = new Person("Maria", 22);


//        Распечатываем переменную до расчета года рождения
        System.out.println("Распечатываем переменную до расчета года рождения");
        System.out.println(someMan.wasBorn);
        System.out.println(someWoman.wasBorn);

        System.out.println("Вызов методов без return, в том числе и расчет года рождения");
        someMan.printName();
        someMan.countYearBorn();
        someWoman.printName();
        someWoman.countYearBorn();

//        Выводим в консоль рассчитанный год рождения
        System.out.println("Выводим в консоль рассчитанный год рождения");
        System.out.println(someMan.wasBorn);
        System.out.println(someWoman.wasBorn);

//        Создали переменные и присвоили в них значения рассчитанных годов рождения  из public переменных класса
        System.out.println("Создали переменные и присвоили в них значения рассчитанных годов рождения  из public переменных класса");
        int wasBornManLocal = someMan.wasBorn;
        int wasBornWomanLocal = someWoman.wasBorn;

        System.out.println("Распечатали созданные локальные переменные");
        System.out.println(wasBornManLocal);
        System.out.println(wasBornWomanLocal);

        System.out.println("Получение значений из методов с return");
        String manNameLocal = someMan.getName();
        int ageManLocal = someMan.getAge();
        String womanNameLocal = someWoman.getName();
        int ageWomanLocal = someWoman.getAge();

        System.out.println("...и выводим полученные из return методов значения, если необходимо.");
        System.out.println(manNameLocal);
        System.out.println(ageManLocal);
        System.out.println(womanNameLocal);
        System.out.println(ageWomanLocal);





    }


}
