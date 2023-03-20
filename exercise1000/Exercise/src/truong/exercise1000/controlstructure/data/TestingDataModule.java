package truong.exercise1000.controlstructure.data;

import java.util.ArrayList;
import java.util.List;

public class TestingDataModule {
    public static List<Double> getNumbersWithSize (int size) {
        int min = 0;
        int max = 20;
        List<Double> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            double n = Math.random() * (max - min + 1) + min;
            numbers.add((double) (Math.ceil(n * 100) / 100));
        }
        return numbers;
    }
}
