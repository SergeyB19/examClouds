package task15.details;

import task15.vehicles.Car;

public class Engine extends Car {
    String power;
    String company;

    @Override
    public String toString() {
        return "Engine{" +
                "power='" + power + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
