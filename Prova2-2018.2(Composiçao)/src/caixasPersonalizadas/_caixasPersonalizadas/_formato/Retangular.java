package caixasPersonalizadas._caixasPersonalizadas._formato;

public class Retangular implements Formato {
    private final String FORMATO = "Retangular";
    private double lado1;
    private double lado2;

    public Retangular(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public String getFORMATO() {
        return this.FORMATO;
    }

    @Override
    public double getAreaDaTampa() {
        return this.lado1 * this.lado2;
    }
}
