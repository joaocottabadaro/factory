

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroFactoryTest {
    @Test
    void deveRetornarExcecaoParaVeiculoInexistente() {
        try {
            InterfaceCarro carro = CarroFactory.obterCarro("Limousine");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Carro inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaVeiculoInvalido() {
        try {
            InterfaceCarro carro = CarroFactory.obterCarro("SUV");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Carro inválido", e.getMessage());
        }
    }
}
