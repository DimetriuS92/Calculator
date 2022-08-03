public class Division implements Calculator {
    private double a;
    private double b;

    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResult() {
        return a / b;
    }
}
