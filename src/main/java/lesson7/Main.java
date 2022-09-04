package lesson7;

import lesson7.transport.Военный;
import lesson7.transport.Гражданский;
import lesson7.transport.Грузовой;
import lesson7.transport.Легковой;

public class Main {
    public static void main(String[] args) {
        Легковой car = new Легковой(125, 225, "Kia", 4, 10, "Hatchback", 4);
        Грузовой cargoCar  = new Грузовой(455, 160, "BMW", 6, 18, 8000);
        Гражданский plane = new Гражданский(20000, 400, "Boing", 38, 1000, 240, true);
        Военный fighterJet = new Военный(14000, 2300, "F-18", 15, 500, true, 20);

        System.out.println(car);
        System.out.println(cargoCar);
        System.out.println(plane);
        System.out.println(fighterJet);
        System.out.println();

        car.distance(15);
        System.out.println();

        cargoCar.cargoVolume(45333);
        plane.checkNumberPassengers(2322);

        fighterJet.checkEjectionSystems();
        fighterJet.shotRocket();
    }
}