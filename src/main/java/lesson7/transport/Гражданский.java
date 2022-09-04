package lesson7.transport;

public class Гражданский extends Воздушный {

    private int numberPassengers;
    private boolean businessClass;


    public Гражданский(int power, int maxSpeed, String brand, int wingspan, int minRunwayLength, int numberPassengers, boolean businessClass) {
        super(power, maxSpeed, brand, wingspan, minRunwayLength);
        this.numberPassengers = numberPassengers;
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return "Гражданский {" + "power = " + getPower() + " horsepower, powerInKW = " + powerInKW() + ", powerInKW = "
                + powerInKW() + ", maxSpeed = " + getMaxSpeed() + ", brand = '" + getBrand() + "', wingspan = " + getWingspan() +
                " m, minRunwayLength = " + getMinRunwayLength() + " m, numberPassengers = " + numberPassengers + ", businessClass = " + businessClass + '}';
    }

    public void checkNumberPassengers(int passengers) {
        if (passengers <= numberPassengers) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}