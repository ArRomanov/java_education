import java.time.LocalDate;

public class Person {

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int wasBorn;
    private int age;
    private String name;

    public void printName(){
        System.out.println("My name is " + name);
    }

//    геттер для переменной name
    public String getName(){
        return name;
    }

//    сеттер для переменной name
    public void setName(String name){
        this.name = name;
    }

//    метод просто считает год рождения и устанавливает значение в wasBorn
    public void countYearBorn(){
        int nowYear = LocalDate.now().getYear();
        wasBorn = nowYear - age;
    }

//    геттер для age
    public int getAge(){
        return age;
    }
}
