import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class ResultTest {

    private final List<Integer> listTest = new ArrayList<>();

    @Test
    public void testCaseZero() {
        int[] arrTest = {0, 0, -1, 1, 1};

        for(int numTest : arrTest) { listTest.add(numTest); }

        String expectedResult = "0,400000\n" +
                                "0,200000\n" +
                                "0,400000\n";


        Assertions.assertEquals(expectedResult, Result.plusMinus(listTest));

    }

    @Test
    public void testCaseOne() {
        int[] arrTest = {-4, 3, -9, 0, 4, 1};

        for(int numTest : arrTest) { listTest.add(numTest); }

        String expectedResult = "0,500000\n" +
                                "0,333333\n" +
                                "0,166667\n";

        Assertions.assertEquals(expectedResult, Result.plusMinus(listTest));


    }

    @Test
    public void testCaseTwo() {
        int[] arrTest = {1, -2, -7, 9, 1, -8, 5};

        for(int numTest : arrTest) { listTest.add(numTest); }

        String expectedResult = "0,571429\n" +
                                "0,428571\n" +
                                "0,000000\n";

        Assertions.assertEquals(expectedResult, Result.plusMinus(listTest));

    }

}