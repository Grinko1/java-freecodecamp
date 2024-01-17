package base.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();
        car.stop();
        Bycycle bycycle = new Bycycle();
        bycycle.stop();
        System.out.println( bycycle.wheels);
    }
}
