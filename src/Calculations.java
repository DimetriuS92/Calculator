public class Calculations {
    private int a;
    private String operator;
    private int b;

    public Calculations(int a, String operator, int b) {
        this.a = a;
        this.operator = operator;
        this.b = b;

    }

    public Calculator getCalc() {
        switch (operator) {

            case "+":
                return new Plus(a, b);

            case "-":
                return new Minus(a, b);

            case "*":
                return new Mupltiple(a, b);

            case "/":
                return new Division(a, b);

            default:
                return null;
        }
    }
}
