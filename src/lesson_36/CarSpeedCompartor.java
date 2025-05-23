package lesson_36;

import java.util.Comparator;

/**
 * @author Sergey Bugaenko
 * {@code @date} 06.02.2025
 */


public class CarSpeedCompartor implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return c1.getMaxSpeed() - c2.getMaxSpeed();
    }
}

// c1 - c2 ->
