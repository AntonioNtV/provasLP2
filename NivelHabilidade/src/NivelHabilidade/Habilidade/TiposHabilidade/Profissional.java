package NivelHabilidade.Habilidade.TiposHabilidade;

import NivelHabilidade.Habilidade.Habilidade;

public class Profissional implements Habilidade {
    private final String DESCRICAO = "Sofre forte influência das características técnicas do indivíduo";
    private int experienciaProfissional;

    public Profissional(int experienciaProfissional) {
        this.experienciaProfissional = experienciaProfissional;
    }

    @Override
    public double nivelHabilidade() {
        return (this.experienciaProfissional / 10);
    }
}
