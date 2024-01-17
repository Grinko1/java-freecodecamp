package base.copy_object;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Solaris", "Hunday", 2020);
        Car car2 = new Car("Accord", "Honda", 2022);
        Car car3 = new Car(car2);
        car2.copy(car);
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println();
        System.out.println(car.getMake());
        System.out.println(car2.getMake());
        System.out.println(car3.getMake());
    }
}
