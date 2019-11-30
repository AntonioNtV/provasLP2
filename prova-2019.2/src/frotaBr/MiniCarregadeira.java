package frotaBr;

import frotaBr.acessorio.Acessorio;
import frotaBr.util.Validador;

import java.util.Objects;

public class MiniCarregadeira {
    private int id;
    private double potencia;
    private double capacidade;
    private double peso;
    private Acessorio acessorio;


    public MiniCarregadeira(int id, double potencia, double capacidade, double peso) {
        Validador.validaInteiroNegativo(id, "Id nao pode ser negativo");
        Validador.validaDoubleNegativo(potencia, "Potencia nao pode ser negativa");
        Validador.validaDoubleNegativo(capacidade, "Capacidade nao pode ser negativa");
        Validador.validaDoubleNegativo(peso, "Peso nao pode ser negativo");
        this.id = id;
        this.potencia = potencia;
        this.capacidade = capacidade;
        this.peso = peso;
        this.acessorio = new Acessorio(-1);
    }


    public void cadastraAcessorio(Acessorio acessorio) {
        if (acessorio == null) {
            throw new IllegalArgumentException("Acessorio nao pode ser nulo");
        }

        this.peso -= this.acessorio.getPeso();
        this.acessorio = acessorio;
        this.peso += this.acessorio.getPeso();
        this.capacidade = this.capacidade + this.acessorio.getCapacidade();
    }

    public String getAplicacao() {
        return this.acessorio.getAPLICACAO();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MiniCarregadeira that = (MiniCarregadeira) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "MiniCar [" +
                "id=" + id +
                ", potencia=" + potencia +
                ", con=" + capacidade +
                ", peso=" + peso +
                ", aplicacao=" + this.getAplicacao() +
                ']';
    }
}
