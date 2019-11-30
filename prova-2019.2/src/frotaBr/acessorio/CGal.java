package frotaBr.acessorio;

public class CGal extends Acessorio {
    private double larguraDeCorte;

    public CGal(int id, double larguraDeCorte) {
        super(id);
        this.larguraDeCorte = larguraDeCorte;
        this.peso = larguraDeCorte * 50;
        this.capacidade = 0;
        this.APLICACAO = "paisagismo";
    }

}
