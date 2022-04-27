import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        return queries.stream()
                .map(query -> Collections.frequency(strings, query)).collect(Collectors.toList());

    }

}