package filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersFilter {


    public List<Integer> getOdd(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    public List<Integer> getEven(List<Integer> numbers) {

        return new ArrayList<>();
    }
}
