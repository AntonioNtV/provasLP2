package Lp2Play;

public class Cliente {
    private double dinheiro;
    private Categoria categoria;

    public Cliente(double dinheiro, String categoria) {
        this.dinheiro = dinheiro;
        this.categoria = this.chooseCategoria(categoria);
    }

    public void acumulaPontos(int pontos) {
        this.categoria.acumulaPontos(pontos);
    }

    public void comprar (double gasto) {
        this.dinheiro -= this.categoria.comprar(gasto);
    }

    private Categoria chooseCategoria(String categoria) {
        if (categoria.equals("VIP")) {
            return new VIP();
        }
        return new COMUM();
    }

    public void setCategoria(String categoria) {
        this.categoria = this.chooseCategoria(categoria);
    }
}
