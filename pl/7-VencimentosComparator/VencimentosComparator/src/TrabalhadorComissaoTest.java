import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorComissaoTest {

    @org.junit.jupiter.api.Test
    void calcularVencimento() {

        TrabalhadorComissao trabalhadorComissaotest = new TrabalhadorComissao("Manuel", 900.00f, 500.00f, 0.35f);

        float calculoVencimento = trabalhadorComissaotest.calcularVencimento();

        Assertions.assertEquals(900.00f + 500.00f * (trabalhadorComissaotest.getComissao()/100), calculoVencimento);
    }
}