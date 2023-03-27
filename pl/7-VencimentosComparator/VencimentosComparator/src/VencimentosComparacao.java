import java.util.Comparator;

public class VencimentosComparacao implements Comparator<Trabalhador> {

    @Override
    public int compare(Trabalhador trabalhador1, Trabalhador trabalhador2){

        float vencimentoTrabalhador1 = trabalhador1.calcularVencimento();
        float vencimentoTrabalhador2 = trabalhador2.calcularVencimento();

        if ( vencimentoTrabalhador1 < vencimentoTrabalhador2) {
            return -1; //vencimento1 é menor que o 2
        } else if (vencimentoTrabalhador1 > vencimentoTrabalhador2) {
            return 1; //vencimento1 é maior que o 2
        } else {
            return 0; //vencimentos sao iguais
        }

    }



}
