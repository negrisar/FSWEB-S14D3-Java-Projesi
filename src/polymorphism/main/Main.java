package polymorphism.main;
import polymorphism.pasicifCarCompany.Car;
import polymorphism.pasicifCarCompany.Ford;
import polymorphism.pasicifCarCompany.Holden;
import polymorphism.pasicifCarCompany.Mitsubishi;
import polymorphism.rdCompany.*;
import polymorphism.CarSkeleton.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi("Outlander VRX 4WD", 6);

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford("Ford Falcon", 6);

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden("Holden Commodore", 6);

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());

        System.out.println("--------------Pacific Car Company -------------");
        CarSkeleton car1 = new GasPoweredCar("Toyota", "benzinli araba", 6.2, 5);
        CarSkeleton car2 = new HybridCar("Mercedes", "hybrid araba", 4.2, 54, 3);
        CarSkeleton car3 = new ElectricCar("Toyota", "elektirkli araba", 3.5, 6);
        car1.drive();
        car2.drive();
        car3.drive();


    }
}