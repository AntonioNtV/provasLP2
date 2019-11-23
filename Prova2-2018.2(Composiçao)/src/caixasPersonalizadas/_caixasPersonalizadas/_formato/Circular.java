package caixasPersonalizadas._caixasPersonalizadas._formato;

public class Circular implements Formato {
    private final String FORMATO = "Circular";
    private double raioDaTampa;

    public Circular(double raioDaTampa) {
        this.raioDaTampa = raioDaTampa;
    }

    @Override
    public String getFORMATO() {
        return this.FORMATO;
    }

    @Override
    public double getAreaDaTampa() {
        return Math.PI * this.raioDaTampa * this.raioDaTampa;
    }
}

