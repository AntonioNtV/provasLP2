package simulal._controllers;

import simulal._animais.Animal;
import simulal._animais.Cachorro;
import simulal._animais.Elefante;
import simulal._animais.Morcego;
import simulal._estrategiaDeOrdenacao.OrdenaAnimalPorIdade;
import simulal._estrategiaDeOrdenacao.OrdenaAnimalPorPeso;

import java.util.*;

public class SimulalController {
    private Map<Integer, Animal> animaisCadastrados;
    private int id;
    private Comparator<Animal> estrategiaDeRemocao;

    public SimulalController() {
        this.animaisCadastrados = new HashMap<>();
        this.id = 0;
        this.estrategiaDeRemocao = new OrdenaAnimalPorPeso();
    }

    public int cadastrarCachorroFilhote() {
        this.animaisCadastrados.put(this.id, new Cachorro(this.id));
        this.id++;
        return this.animaisCadastrados.get(this.id - 1).getId();
    }

    public int cadastrarElefanteFilhote() {
        this.animaisCadastrados.put(this.id, new Elefante(this.id));
        this.id++;
        return this.animaisCadastrados.get(this.id - 1).getId();
    }

    public int cadastrarMorcegoFilhote() {
        this.animaisCadastrados.put(this.id, new Morcego(this.id));
        this.id++;
        return this.animaisCadastrados.get(this.id - 1).getId();
    }

    public String exibirAnimal(int id) {
        if (!this.animaisCadastrados.containsKey(id)) {
            throw new IllegalArgumentException("Animal não cadastrado");
        }
        return this.animaisCadastrados.get(id).toString();
    }

    public void crescer(int id) {
        this.animaisCadastrados.get(id).crescer();
    }

    public void configurarRemocao(String estrategia) {
        if (estrategia.equals("PESO")) {
            this.estrategiaDeRemocao = new OrdenaAnimalPorPeso();
        }
        this.estrategiaDeRemocao = new OrdenaAnimalPorIdade();
    }

    public int remover() {
        List<Animal> animais = new ArrayList<>(this.animaisCadastrados.values());
        Animal animal = Collections.max(animais, this.estrategiaDeRemocao);

        this.animaisCadastrados.remove(animal.getId());
        return animal.getId();
    }
}
