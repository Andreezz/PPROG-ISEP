package Impostos;

public class Reformado extends ContribuinteComRendimento {

    private float taxaRT = .01f;
    private float taxaOR = .03f;

    public Reformado() {
        super();
    }

    public Reformado(String nome, String morada, float rendimentoTrabalho, float outrosRendimentos) {
        super(nome, morada, rendimentoTrabalho, outrosRendimentos);
    }

    public float getTaxaRT() {
        return taxaRT;
    }

    public float getTaxaOR() {
        return taxaOR;
    }

    public void setTaxaRT(float taxaRT) {
        this.taxaRT = taxaRT;
    }

    public void setTaxaOR(float taxaOR) {
        this.taxaOR = taxaOR;
    }

    public String toString() {
        return super.toString();
    }

    public float calcularImposto() {
        return (rendimentosTrabalho * taxaRT + outrosRendimentos * taxaOR);
    }
}
