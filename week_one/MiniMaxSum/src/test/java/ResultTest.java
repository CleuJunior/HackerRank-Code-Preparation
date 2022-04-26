import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ResultTest {

    @Test
    public void testCaseZero() {
        List<Integer> listTest = List.of(1, 2, 3, 4, 5);

        long[] expected = {10, 14};

        Assertions.assertArrayEquals(expected, Result.miniMaxSum(listTest));
    }

    @Test
    public void testCaseOne() {
        List<Integer> listTest = List.of(256741038, 623958417, 467905213, 714532089, 938071625);

        long[] expected = {2063136757, 2744467344L};

        Assertions.assertArrayEquals(expected, Result.miniMaxSum(listTest));
    }

    @Test
    public void testCaseTwo() {
        List<Integer> listTest = List.of(396285104, 573261094, 759641832, 819230764, 364801279);

        long[] expected = {2093989309 , 2548418794L};

        Assertions.assertArrayEquals(expected, Result.miniMaxSum(listTest));
    }

    @Test
    public void testCaseThree() {
        List<Integer> listTest = List.of(140638725, 436257910, 953274816, 734065819, 362748590);

        long[] expected = {1673711044, 2486347135L};

        Assertions.assertArrayEquals(expected, Result.miniMaxSum(listTest));
    }

    @Test
    public void testCaseFour() {
        List<Integer> listTest = List.of(769082435, 210437958, 673982045, 375809214, 380564127);

        long[] expected = {1640793344, 2199437821L};

        Assertions.assertArrayEquals(expected, Result.miniMaxSum(listTest));
    }

}