package frotaBr.acessorio;

public class CCees extends Acessorio {
    private int dentes;

    public CCees(int id, int dentes) {
        super(id);
        this.dentes = dentes;
        this.peso = this.dentes * 15;
        this.capacidade = this.dentes * 10;
        this.APLICACAO = "construção";
    }

}
