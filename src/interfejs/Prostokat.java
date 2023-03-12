package interfejs;

public class Prostokat implements Figura {
    public double a,b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obw() {
        return 2*a+2*b;
    }

    @Override
    public double powie() {
        return a*b;
    }
}