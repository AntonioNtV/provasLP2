package caixasPersonalizadas._controllers;

import caixasPersonalizadas._caixasPersonalizadas.CaixaPersonalizada;
import caixasPersonalizadas._caixasPersonalizadas._formato.Circular;
import caixasPersonalizadas._caixasPersonalizadas._formato.Pentagonal;
import caixasPersonalizadas._caixasPersonalizadas._formato.Retangular;

import java.util.*;

public class CaixaController {
    private Map<String, CaixaPersonalizada> caixasCadastradas;

    public CaixaController() {
        this.caixasCadastradas = new HashMap<>();
    }

    public String cadastraCaixaPentagonal(String descricao, String personalizacao, double lado) {
        this.caixasCadastradas.put(descricao.toLowerCase().trim(), new CaixaPersonalizada(descricao, personalizacao, new Pentagonal(lado)));
        return this.caixasCadastradas.get(descricao.toLowerCase().trim()).toString();
    }

    public String cadastraCaixaCircular(String descricao, String personalizacao, double raio) {
        this.caixasCadastradas.put(descricao.toLowerCase().trim(), new CaixaPersonalizada(descricao, personalizacao, new Circular(raio)));
        return this.caixasCadastradas.get(descricao.toLowerCase().trim()).toString();
    }

    public String cadastraCaixaRetangular(String descricao, String personalizacao, double lado1, double lado2) {
        this.caixasCadastradas.put(descricao.toLowerCase().trim(), new CaixaPersonalizada(descricao, personalizacao, new Retangular(lado1, lado2)));
        return this.caixasCadastradas.get(descricao.toLowerCase().trim()).toString();
    }

    public String modificaPersonalizacaoCaixa(String descricao, String novaPersonalizacao) {
        return this.caixasCadastradas.get(descricao.toLowerCase()).setPersonalizacao(novaPersonalizacao);
    }

    public boolean removeCaixaCadastrada(String descricao) {
        if (!this.caixasCadastradas.containsKey(descricao.toLowerCase().trim())) {
            return false;
        }

        this.caixasCadastradas.remove(descricao.trim().toLowerCase());
        return true;
    }

    public int getNumeroCaixasCadastradas() {
        return this.caixasCadastradas.size();
    }

    public boolean consultaCaixas(String formato, String personalizacao) {
        for (CaixaPersonalizada caixa : this.caixasCadastradas.values()) {
            if (caixa.getPersonalizacao().equals(personalizacao) && caixa.getFORMATO().equals(formato)) {
                return true;
            }
        }

        return false;
    }

    public String listaCaixasPersonalizacao(String personalizcao) {
        String saida = "";
        List<CaixaPersonalizada> caixaPersonalizadasList = new ArrayList<>(this.caixasCadastradas.values());
        Collections.sort(caixaPersonalizadasList);

        for (CaixaPersonalizada caixaPersonalizada : caixaPersonalizadasList) {
            if (caixaPersonalizada.getPersonalizacao().equals(personalizcao)) {
                saida += caixaPersonalizada.toString() + ", ";
            }
        }

        if (saida.length() > 0) {
            saida = saida.substring(0, saida.length() - 2);
        }

        return saida;
    }

    public String listaCaixasFormato(String formato) {
        String saida = "";
        List<CaixaPersonalizada> caixaPersonalizadasList = new ArrayList<>(this.caixasCadastradas.values());
        Collections.sort(caixaPersonalizadasList);

        for (CaixaPersonalizada caixaPersonalizada : caixaPersonalizadasList) {
            if (caixaPersonalizada.getFORMATO().equals(formato)) {
                saida += caixaPersonalizada.toString() + ", ";
            }
        }

        if (saida.length() > 0) {
            saida = saida.substring(0, saida.length() - 2);
        }

        return saida;
    }

    public double getLucro() {
        double valor = 0.0;

        for (CaixaPersonalizada caixa : this.caixasCadastradas.values()) {
            valor += caixa.getPreco();
        }

        return valor;
    }





}
