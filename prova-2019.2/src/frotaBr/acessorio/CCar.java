package frotaBr.acessorio;

public class CCar extends Acessorio {
    private double largura;

    public CCar(int id, double largura) {
        super(id);
        this.largura = largura;
        this.peso = this.largura * 200;
        this.capacidade = this.largura / 0.004;
        this.APLICACAO = "agricultura";
    }
}
