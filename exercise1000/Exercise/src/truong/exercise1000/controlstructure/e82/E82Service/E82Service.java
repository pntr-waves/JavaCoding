package truong.exercise1000.controlstructure.e82.E82Service;

import java.util.List;

public class E82Service {
    public Double getMaxNumberInList(List<Double> numbers) {
        Double max = null;
        if (checkListHasSameItem(numbers)) return max;
        for (Double n : numbers) {
            if (max == null || max < n) max = n;
        }
        return max;
    }
    
    public boolean checkListHasSameItem (List<Double> numbers) {
        Double first = numbers.get(0);
        for (Double n : numbers) {
            if (n != first) return false;
        }
        return true;
    }
}
