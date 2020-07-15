package students;

import java.util.ArrayList;

public class Student {
    private String name;
    private String country;
    private ArrayList<String> objects = new ArrayList<>();

    public Student(String name, String country){
        this.name = name;
        this.country = country;
    }

    public void meetInAirport(String time) {
        System.out.println("Student was met in " + time + "from" + country);
    }

    public void transferToHotel(String hotel) {
        System.out.println("Student was transfered in " + hotel);
    }

    public void teach(String lesson) {
        objects.add(lesson);
    }

    public int getMoney() {
        int finalMoney = objects.size() * 100;
        return finalMoney;
    }

    public void goToHome() {
        System.out.println("Student " + name + "went home");
    }

    public void showKnowledge() {
        System.out.println("I learned:");
        for (String object : objects) {
            System.out.println(object);
        }
    }
}
