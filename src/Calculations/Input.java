package Calculations;

import Calculations.Messages.Message;
import Calculations.Messages.MessageNumber;
import Calculations.Messages.MessageOperator;
import Exceptions.MyCustomException;

import java.util.Scanner;

public class Input {
    private int number1, number2;
    private String operator;
    private final Scanner scanner = new Scanner(System.in);
    private final Message messageNumber = new MessageNumber();
    private final Message messageOperator = new MessageOperator();

    public void input() throws MyCustomException {
        messageNumber.showMessage();
        number1 = scanner.nextInt();

        messageOperator.showMessage();
        operator = scanner.next();

        messageNumber.showMessage();
        number2 = scanner.nextInt();
    }
    public int getNumber1() {
        return number1;
    }

    public String getOperator() {
        return operator;
    }

    public int getNumber2() {
        return number2;
    }
}
