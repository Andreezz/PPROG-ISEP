import java.util.Comparator;

public class VencimentosComparacaoNome implements Comparator<Trabalhador> {
    public int compare(Trabalhador trabalhador1, Trabalhador trabalhador2) {

        return trabalhador1.getNome().compareTo(trabalhador2.getNome());
    }
    }
