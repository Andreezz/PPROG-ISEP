package Impostos;

public class TrabalhadorContaOutrem extends ContribuinteComRendimento {
    private String empresa;

    private static final String EMPRESA_POR_OMISSAO = "sem empresa";

    private float taxaRT1 = .01f;
    private float taxaRT2 = .02f;
    private float taxaOR = .02f;

    public TrabalhadorContaOutrem() {
        super();
        empresa = EMPRESA_POR_OMISSAO;
    }

    public TrabalhadorContaOutrem(String nome, String morada, String empresa, float rendimentosTrabalho, float outrosRendimentos) {
        super(nome, morada, rendimentosTrabalho, outrosRendimentos);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public float getTaxaRT1() {
        return taxaRT1;
    }

    public float getTaxaRT2() {
        return taxaRT2;
    }

    public float getTaxaOR() {
        return taxaOR;
    }

    public void setTaxaRT1(float taxaRT1) {
        this.taxaRT1 = taxaRT1;
    }

    public void setTaxaRT2(float taxaRT2) {
        this.taxaRT2 = taxaRT2;
    }

    public void setTaxaOR(float taxaOR) {
        this.taxaOR = taxaOR;
    }

    public String toString() {
        return super.toString();
    }

    public float calcularImposto() {
        return rendimentosTrabalho * (rendimentosTrabalho <= 30000 ? taxaRT1 : taxaRT2)
                + outrosRendimentos * taxaOR;
    }
}
