import filter.NumbersFilter;
import org.junit.*;

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

}
