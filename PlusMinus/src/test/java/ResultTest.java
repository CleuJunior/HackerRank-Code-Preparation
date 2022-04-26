import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ResultTest {

    @Test
    public void testCaseZero() {
        List<Integer> listTest = Arrays.asList(0, 0, -1, 1, 1);

        String expectedResult = "0,400000\n" +
                                "0,200000\n" +
                                "0,400000\n";

        Assertions.assertEquals(expectedResult, Result.plusMinus(listTest));
    }

    @Test
    public void testCaseOne() {
        List<Integer> listTest = Arrays.asList(-4, 3, -9, 0, 4, 1);

        String expectedResult = "0,500000\n" +
                                "0,333333\n" +
                                "0,166667\n";

        Assertions.assertEquals(expectedResult, Result.plusMinus(listTest));
    }

    @Test
    public void testCaseTwo() {
        List<Integer> listTest = Arrays.asList(1, -2, -7, 9, 1, -8, 5);

        String expectedResult = "0,571429\n" +
                                "0,428571\n" +
                                "0,000000\n";

        Assertions.assertEquals(expectedResult, Result.plusMinus(listTest));
    }

}