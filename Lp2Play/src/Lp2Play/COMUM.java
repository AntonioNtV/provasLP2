package Lp2Play;

public class COMUM implements Categoria {
    private Integer pontos;

    public COMUM() {
        this.pontos = 0;
    }

    @Override
    public void acumulaPontos(Integer pontos) {
        this.pontos += pontos;
    }

    @Override
    public double comprar(double gasto) {
        this.pontos += 5;
        return gasto * 0.05;
    }
}
