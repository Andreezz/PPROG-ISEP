package Impostos;

public abstract class ContribuinteComRendimento {

    private String nome;
    private String morada;
    public float rendimentosTrabalho;
    public float outrosRendimentos;

    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final String MORADA_POR_OMISSAO = "sem morada";
    private static final float RT_POR_OMISSAO = 0;
    private static final float OR_POR_OMISSAO = 0;

    public ContribuinteComRendimento() {
        nome = NOME_POR_OMISSAO;
        morada = MORADA_POR_OMISSAO;
        rendimentosTrabalho = RT_POR_OMISSAO;
        outrosRendimentos = OR_POR_OMISSAO;
    }

    public ContribuinteComRendimento(String nome, String morada, float rendimentosTrabalho, float outrosRendimentos) {
        this.nome = nome;
        this.morada = morada;
        this.rendimentosTrabalho = rendimentosTrabalho;
        this.outrosRendimentos = outrosRendimentos;
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public float getRendimentosTrabalho() {
        return rendimentosTrabalho;
    }

    public float getOutrosRendimentos() {
        return outrosRendimentos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setRendimentosTrabalho(float rendimentosTrabalho) {
        this.rendimentosTrabalho = rendimentosTrabalho;
    }

    public void setOutrosRendimentos(float outrosRendimentos) {
        this.outrosRendimentos = outrosRendimentos;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nMorada: %s", nome, morada);
    }

    public abstract float calcularImposto();



}
