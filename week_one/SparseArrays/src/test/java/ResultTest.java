import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.List;

class ResultTest {

    @Test
    void exampleTestOne() {
       List<String> testListOfStrings = List.of("aba", "baba", "aba", "xzxb");
       List<String> testListOfQueries = List.of("aba", "xzxb", "ab");
       List<Integer> valuesExpected = List.of(2, 1, 0);
       
       Assert.assertEquals(valuesExpected, Result.matchingStrings(testListOfStrings, testListOfQueries));
       
    }

    @Test
    void exampleTestTwo() {
       List<String> testListOfStrings = List.of("def", "de", "fgh");
       List<String> testListOfQueries = List.of("de", "lmn", "fgh");
       List<Integer> valuesExpected = List.of(1, 0, 1);

       Assert.assertEquals(valuesExpected, Result.matchingStrings(testListOfStrings, testListOfQueries));

    }

    @Test
    void exampleTestThree() {
       List<String> testListOfStrings = List.of(
               "abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn",
               "sdaklfj", "asdjf"
       );

       List<String> testListOfQueries = List.of("abcde", "sdaklfj", "asdjf", "na", "basdn");
       List<Integer> valuesExpected = List.of(1, 3, 4, 3, 2);

       Assert.assertEquals(valuesExpected, Result.matchingStrings(testListOfStrings, testListOfQueries));

    }
}

