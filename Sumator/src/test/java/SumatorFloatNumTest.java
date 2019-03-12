import org.testng.Assert;
import org.testng.annotations.Test;

public class SumatorFloatNumTest {

    @Test
    public void sum(){

        examples.SumatorFloatNum sumatorFloat = new examples.SumatorFloatNum();
        sumatorFloat.setFirstNum(5.7f);
        sumatorFloat.setSecondNum(6.5f);
        sumatorFloat.sum();

        final Number actual = sumatorFloat.getResult();
        final Number expected = 12.2f;

        Assert.assertEquals(actual, expected);

    }
}
