package _caixaPersonalizada;

public class Pentagonal extends CaixaPersonalizada {
    private final String FORMATO = "Pentagonal";
    private double lado;

    public Pentagonal(String descricao, String personalizacao, double lado) {
        super(descricao, personalizacao);
        this.lado = lado;
    }

    @Override
    public double getPreco() {
        return this.getAreaTampa() * 0.1;
    }

    @Override
    public String getFORMATO() {
        return null;
    }

    private double getAltura() {
        return ((this.lado / 2) * Math.sqrt(5) + 2 + Math.sqrt(5) / 2);
    }

    private double getAreaTampa() {
        return (5 * (this.lado * this.getAltura() / 2));
    }
}
