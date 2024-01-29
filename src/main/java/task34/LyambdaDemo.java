package task34;

import task15.vehicles.Car;

public class LyambdaDemo {
    private int getCompactCarsNumber(Car[] cars) {
        int result = 0;
        for (Car car : cars) {
            if (car.getType().equals(CarTypes.COMPACT)) {
                result++;
            }
        }
        return result;
    }

    private int getExpensiveCarsNumber(Car[] cars) {
        int result = 0;
        for (Car car : cars) {
            if (car.getCost() > 20000) {
                result++;
            }
        }
        return result;
    }
}
