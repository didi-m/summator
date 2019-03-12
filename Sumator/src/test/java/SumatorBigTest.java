import examples.SumatorBig;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SumatorBigTest {

    @Test
    public void sum(){

        SumatorBig sumatorBig = new SumatorBig();
        sumatorBig.setFirstNumber(new BigDecimal("1.005679"));
        sumatorBig.setSecondNumber(new BigInteger("947"));
        sumatorBig.sum();

        final Number actual = sumatorBig.getResult();
        final BigDecimal expected = new BigDecimal("948.005679");

        Assert.assertEquals(actual, expected);
    }
}
