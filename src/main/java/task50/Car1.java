package task50;

public class Car1 implements Cloneable {
    private String name;
    private Driver driver;

    public Car1(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    /**
     * Конструктор копирования.
     *
     * @param otherCar
     */
    public Car1(Car otherCar) {
        this(otherCar.getName(), otherCar.getDriver());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
