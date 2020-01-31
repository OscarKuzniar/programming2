import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CollectionTestSuite {


    @Test
    public void collectionSpeedTest1000Elements() {
        int counter = 1000;
        List<Integer> filledList = fillList(counter);
        doTheTest(counter, filledList);
    }

    @Test
    public void collectionSpeedTest100000Elements() {
        int counter = 100_000;
        List<Integer> filledList = fillList(counter);
        doTheTest(counter, filledList);
    }

    @Test
    public void collectionSpeedTestMillionElements() {
        int counter = 1_000_000;
        List<Integer> filledList = fillList(counter);
        doTheTest(counter, filledList);
    }

    @Test
    public void collectionSpeedTestTenMillionElements() {
        int counter = 10_000_000;
        List<Integer> filledList = fillList(counter);
        doTheTest(counter, filledList);
    }

    private void doTheTest(int counter, List<Integer> filledList) {
        long whileStart = System.currentTimeMillis();
        iterateWithWhile(filledList);
        long whileEnd = System.currentTimeMillis();
        System.out.println("While loop iteration over " + counter + " elements: " + (whileEnd - whileStart) + " ms");

        long forStart = System.currentTimeMillis();
        iterateWithFor(filledList);
        long forEnd = System.currentTimeMillis();
        System.out.println("For loop iteration over " + counter + " elements: " + (forEnd - forStart) + " ms");

        long forEachStart = System.currentTimeMillis();
        iterateWithForEach(filledList);
        long forEachEnd = System.currentTimeMillis();
        System.out.println("For each loop iteration over " + counter + " elements: " + (forEachEnd - forEachStart) + " ms");

        long streamStart = System.currentTimeMillis();
        iterateWithStream(filledList);
        long streamEnd = System.currentTimeMillis();
        System.out.println("Stream iteration over " + counter + " elements: " + (streamEnd - streamStart) + " ms");
    }

    List<Integer> fillList(int elements) {
        Random random = new Random();
        List<Integer> listBeingAddedTo = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            int randInt = random.nextInt(500);
            listBeingAddedTo.add(randInt);
        }
        return new ArrayList<>(listBeingAddedTo);
    }

    List<Integer> iterateWithFor(List<Integer> list) {
        List<Integer> toFill = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            toFill.add(list.get(i));
        }
        return toFill;
    }

    List<Integer> iterateWithForEach(List<Integer> list) {
        List<Integer> toFill = new ArrayList<>();
        for (Integer e : list) {
            toFill.add(e);
        }
        return toFill;
    }

    List<Integer> iterateWithStream(List<Integer> list) {
        return list.stream()
                .map(e -> e)
                .collect(Collectors.toList());
    }

    List<Integer> iterateWithWhile(List<Integer> list) {
        List<Integer> toFill = new ArrayList<>();
        int i = 0, listSize = list.size();
        while (i < listSize) {
            Integer integer = list.get(i);
            toFill.add(integer);
            i++;
        }
        return toFill;
    }
}
