package simulal._estrategiaDeOrdenacao;

import simulal._animais.Animal;

import java.util.Comparator;

public class OrdenaAnimalPorPeso implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getPeso() > o2.getPeso()) {
            return 1;
        } else if (o1.getPeso() == o2.getPeso()) {
            return 0;
        }
        return -1;
    }
}
