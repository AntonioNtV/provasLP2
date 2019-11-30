package frotaBr;

import frotaBr.acessorio.Acessorio;
import frotaBr.acessorio.CCar;
import frotaBr.acessorio.CCees;
import frotaBr.acessorio.CGal;
import frotaBr.util.Validador;

import java.util.*;
import java.util.stream.Collectors;

public class FrotaBR {
    private Map<Integer, MiniCarregadeira>  miniCarregadeirCadastradas;
    private Map<Integer, Acessorio>  acessorios;
    private Integer miniCarregadeirasID;
    private Integer acessoriosID;

    public FrotaBR() {
        this.miniCarregadeirCadastradas = new HashMap<>();
        this.acessorios = new HashMap<>();
        this.miniCarregadeirasID = 0;
        this.acessoriosID = 0;
    }

    public int cadastrarMiniCar( double potencia, double capacidade, double peso) {
        Validador.validaDoubleNegativo(potencia, "Potencia nao pode ser negativa");
        Validador.validaDoubleNegativo(capacidade, "Capacidade nao pode ser negativa");
        Validador.validaDoubleNegativo(peso, "Peso nao pode ser negativa");

        this.miniCarregadeirasID++;
        this.miniCarregadeirCadastradas.put(this.miniCarregadeirasID, new MiniCarregadeira(this.miniCarregadeirasID, potencia, capacidade, peso));

        return this.miniCarregadeirCadastradas.get(this.miniCarregadeirasID).getId();
    }

    public int cadastraCCes(int dentes) {
        Validador.validaInteiroNegativo(dentes, "Dentes nao pode ser negativo");
        this.acessoriosID++;
        this.acessorios.put(this.acessoriosID, new CCees(this.acessoriosID, dentes));

        return this.acessorios.get(this.acessoriosID).getId();

    }

    public int cadastraCCar(double largura) {
        Validador.validaDoubleNegativo(largura, "largura nao pode ser negativa");
        this.acessoriosID++;
        this.acessorios.put(this.acessoriosID, new CCar(this.acessoriosID, largura));

        return this.acessorios.get(this.acessoriosID).getId();

    }

    public int cadastraCGal(double larguraCorte) {
        Validador.validaDoubleNegativo(larguraCorte, "largura nao pode ser negativa");
        this.acessoriosID++;
        this.acessorios.put(this.acessoriosID, new CGal(this.acessoriosID, larguraCorte));

        return this.acessorios.get(this.acessoriosID).getId();

    }

    public void setAcessorio(int iDMiniCar, int iDAcessorio) {
        this.validaIDCarregadeira(iDMiniCar);
        this.validaIDAcessorio(iDAcessorio);

        Acessorio acessorio = this.acessorios.get(iDAcessorio);
        this.miniCarregadeirCadastradas.get(iDMiniCar).cadastraAcessorio(acessorio);
    }

    public String exibirMiniCar(int id) {
        this.validaIDCarregadeira(id);
        return this.miniCarregadeirCadastradas.get(id).toString();
    }


    public String consultar(String aplicacao) {
        List<String> possibleAplications = Arrays.asList("geral","agricultura", "construção","paisagismo");
        if (!possibleAplications.contains(aplicacao)) {
            throw new IllegalArgumentException("Aplicacao nao existente");
        }
        Validador.validaString(aplicacao, "Aplicacao nao pode ser nula ou vazia");


        String out = "";

        List<MiniCarregadeira> miniCarregadeirasList = new ArrayList<>(this.miniCarregadeirCadastradas.values());
        List<MiniCarregadeira> miniCarregadeirasAplica = miniCarregadeirasList.stream()
                                                        .filter(miniCarregadeira -> miniCarregadeira.getAplicacao().equals(aplicacao))
                                                        .collect(Collectors.toList());

        for (MiniCarregadeira miniCarregadeira: miniCarregadeirasAplica) {
            out += miniCarregadeira.toString() + System.lineSeparator();
        }

        return out;
    }



    private void validaIDCarregadeira(int id) {
        if (!(this.miniCarregadeirCadastradas.containsKey(id))) {
            throw new IllegalArgumentException("Mini Carregadeira nao cadastrada");
        }
        Validador.validaInteiroNegativo(id, "Id nao pode ser negativo");
    }
    private void validaIDAcessorio(int id) {
        if (!(this.acessorios.containsKey(id))) {
            throw new IllegalArgumentException("Acessorio nao cadastrado");
        }
        Validador.validaInteiroNegativo(id, "Id nao pode ser negativo");
    }
}
