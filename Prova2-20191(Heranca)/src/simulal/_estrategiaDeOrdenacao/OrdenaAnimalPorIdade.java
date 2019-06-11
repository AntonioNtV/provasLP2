package simulal._estrategiaDeOrdenacao;

import simulal._animais.Animal;

import java.util.Comparator;

public class OrdenaAnimalPorIdade implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getIdade() - o2.getIdade();
    }
}
