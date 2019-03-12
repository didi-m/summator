package examples;

public class SumatorIntNum implements Sum {
    private int firstNum;
    private int secondNum;
    private int result;


    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }


    public void sum() {
        result = this.firstNum + this.secondNum;
    }

    public int getResult() {
        return result;
    }
}
