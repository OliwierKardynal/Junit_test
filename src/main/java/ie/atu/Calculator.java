package ie.atu;

public class Calculator {
    public int add(int firstNum, int secondNum)
    {
        if (firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE)
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");

        int result = firstNum + secondNum;
        return result;

    }

    public int subtract(int firstNum, int secondNum) {
        if (firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE)
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");

        int result = firstNum - secondNum;
        return result;
    }

    public int multiply(int firstNum, int secondNum) {
        if (firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE)
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");

        int result = firstNum * secondNum;
        return result;
    }

    public int division(int firstNum, int secondNum) {
        if (secondNum == 0)
            throw new ArithmeticException("Cannot divide by zero");

        int result = firstNum / secondNum;
        return result;
    }
}