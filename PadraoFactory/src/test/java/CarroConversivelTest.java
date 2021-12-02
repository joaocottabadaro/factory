import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroConversivelTest {
    @Test
    void deveCadastrarConversivel() {
        InterfaceCarro carro = CarroFactory.obterCarro("Conversivel");
        assertEquals("Conversivel cadastrado", carro.cadastrar());
    }

    @Test
    void deveRemoverConversivel() {
        InterfaceCarro carro = CarroFactory.obterCarro("Conversivel");
        assertEquals("Conversivel removido", carro.remover());
    }
}
