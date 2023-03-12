package interfejs;

import interfejs.Figura;

public class Kolo implements Figura {
    public double pKola;

    public Kolo(double pKola) {
        this.pKola = pKola;
    }

    @Override
    public double obw() {
        return 2*3.14*pKola;
    }

    @Override
    public double powie() {
        return 3.14 * (pKola*pKola);
    }


}