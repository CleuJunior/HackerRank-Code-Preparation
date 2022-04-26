import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String plusMinus(List<Integer> arr) {
        // Write your code here

        int[] valuesOfInt = new int[3];

        for(int integerValues : arr){
            if(integerValues > 0) valuesOfInt[0]++;
            if(integerValues < 0) valuesOfInt[1]++;
            if(integerValues == 0) valuesOfInt[2]++;

        }

        double resultPositive = (double) valuesOfInt[0] / (double) arr.size();
        double resultNegative = (double) valuesOfInt[1] / (double) arr.size();
        double resultZero = (double) valuesOfInt[2] / (double) arr.size();


        return  String.format("%.6f", resultPositive) + "\n" +
                String.format("%.6f", resultNegative) + "\n" +
                String.format("%.6f", resultZero) + "\n";
    }

}