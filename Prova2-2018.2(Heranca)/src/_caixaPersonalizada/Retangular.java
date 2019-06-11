package _caixaPersonalizada;

public class Retangular extends CaixaPersonalizada {
    private final String FORMATO = "Retangular";
    private double lado1;
    private double lado2;

    public Retangular(String descricao, String personalizacao, double lado1, double lado2) {
        super(descricao, personalizacao);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }


    @Override
    public double getPreco() {
        return this.getAreatampa() * 0.1;
    }

    @Override
    public String getFORMATO() {
        return this.FORMATO;
    }

    private double getAreatampa() {
        return this.lado1 * this.lado2;
    }
}
