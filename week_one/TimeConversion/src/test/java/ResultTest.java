import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ResultTest {

    @Test
    public void testCaseZero() {

        Assertions.assertEquals("19:05:45", Result.timeConversion("07:05:45PM"));
    }

    @Test
    public void testCaseOne() {

        Assertions.assertEquals("00:40:22", Result.timeConversion("12:40:22AM"));
    }

    @Test
    public void testCaseTwo() {

        Assertions.assertEquals("06:40:03", Result.timeConversion("06:40:03AM"));
    }

    @Test
    public void testCaseThree() {

        Assertions.assertEquals("00:05:39", Result.timeConversion("12:05:39AM"));
    }

    @Test
    public void testCaseFour() {

        Assertions.assertEquals("12:45:54", Result.timeConversion("12:45:54PM"));
    }


    @Test
    public void testCaseMulti() {

        Assertions.assertEquals("14:34:50", Result.timeConversion("02:34:50PM"));
        Assertions.assertEquals("16:59:59", Result.timeConversion("04:59:59PM"));
        Assertions.assertEquals("04:59:59", Result.timeConversion("04:59:59AM"));
        Assertions.assertEquals("00:00:00", Result.timeConversion("12:00:00AM"));
    }



}