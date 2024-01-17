package base.polimorphizm;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Bicycle bicycle = new Bicycle();

        Vehicle[] racers = {car, boat, bicycle};
        for (Vehicle racer : racers) {
            racer.go();

        }

    }
}
