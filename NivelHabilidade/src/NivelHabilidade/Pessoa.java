package NivelHabilidade;

import NivelHabilidade.Habilidade.Habilidade;
import NivelHabilidade.Habilidade.TiposHabilidade.InterPessoal;
import NivelHabilidade.Habilidade.TiposHabilidade.Pessoal;
import NivelHabilidade.Habilidade.TiposHabilidade.Profissional;

public class Pessoa {
    private double autoEstima;
    private double nivelEmpatia;
    private Integer experienciaProfissional;
    private Habilidade habilidadeAtiva;

    public Pessoa(double autoEstima, double nivelEmpatia, Integer experienciaProfissional) {
        this.autoEstima = autoEstima;
        this.nivelEmpatia = nivelEmpatia;
        this.experienciaProfissional = experienciaProfissional;
        this.habilidadeAtiva = null;
    }

    public void ativaHabilidadeInterPessoal() {
        this.setHabilidadeAtiva(new InterPessoal(this.autoEstima, this.nivelEmpatia, this.experienciaProfissional));
    }

    public void ativaHabilidadeProfissional() {
        this.setHabilidadeAtiva(new Profissional(this.experienciaProfissional));
    }

    public void ativaHabilidadePessoal() {
        this.setHabilidadeAtiva(new Pessoal(this.autoEstima, this.nivelEmpatia, this.experienciaProfissional));

    }

    public void setHabilidadeAtiva(Habilidade habilidade) {
        this.habilidadeAtiva = habilidade;
    }

    public double nivelHabilidade() {
        return this.habilidadeAtiva.nivelHabilidade();
    }
}
