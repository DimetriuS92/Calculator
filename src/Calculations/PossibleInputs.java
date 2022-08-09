package Calculations;

import Calculations.Messages.MessageResult;
import Exceptions.MyCustomException;

public class PossibleInputs implements Calculator {
    private int number1, number2;
    private String operator;

    public PossibleInputs(int number1, int number2, String operator) {
        this.number1 = number1;
        this.operator = operator;
        this.number2 = number2;

    }

    @Override
    public void possibleCalculations() throws MyCustomException {
        double result;
        switch (operator) {
            case "+":
                result = number1 + number2;
                new MessageResult(result).showMessage();
                break;

            case "-":
                result = number1 - number2;
                new MessageResult(result).showMessage();
                break;

            case "*":
                result = number1 * number2;
                new MessageResult(result).showMessage();
                break;
            case "/":
                if (number2 != 0) {
                    result = (double) number1 + number2;
                    new MessageResult(result).showMessage();

                } else {
                    throw new ArithmeticException("Division by zero is impossible!!!");

                }
                break;
            default:
                System.out.println("Invalid operator!");

        }
    }


}

