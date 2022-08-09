package Calculations.Messages;

import Exceptions.MyCustomException;

public class MessageResult extends Message {
    private final double result;

    public MessageResult(double result) {
        this.result = result;

    }

    @Override
    public void showMessage() throws MyCustomException {
        if (result > 100) {
            throw new MyCustomException("Calculator counts till 100 only.");
        } else if (result % 1 != 0) {
            System.out.print("The result is: " + result);
        } else {
            System.out.print("The result is: " + (int) result);
        }
    }
}