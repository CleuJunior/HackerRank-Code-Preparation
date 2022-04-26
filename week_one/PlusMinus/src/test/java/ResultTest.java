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

    @Test
    public void testCaseThree() {
        List<Integer> listTest = Arrays.asList(0, 4, -3, 3, -6);

        String expectedResult = "0,400000\n" +
                                "0,400000\n" +
                                "0,200000\n";

        Assertions.assertEquals(expectedResult, Result.plusMinus(listTest));
    }

    @Test
    public void testCaseFour() {
        List<Integer> listTest = Arrays.asList(
                55, 48, 48, 45, 91, 97, 45, 1, 39, 54, 36, 6, 19, 35, 66, 36, 72, 93, 38, 21, 65, 70, 36, 63,
                39, 76, 82, 26, 67, 29, 24, 82, 62, 53, 1, 50, 47, 65, 67, 19, 66, 90, 77
        );

        String expectedResult = "1,000000\n" +
                                "0,000000\n" +
                                "0,000000\n";

        Assertions.assertEquals(expectedResult, Result.plusMinus(listTest));
    }

}