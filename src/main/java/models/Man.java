package models;

public class Man {

    private String name;
    private int age;

    public Man(){
        this.name = "Ivan";
    }

    public Man(String name){
        this.name = name;
    }

    public Man(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
