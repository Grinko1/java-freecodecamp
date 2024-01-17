package base.parsing_object;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car = new Car("BMW");
        Car car2 = new Car("Honda");

        garage.park(car);
        garage.park(car2);

    }
}
