package ginasio;

public class utentes {

    private String nome;
    private String genero;
    private int idade;
    private double altura;
    private double peso;

    private static int TotalUtentes = 0;

    private final String NOME_POR_OMISSAO = "Sem nome!";
    private final String GENERO_POR_OMISSAO = "Sem género!";
    private final int IDADE_POR_OMISSAO = 0;
    private final double ALTURA_POR_OMISSAO = 0;
    private final double PESO_POR_OMISSAO = 0;

    public utentes() {
        nome = NOME_POR_OMISSAO;
        genero = GENERO_POR_OMISSAO;
        idade = IDADE_POR_OMISSAO;
        altura = ALTURA_POR_OMISSAO;
        peso = PESO_POR_OMISSAO;
        TotalUtentes++;
    }

    public utentes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        TotalUtentes++;
    }

    public utentes(String nome, String genero, int idade, double altura, double peso) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        TotalUtentes++;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString() {
        return String.format("###################\n"+"Nome: "+nome+"\nGênero: " + genero +"\nIdade: "+ idade +"\nAltura: " + altura + "\nPeso: "+peso+"\n###################");
    }

    public int calcularDifereça(int outraIdade) {
        return (idade - outraIdade);
    }

    public double calcularIMC() {
        return (peso / (Math.pow(altura, 2)));  //math.pow mete o primeiro membro elevado ao segundo
    }

    public String grauObesidade() {
        String saudavel = "Saudável!";
        String magro = "Magro!";
        String obeso = "Obeso!";

        return String.format(calcularIMC() < 18 ? magro: calcularIMC() >= 18 && calcularIMC() < 25 ? saudavel : calcularIMC() >= 25 ? obeso: obeso);

        // o : serve para dar outra opção (outro if) e o ? serve para dar a resposta 
    }

    public void maisVelho(String outroNome, int outraIdade) {
        if (calcularDifereça(outraIdade) > 0) {
            System.out.println("O " + outroNome + " é mais novo do que o " + nome);
        } else if (calcularDifereça(outraIdade) < 0) {
            System.out.println("O " + outroNome + " é mais velho do que o " + nome);
        } else
            System.out.println("Têm os 2 a mesma idade!");

    }

    public static int getTotalUtentes() {
        return TotalUtentes;
    }


}
