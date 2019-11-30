package frotaBr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrotaBRTest {

    FrotaBR frotaBR;

    @BeforeEach
    void init() {
        this.frotaBR = new FrotaBR();
        frotaBR.cadastrarMiniCar(45.5,680,2641); // MiniCart de Construcao; id=1
        frotaBR.cadastrarMiniCar(50,100,200); // MiniCart de Agricultura; id=2
        frotaBR.cadastrarMiniCar(70.5,20,300); // MiniCart de Paisagismo; id=3
        frotaBR.cadastrarMiniCar(40.5,400,120); // MiniCart Geral; id=4

        frotaBR.cadastraCCes(2); // Acessorio de construcao; id=1
        frotaBR.cadastraCCar(200); // Acessorio de agricultura; id=2
        frotaBR.cadastraCGal(100); // Acessorio de paisagismo; id=3

        frotaBR.setAcessorio(1,1);
        frotaBR.setAcessorio(2,2);
        frotaBR.setAcessorio(3,3);
    }

    @Test
    void consultarGeral() {
        assertEquals("MiniCar [id=4, potencia=40.5, con=400.0, peso=120.0, aplicacao=geral]" + System.lineSeparator(), frotaBR.consultar("geral"));
    }

    @Test
    void consultarConstrucao() {
        assertEquals("MiniCar [id=1, potencia=45.5, con=700.0, peso=2671.0, aplicacao=construção]" + System.lineSeparator(), frotaBR.consultar("construção"));
    }

    @Test
    void consultarAgricultura() {
        assertEquals("MiniCar [id=2, potencia=50.0, con=50100.0, peso=40200.0, aplicacao=agricultura]" + System.lineSeparator(), frotaBR.consultar("agricultura"));
    }

    @Test
    void consultarPaisagismo() {
        assertEquals("MiniCar [id=3, potencia=70.5, con=20.0, peso=5300.0, aplicacao=paisagismo]" + System.lineSeparator(), frotaBR.consultar("paisagismo"));
    }

    @Test
    void consultarAplicacaoNaoPossivel() {
        assertThrows(IllegalArgumentException.class, () -> frotaBR.consultar("pipipopopo"));
    }

    @Test
    void consultarAplicacaoVazia() {
        assertThrows(IllegalArgumentException.class, () -> frotaBR.consultar(""));
    }

    @Test
    void consultarAplicacaoNula() {
        assertThrows(IllegalArgumentException.class, () -> frotaBR.consultar(null));
    }
}