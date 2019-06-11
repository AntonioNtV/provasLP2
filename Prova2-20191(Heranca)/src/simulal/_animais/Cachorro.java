package simulal._animais;

public class Cachorro extends Animal {

    public Cachorro(int id) {
        super(id, 0.4, "CAO", "P");
    }

    @Override
    public void crescer() {
        this.idade++;
        this.peso += 0.7;

        if (this.peso >= 10) {
            this.tamanho = "M";
        }
    }
}
