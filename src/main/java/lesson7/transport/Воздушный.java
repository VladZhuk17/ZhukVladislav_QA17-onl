package lesson7.transport;

public abstract class Воздушный extends Транспорт {

    private int wingspan;
    private int minRunwayLength;

    public int getWingspan() {
        return wingspan;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }

    public Воздушный(int power, int maxSpeed, String brand, int wingspan, int minRunwayLength) {
        super(power, maxSpeed, brand);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }
}