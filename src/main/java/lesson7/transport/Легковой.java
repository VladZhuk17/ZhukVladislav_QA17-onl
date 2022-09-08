package lesson7.transport;

public class Легковой extends Наземный {

    private String typeBody;
    private int numberPassengers;

    public Легковой(int power, int maxSpeed, String brand, int wheels, int fuelConsumptionFor100km, String typeBody, int numberPassengers) {
        super(power, maxSpeed, brand, wheels, fuelConsumptionFor100km);
        this.typeBody = typeBody;
        this.numberPassengers = numberPassengers;
    }
    @Override
    public String toString() {
        return "Легковой {" + "power = " + getPower() + " horsepower, powerInKW = " + powerInKW() + ", maxSpeed = " + getMaxSpeed() + " km/h, brand ='" + getBrand() + '\'' +
                ", wheels = " + getWheels() + ", fuelConsumptionFor100km = " + getFuelConsumptionFor100km() +
                " l, typeBody = '" + typeBody + '\'' + ", numberPassengers = " + numberPassengers + "}";
    }

    public void distance(int travelTime) {
        int distance;
        distance = getMaxSpeed() * travelTime;
        fuelConsumption(distance);

        System.out.println("За время " + travelTime + " ч, автомобиль " + getBrand() + ", двигаясь с максимальной скоростью " +
                getMaxSpeed() + " км/ч, проедет " + distance + " км и израсходует " + fuelConsumption(distance) +" литров топлива");
    }

    private int fuelConsumption(int distance) {
        int fuelConsumption;
        fuelConsumption = distance / getFuelConsumptionFor100km();
        return fuelConsumption;
    }
}