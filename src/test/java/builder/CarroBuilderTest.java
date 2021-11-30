package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroBuilderTest {

    @Test
    void deveRetornarExcecaoParaSemFabricante() {
        try{
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setModelo("voyage")
                    .setAno(2014)
                    .build();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Fabricante inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaSemModelo() {
        try{
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setFabricante("volkswagen")
                    .setAno(2014)
                    .build();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Modelo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaSemAno() {
        try{
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setFabricante("volkswagen")
                    .setModelo("voyage")
                    .build();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Ano inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarCarroValido() {
        CarroBuilder carroBuilder = new CarroBuilder();
        Carro carro = carroBuilder
                .setFabricante("volkswagen")
                .setModelo("voyage")
                .setAno(2014)
                .build();

        assertNotNull(carro);
    }



}