package Calculations.Messages;

import Exceptions.MyCustomException;

public abstract class Message {
    public abstract void showMessage() throws MyCustomException;
}
