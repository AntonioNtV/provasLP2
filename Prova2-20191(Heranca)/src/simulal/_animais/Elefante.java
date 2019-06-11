package simulal._animais;

public class Elefante extends Animal {

    public Elefante(int id) {
        super(id, 120.0, "FANTE", "G");
    }

    @Override
    public void crescer() {
        this.idade++;

        if (this.idade <= 20) {
            this.peso += 250;
        }
    }
}
