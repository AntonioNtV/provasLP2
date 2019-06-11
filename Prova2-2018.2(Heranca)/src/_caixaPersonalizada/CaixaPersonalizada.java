package _caixaPersonalizada;

public abstract class CaixaPersonalizada implements Comparable<CaixaPersonalizada> {
    protected String descricao;
    protected String personalizacao;

    public CaixaPersonalizada(String descricao, String personalizacao) {
        this.descricao = descricao;
        this.personalizacao = personalizacao;
    }

    public abstract double getPreco();

    public abstract String getFORMATO();

    public String setPersonalizacao(String personalizacao) {
        this.personalizacao = personalizacao;
        return this.personalizacao;
    }

    public String getPersonalizacao() {
        return this.personalizacao;
    }

    @Override
    public int compareTo(CaixaPersonalizada o) {
        return this.personalizacao.toLowerCase().trim().compareTo(o.getPersonalizacao().toLowerCase().trim());
    }

    @Override
    public String toString() {
        return "Caixa com " + this.personalizacao +  "custa R$ " + String.format("%.2f",this.getPreco()) + ". Formato " + this.getFORMATO();
    }




}
