package lesson7.transport;

public class Военный extends Воздушный {

    private boolean ejectionSystems;
    private int rocket;

    public Военный(int power, int maxSpeed, String brand, int wingspan, int minRunwayLength, boolean ejectionSystems, int rocket) {
        super(power, maxSpeed, brand, wingspan, minRunwayLength);
        this.ejectionSystems = ejectionSystems;
        this.rocket = rocket;
    }

    @Override
    public String toString() {
        return "Военный {power = " + getPower() + " horsepower, powerInKW = " + powerInKW() + ", maxSpeed = " + getMaxSpeed() +
                ", brand = '" + getBrand() + "\', wingspan = " +getWingspan() +"m, minRunwayLength = " + getMinRunwayLength() +
                " m, ejectionSystems = " + ejectionSystems + ", rocket = " + rocket +'}';
    }

    public void shotRocket() {
        if (rocket != 0) {
            System.out.println("Ракета пошла!");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void checkEjectionSystems() {
        if (ejectionSystems) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}