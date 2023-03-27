import java.util.*;

public class Main {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira",
                500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        List<Trabalhador> trabs = new ArrayList<>();
        trabs.add(tc);
        trabs.add(tp);
        trabs.add(th);

        System.out.println("### Trabalhadores ###");
        listar(trabs);

        System.out.println("\n----> Ordenar por ordem crescente <-----");
        Collections.sort(trabs, new VencimentosComparacao());
        listar(trabs);

        System.out.println("\n----> Ordenar por ordem decrescente <----");
        Collections.reverse(trabs);
        listar(trabs);
        //for (int i = 0; i < trabs.size(); i++)
          //  System.out.println(trabs.get(i));


        System.out.println("\n-----> Ordenar por ordem alfabetica <----");
        Collections.sort(trabs, new VencimentosComparacaoNome());
listar(trabs);


    }

    private static void listar(List<Trabalhador> trabs) {
        for (Trabalhador trab : trabs) {
            if (trab != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trab.getNome(),
                        trab.calcularVencimento());
            }
        }
    }

}
