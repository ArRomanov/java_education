import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car firstCar = new Car(1.6);
        Car secondCar = new Car(3.2);

        firstCar.speedUp();
        firstCar.getBreak();

        secondCar.speedUp();
        secondCar.getBreak();

        if (firstCar.maxSpeed > secondCar.maxSpeed) {
            System.out.println("Скорость первой машины больше скорости второй машины");
        }
    }
}
