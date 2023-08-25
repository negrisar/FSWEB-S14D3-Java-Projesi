package polymorphism.pasicifCarCompany;

import java.util.Objects;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        setEngine(true);
        setWheels(4);

    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public String startEngine(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car's engine is starting";

    }
    public String accelerate(){
        return " the car is accelerating";
    }

    public String brake(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car is braking ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return ((Car) o).cylinders == this.cylinders && ((Car) o).name.equals(this.name);
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n" );
        builder.append("Cylinders: " + cylinders + "\n" );
        return builder.toString();
    }
}



