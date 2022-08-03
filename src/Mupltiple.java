public class Mupltiple implements Calculator{
    private int a;
    private int b;

    public Mupltiple(int a, int b) {
        this.a = a;
        this.b = b;


    }

    @Override
    public double getResult() {
        return a * b;
    }
}
