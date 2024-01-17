package base.copy_object;

public class Car {
    private String model;
    private String make;
    private int year;

    public Car(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }
    public Car(Car car) {
        this.copy(car);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void copy(Car car){
    this.setMake(car.getMake());
    this.setYear(car.getYear());
    this.setModel(car.getModel());
    }
}
