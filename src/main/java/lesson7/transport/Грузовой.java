package lesson7.transport;

public class Грузовой extends Наземный {

    private int loadCapacity;

    public Грузовой(int power, int maxSpeed, String brand, int wheels, int fuelConsumptionFor100km, int loadCapacity) {
        super(power, maxSpeed, brand, wheels, fuelConsumptionFor100km);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Грузовой {" + "power = " + getPower() + " horsepower, powerInKW = " + powerInKW() + ", maxSpeed = " + getMaxSpeed() +
                " km/h, brand ='" + getBrand()+'\''+ ", wheels = " + getWheels() +
                ", fuelConsumptionFor100km = " + getFuelConsumptionFor100km() +" l, loadCapacity = " + loadCapacity +'}';
    }

    public void cargoVolume(int tonnage) {
        if (tonnage <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}