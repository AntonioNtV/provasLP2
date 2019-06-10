package caixasPersonalizadas._caixasPersonalizadas;

import caixasPersonalizadas._caixasPersonalizadas._formato.Formato;

public class CaixaPersonalizada implements Comparable<CaixaPersonalizada> {
    private String descricao;
    private String personalizacao;
    private Formato formato;

    public CaixaPersonalizada(String descricao, String personalizacao, Formato formato) {
        this.descricao = descricao;
        this.personalizacao = personalizacao;
        this.formato = formato;
    }


    public String getPersonalizacao() {
        return this.personalizacao;
    }

    public double getPreco() {
        return this.formato.getAreaDaTampa() * 0.1;
    }

    @Override
    public String toString() {
        return "Caixa com " + this.personalizacao +  "custa R$ " + String.format("%.2f",this.getPreco()) + ". Formato " + this.formato.getFORMATO();
    }

    @Override
    public int compareTo(CaixaPersonalizada o) {
        return this.personalizacao.toLowerCase().trim().compareTo(o.getPersonalizacao().toLowerCase().trim());
    }
}
