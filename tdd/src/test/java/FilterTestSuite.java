import filter.NumbersFilter;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class FilterTestSuite {

    @Before
    public void before() {

    }

    @After
    public void after() {

    }

    @AfterClass
    public static void afterClass() {

    }


    @Test
    public void testFilterReturnOddNumbersList() {
        //Given
        NumbersFilter filter = new NumbersFilter();
        List<Integer> numberList = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        //When
        List<Integer> filteredList = filter.getOdd(numberList);

        //Then
        Assert.assertEquals(5, filteredList.size());
    }

    @Test
    public void testFilterReturnEvenNumbers() {
        //Given
        NumbersFilter filter = new NumbersFilter();
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            numberList.add(i);
        }

        //When
        List<Integer> filteredList = filter.getEven(numberList);

        //Then
        Assert.assertEquals(4, filteredList.size());
    }

    @Test
    public void testFilterOddWithEmptyList() {
        //Given
        NumbersFilter filter = new NumbersFilter();
        List<Integer> emptyList = new ArrayList<>();

        //When
        var shouldBeEmptyList = filter.getOdd(emptyList);

        //Then
        Assert.assertTrue(shouldBeEmptyList.isEmpty());
    }

    @Test
    public void testFilterEvenWithEmptyList() {
        //Given
        NumbersFilter filter = new NumbersFilter();
        List<Integer> emptyList = new ArrayList<>();

        //When
        var shouldBeEmptyList = filter.getEven(emptyList);

        //Then
        Assert.assertTrue(shouldBeEmptyList.isEmpty());
    }
}
