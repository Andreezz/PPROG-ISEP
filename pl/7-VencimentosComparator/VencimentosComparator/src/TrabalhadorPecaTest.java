import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorPecaTest {

    @Test
    void calcularVencimento() {

        TrabalhadorPeca trabalhadorPecatest = new TrabalhadorPeca("Joana", 5, 15);

        float calcularTrabalhadorPecaVencimento = trabalhadorPecatest.calcularVencimento();

        Assertions.assertEquals((5 * 15.5f) + (15 * 20.0f), calcularTrabalhadorPecaVencimento);

    }

}