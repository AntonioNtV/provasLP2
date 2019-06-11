package simulal._animais;

public class Morcego extends Animal {

    public Morcego(int id) {
        super(id, 0.002, "BAT","P");
    }

    @Override
    public void crescer() {
        this.idade++;
        this.peso += 0.002;

    }
}
