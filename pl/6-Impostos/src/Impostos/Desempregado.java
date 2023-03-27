package Impostos;

public class Desempregado extends ContribuinteSemRendimento {
    public static float taxaOR = .02f;

    public Desempregado() {
        super();
    }

    public Desempregado(String nome, String morada, float outrosRendimentos, int mesesParagem) {
        super(nome, morada, outrosRendimentos, mesesParagem);
    }

    public float getTaxaRT() {
        return taxaOR;
    }

    public static void setTaxa(float novaTaxa) {
        taxaOR = novaTaxa;
    }

    public String toString() {
        return super.toString();
    }

    public float calcularImposto() {
        return outrosRendimentos * taxaOR;
    }
}