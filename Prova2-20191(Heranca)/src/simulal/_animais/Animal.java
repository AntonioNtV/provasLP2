package simulal._animais;

public abstract class Animal {
    protected int id;
    protected String animal;
    protected int idade;
    protected double peso;
    protected String tamanho;

    public Animal(int id, double peso, String animal, String tamanho) {
        this.id = id;
        this.animal = animal;
        this.idade = 0;
        this.peso = peso;
        this.tamanho = tamanho;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public int getId() {
        return this.id;
    }

    public abstract void crescer();

    @Override
    public String toString() {
        return this.animal + " " + this.id + " - " + this.peso + " - " + this.idade + " - " + this.tamanho;
    }
}
