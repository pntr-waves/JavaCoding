package truong.exercise1000.controlstructure.e82;

import java.util.List;

import truong.exercise1000.controlstructure.data.TestingDataModule;

public class Main {
    //82. Write the program: get max number in list.
    public static void main(String[] args) {
        List<Double> numbers = TestingDataModule.getNumbersWithSize(4);
        for (Double n : numbers) {
            System.out.println(n + "\n");
        }
    }

}
