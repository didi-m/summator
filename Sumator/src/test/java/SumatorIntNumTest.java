import examples.SumatorIntNum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumatorIntNumTest {

    @Test

    public void sum(){
        SumatorIntNum sumatorInt = new SumatorIntNum();
        sumatorInt.setFirstNum(42);
        sumatorInt.setSecondNum(2);
        sumatorInt.sum();

        final int actual = sumatorInt.getResult();
        final int expected = 44;

        Assert.assertEquals(actual, expected);
    }

}
