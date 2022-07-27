import java.util.Scanner;

class Main {
    public Main() {
    }

    public static void main(String[] args) {

        String operator;
        int number1, number2;
        double result;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter first number");
        number1 = input.nextInt();


        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next();

        System.out.println("Enter second number");
        number2 = input.nextInt();

        switch (operator) {


            case "+":
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;


            case "-":
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;


            case "*":
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;


            case "/":
                result = (double) number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}