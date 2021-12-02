import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroSedanTest {
    @Test
    void deveCadastrarSedan() {
        InterfaceCarro carro = CarroFactory.obterCarro("Sedan");
        assertEquals("Sedan cadastrado", carro.cadastrar());
    }

    @Test
    void deveRemoverSedan() {
        InterfaceCarro carro = CarroFactory.obterCarro("Sedan");
        assertEquals("Sedan removido", carro.remover());
    }
}
