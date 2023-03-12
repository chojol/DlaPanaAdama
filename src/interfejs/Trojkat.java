package interfejs;

import interfejs.Figura;

import static java.lang.Math.sqrt;

public class Trojkat implements Figura {
    public double a,b;

    public Trojkat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obw() {
        double c = a*2+b*2;
        c = sqrt(c);
        return a + b + c;
    }

    @Override
    public double powie() {
        return a * b /2;
    }
}
