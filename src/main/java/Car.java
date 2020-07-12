public class Car {

    public static void wishCar(){
        System.out.println("I wish car");
    }

    public Car(double engVolume) {
        this.engVolume = engVolume;
        maxSpeed = engVolume * 100;
        System.out.println("Создана машина с объемом двигателя " + engVolume);
    }

    private double engVolume;
    private String transmission;
    private int year;
    private String color;
    private double speed = 0;
    public double maxSpeed;

    public void speedUp() throws InterruptedException {
        System.out.println("Ускоряемся!");
        while (true) {
            System.out.println(speed);
            speed = speed + engVolume * 10;
            Thread.sleep(500);
            if (speed >= maxSpeed) {
                break;
            }
        }

    }

    public void getBreak() throws InterruptedException {
        System.out.println("Тормозим!");
        while (true) {
            System.out.println(speed);
            speed = speed - engVolume * 20;
            Thread.sleep(500);
            if (speed <= 0) {
                speed = 0;
                break;
            }
        }
    }

    public void turnOn(String where) {
        System.out.println("Машина повернула " + where);
    }

    public double getCurrentSpeed() {
        return speed;
    }

}
