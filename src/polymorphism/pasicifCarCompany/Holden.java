package polymorphism.pasicifCarCompany;

public class Holden extends Car {

    public Holden(String name, int cylinder){

        super(cylinder,name);
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return getName() + " engine is starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getName() + " is accelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return getName() + " is breaking";
    }


}
