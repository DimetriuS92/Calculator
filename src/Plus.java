public class Plus implements Calculator {
    private int a;
    private int b;

    public Plus(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResult() {
        return a + b;
    }




}
