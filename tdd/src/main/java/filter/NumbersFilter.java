package filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersFilter {


    public List<Integer> getOdd(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i <numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                oddNumbers.add(numbers.get(i));
            }
        }
        return oddNumbers;
    }

    public List<Integer> getEven(List<Integer> numbers) {

        return new ArrayList<>();
    }
}
