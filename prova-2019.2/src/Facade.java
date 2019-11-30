import frotaBr.FrotaBR;

public class Facade {
    private FrotaBR frotaBR;

    public Facade() {
        this.frotaBR = new FrotaBR();
    }

    public int cadastrarMiniCar(double potencia, double capacidade, double peso) {
        return this.frotaBR.cadastrarMiniCar(potencia, capacidade, peso);
    }

    public String exibirMiniCar(int id)  {
        return this.frotaBR.exibirMiniCar(id);
    }

    public int cadastraCCes(int dentes) {
        return this.frotaBR.cadastraCCes(dentes);
    }

    public int cadastraCCar(double largura) {
        return this.frotaBR.cadastraCCar(largura);
    }

    public int cadastraCGal(double larguraCorte) {
        return this.frotaBR.cadastraCGal(larguraCorte);
    }

    public String consultar(String aplicacao) {
        return this.frotaBR.consultar(aplicacao);
    }
}
