package _caixaPersonalizada;

public class Circular extends CaixaPersonalizada {
    private final String FORMATO = "Circular";
    private double raioDaTampa;

    public Circular(String descricao, String personalizacao, double raioDaTampa) {
        super(descricao, personalizacao);
        this.raioDaTampa = raioDaTampa;
    }

    @Override
    public double getPreco() {
        return this.getAreaTampa() * 0.1;
    }

    @Override
    public String getFORMATO() {
        return this.FORMATO;
    }

    private double getAreaTampa() {
        return (Math.PI * this.raioDaTampa * this.raioDaTampa) * 0.1;
    }
}
