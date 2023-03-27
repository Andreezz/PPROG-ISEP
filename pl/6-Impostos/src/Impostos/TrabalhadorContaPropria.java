package Impostos;

public class TrabalhadorContaPropria extends ContribuinteComRendimento {
    private String profissao;

    private static final String PROFISSAO_POR_OMISSAO = "sem profissao";

    private float taxaRT = .01f;
    private float taxaOR1 = .02f;
    private float taxaOR2 = .05f;

    public TrabalhadorContaPropria() {
        super();
        profissao = PROFISSAO_POR_OMISSAO;
    }

    public TrabalhadorContaPropria(String nome, String morada, String profissao, float rendimentosTrabalho, float outrosRendimentos) {
        super(nome, morada, rendimentosTrabalho,outrosRendimentos);
        this.profissao = profissao;
    }

    public String getEmpresa() {
        return profissao;
    }

    public void setEmpresa(String profissao) {
        this.profissao = profissao;
    }

    public float getTaxaRT() {
        return taxaRT;
    }

    public float getTaxaOR1() {
        return taxaOR1;
    }

    public float getTaxaOR2() {
        return taxaOR2;
    }

    public void setTaxaRT(float taxaRT) {
        this.taxaRT = taxaRT;
    }

    public void setTaxaOR1(float taxaOR1) {
        this.taxaOR1 = taxaOR1;
    }

    public void setTaxaOR2(float taxaOR2) {
        this.taxaOR2 = taxaOR2;
    }

    public String toString() {
        return super.toString();
    }

    public float calcularImposto() {
        return rendimentosTrabalho * taxaRT + (outrosRendimentos <= 50000 ? taxaOR1 : taxaOR2);
    }
}
