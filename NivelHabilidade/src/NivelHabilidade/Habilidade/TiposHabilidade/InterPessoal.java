package NivelHabilidade.Habilidade.TiposHabilidade;

import NivelHabilidade.Habilidade.Habilidade;

public class InterPessoal implements Habilidade {
    private final String DESCRICAO = "Sofre forte influência do nível de empatia";
    private double autoEstima;
    private double nivelEmpatia;
    private Integer experienciaProfissional;

    public InterPessoal(double autoEstima, double nivelEmpatia, Integer experienciaProfissional) {
        this.autoEstima = autoEstima;
        this.nivelEmpatia = nivelEmpatia;
        this.experienciaProfissional = experienciaProfissional;
    }

    @Override
    public double nivelHabilidade() {
        return 0.3 * this.autoEstima + 0.2 * (this.experienciaProfissional / 10) + 0.5 * this.nivelEmpatia;
    }
}
