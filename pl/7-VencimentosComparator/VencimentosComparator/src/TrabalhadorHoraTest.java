import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorHoraTest {

    @Test
    void calcularVencimento() {

        TrabalhadorHora trabalhadorHoraTest = new TrabalhadorHora("João", 40, 5.00f);

        float calculoTrabalhadorHora = trabalhadorHoraTest.calcularVencimento();

        Assertions.assertEquals((trabalhadorHoraTest.getNumeroHoras() * trabalhadorHoraTest.getPagamentoHora()),
                calculoTrabalhadorHora);
    }
}