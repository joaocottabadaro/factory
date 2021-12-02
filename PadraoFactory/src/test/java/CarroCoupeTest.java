import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroCoupeTest {
    @Test
    void deveCadastrarCoupe() {
        InterfaceCarro carro = CarroFactory.obterCarro("Coupe");
        assertEquals("Coupe cadastrado", carro.cadastrar());
    }

    @Test
    void deveRemoverCoupe() {
        InterfaceCarro carro = CarroFactory.obterCarro("Coupe");
        assertEquals("Coupe removido", carro.remover());
    }
}
