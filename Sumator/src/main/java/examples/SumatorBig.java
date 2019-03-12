package examples;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SumatorBig implements Sum {
    private BigDecimal firstNumber;
    private BigInteger secondNumber;
    Number result;

    public BigDecimal getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(BigDecimal firstNumber) {

        this.firstNumber = firstNumber;
    }

    public BigInteger getSecondNumber() {

        return secondNumber;
    }

    public void setSecondNumber(BigInteger secondNumber) {

        this.secondNumber = secondNumber;
    }

    public void sum(){
        result = new BigDecimal(secondNumber).add(firstNumber);
    }

    public Number getResult() {
        return result;
    }
}
