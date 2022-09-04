package lesson7.transport;

public abstract class Транспорт {
    private int power;
    private int maxSpeed;
    private String brand;

    public Транспорт(int power, int maxSpeed, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int powerInKW() {
        int powerInKW;
        powerInKW = (int) (power * 0.735499);
        return powerInKW;
    }
}