package caixasPersonalizadas;

import _controllers.CaixaController;

public class Facade {
    private CaixaController caixaController;

    public Facade() {
        this.caixaController = new CaixaController();
    }

    public String cadastraCaixaPentagonal(String descricao, String personalizacao, double lado) {
        return this.caixaController.cadastraCaixaPentagonal(descricao, personalizacao, lado);
    }

    public String cadastraCaixaCircular(String descricao, String personalizacao, double raio) {
        return this.caixaController.cadastraCaixaCircular(descricao, personalizacao, raio);
    }

    public String cadastraCaixaRetangular(String descricao, String personalizacao, double lado1, double lado2) {
        return this.caixaController.cadastraCaixaRetangular(descricao, personalizacao, lado1, lado2);
    }

    public String modificaPersonalizacaoCaixa(String descricao, String novaPersonalizacao) {
        return this.caixaController.modificaPersonalizacaoCaixa(descricao, novaPersonalizacao);
    }

    public boolean removeCaixaCadastrada(String descricao) {
        return this.caixaController.removeCaixaCadastrada(descricao);
    }

    public int getNumeroCaixasCadastradas() {
        return this.caixaController.getNumeroCaixasCadastradas();
    }

    public boolean consultaCaixas(String formato, String personalizacao) {
        return this.caixaController.consultaCaixas(formato, personalizacao);
    }

    public String listaCaixasPersonalizacao(String personalizcao) {
        return this.caixaController.listaCaixasPersonalizacao(personalizcao);
    }

    public String listaCaixasFormato(String formato) {
        return this.caixaController.listaCaixasFormato(formato);
    }

    public double getLucro() {
        return this.caixaController.getLucro();
    }
}
