package filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersFilter {


    public List<Integer> getOdd(List<Integer> numbers) {
        return numbers.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());
    }

    public List<Integer> getEven(List<Integer> numbers) {
        if(numbers.contains(0)) {
            numbers.remove(0);
        }
        numbers.removeAll(getOdd(numbers));
        return numbers;
    }
}
