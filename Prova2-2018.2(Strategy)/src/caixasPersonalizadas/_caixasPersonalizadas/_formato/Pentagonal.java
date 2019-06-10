package caixasPersonalizadas._caixasPersonalizadas._formato;

public class Pentagonal implements Formato {
    private final String FORMATO = "Pentagonal";
    private double lado;

    public Pentagonal(double lado) {
        this.lado = lado;
    }


    @Override
    public String getFORMATO() {
        return this.FORMATO;
    }

    @Override
    public double getAreaDaTampa() {
        return 5 * (this.lado * this.getAltura() / 2);
    }

    private double getAltura() {
        return ((this.lado / 2) * Math.sqrt(5) + 2 + Math.sqrt(5) / 2);
    }
}
