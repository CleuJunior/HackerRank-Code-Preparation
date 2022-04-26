class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        StringBuilder sb = new StringBuilder();
        String restHours = s.substring(2);

        int hours = Integer.parseInt(s.substring(0,2));

        if(s.endsWith("PM") && hours == 12) return s.replace("PM", "");
        if(s.endsWith("AM") && hours != 12) return s.replace("AM", "");

        if(s.endsWith("PM") && hours < 12) sb.append(hours + 12).append(restHours.replace("PM", ""));
        if(s.endsWith("AM") && hours == 12) sb.append("00").append(restHours.replace("AM", ""));

        return sb.toString();

    }

}