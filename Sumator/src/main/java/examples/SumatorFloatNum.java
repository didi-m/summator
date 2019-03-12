package examples;

public class SumatorFloatNum implements Sum {
    private float firstNum;
    private float secondNum;
    private float result;


    public float getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(float firstNum) {
        this.firstNum = firstNum;
    }

    public float getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(float secondNum) {
        this.secondNum = secondNum;
    }


    public void sum(){
        result = this.firstNum + this.secondNum;
    }

    public float getResult() {
        return result;
    }
}
