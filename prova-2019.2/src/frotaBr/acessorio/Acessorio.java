package frotaBr.acessorio;

import java.util.Objects;

public class Acessorio {
    protected int id;
    protected String APLICACAO;
    protected double peso;
    protected double capacidade;

    public Acessorio(int id) {
        this.id = id;
        this.APLICACAO = "geral";
        this.peso = 0;
        this.capacidade = 0;
    }

    public String getAPLICACAO() {
        return APLICACAO;
    }

    public double getPeso() {
        return peso;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acessorio acessorio = (Acessorio) o;
        return id == acessorio.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
