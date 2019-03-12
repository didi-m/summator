import examples.SumatorString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumatorStringTest {

    @Test
    public void sum(){

        SumatorString sumatorString = new SumatorString();
        sumatorString.setFirstNumber("52");
        sumatorString.setSecondNumber("6");
        sumatorString.sum();

        final int actual = sumatorString.getResult();
        final int expected = 58;

        Assert.assertEquals(actual, expected);

    }
}
