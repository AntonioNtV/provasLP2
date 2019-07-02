package NivelHabilidade.Habilidade.TiposHabilidade;

import NivelHabilidade.Habilidade.Habilidade;

public class Pessoal implements Habilidade {
    private final String DESCRICAO = "Sofre forte influência da autoestima";
    private double autoEstima;
    private double nivelEmpatia;
    private Integer experienciaProfissional;

    public Pessoal(double autoEstima, double nivelEmpatia, Integer experienciaProfissional) {
        this.autoEstima = autoEstima;
        this.nivelEmpatia = nivelEmpatia;
        this.experienciaProfissional = experienciaProfissional;
    }

    @Override
    public double nivelHabilidade() {
        return (0.5 * this.autoEstima + 0.3 * (this.experienciaProfissional / 10) + 0.2 * this.nivelEmpatia );
    }
}
