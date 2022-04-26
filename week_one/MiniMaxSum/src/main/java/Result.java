import java.util.List;
import java.util.stream.Collectors;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static long[] miniMaxSum(List<Integer> arr) {
        // Write your code here

        List<Integer> sortedList = arr.stream()
                        .sorted()
                        .collect(Collectors.toList());

        long min = sortedList.subList(0, 4).stream()
                        .mapToLong(Integer::intValue).sum();

        long max = sortedList.subList(1, 5).stream()
                .mapToLong(Integer::intValue).sum();

        return new long[] {min, max};

    }
}