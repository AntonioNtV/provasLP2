package Lp2Play;

public class VIP implements Categoria {
    private Integer pontos;

    public VIP() {
        this.pontos = 0;
    }

    @Override
    public void acumulaPontos(Integer pontos) {
        this.pontos += pontos;
    }

    @Override
    public double comprar(double gasto) {
        this.pontos += 10;
        return gasto * 0.1;
    }
}
