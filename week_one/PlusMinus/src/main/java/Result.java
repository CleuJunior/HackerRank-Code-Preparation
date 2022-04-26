import java.util.List;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String plusMinus(List<Integer> arr) {
        // Write your code here

        long positivesValues =  arr.stream()
                .filter(value -> value > 0)
                .count();

        long negativeValues =  arr.stream()
                .filter(value -> value < 0)
                .count();

        long zeroValues =  arr.stream()
                .filter(value -> value == 0)
                .count();

        double resultPositive = positivesValues / (double) arr.size();
        double resultNegative = negativeValues / (double) arr.size();
        double resultZero = zeroValues / (double) arr.size();

        return  String.format("%.6f", resultPositive) + "\n" +
                String.format("%.6f", resultNegative) + "\n" +
                String.format("%.6f", resultZero) + "\n";
    }

}