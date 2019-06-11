package simulal;

import simulal._controllers.SimulalController;


public class Facade {
    private SimulalController simulalController;

    public Facade() {
        this.simulalController = new SimulalController();
    }

    public int cadastrarCachorroFilhote() {
        return this.simulalController.cadastrarCachorroFilhote();
    }

    public int cadastrarElefanteFilhote() {
       return this.simulalController.cadastrarElefanteFilhote();
    }

    public int cadastrarMorcegoFilhote() {
        return this.simulalController.cadastrarMorcegoFilhote();
    }

    public String exibirAnimal(int id) {
        return this.simulalController.exibirAnimal(id);
    }

    public void crescer(int id) {
        this.simulalController.crescer(id);
    }

    public void configurarRemocao(String estrategia) {
        this.simulalController.configurarRemocao(estrategia);
    }

    public int remover() {
        return this.simulalController.remover();
    }
}
