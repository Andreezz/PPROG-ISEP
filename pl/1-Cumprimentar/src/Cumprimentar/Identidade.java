package Cumprimentar;

/**
 * @author 1210804
 */

public class Identidade {
    private String nome;
    private int idade;

    private final String NOME_POR_OMISSAO = "Sem nome";
    private final int IDADE_POR_OMISSAO = 0;




    public Identidade() {
        nome = NOME_POR_OMISSAO;
        idade = IDADE_POR_OMISSAO;

    }

    public Identidade(String nome){
        this.nome = nome;
    }

    public Identidade(int idade){
        this.idade = idade;
    }

    public Identidade(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;

    }

    public String GetNome() {
        return nome;
    }

    public int GetIdade() {
        return idade;
    }

    public void SetNome(String nome) {
        this.nome = nome;

    }

    public void SetIdade(int idade) {
        this.idade = idade;
    }





    public String toString() {
        return String.format("O nome é %s e a sua idade é %d!", nome, idade);
    }
}

