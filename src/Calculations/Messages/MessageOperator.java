package Calculations.Messages;

public class MessageOperator extends Message {
    @Override
    public void showMessage() {
        System.out.println("Choose an operator: +, -, *, or /");
    }
}
