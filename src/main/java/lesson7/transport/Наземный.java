package lesson7.transport;

public abstract class Наземный extends Транспорт {
    private int wheels;
    private int fuelConsumptionFor100km;

    public Наземный(int power, int maxSpeed, String brand, int wheels, int fuelConsumptionFor100km) {
        super(power, maxSpeed, brand);
        this.wheels = wheels;
        this.fuelConsumptionFor100km = fuelConsumptionFor100km;
    }

    public int getWheels() {
                return wheels;
    }

    public int getFuelConsumptionFor100km() {
        return fuelConsumptionFor100km;
    }
}