

public class Automoveis {


    private String matricula;
    private String marca;
    private int cilindrada;

    private static final String MATRICULA_POR_OMISSAO = "sem matrícula";
    private static final String MARCA_POR_OMISSAO = "sem marca";
    private static final int CILINDRADA_POR_OMISSAO = 0;

    private static int totalAutomoveis = 0;

    public Automoveis(String matricula, String marca, int cilindrada) {
        this.matricula = matricula;
        this.marca = marca;
        this.cilindrada = cilindrada;
        totalAutomoveis++;
    }

    public Automoveis(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
        cilindrada = CILINDRADA_POR_OMISSAO;
        totalAutomoveis++;
    }

    public Automoveis(String marca, int cilindrada) {
        matricula = MATRICULA_POR_OMISSAO;
        this.marca = marca;
        this.cilindrada = cilindrada;
        totalAutomoveis++;
    }

    public Automoveis() {
        matricula = MATRICULA_POR_OMISSAO;
        marca = MARCA_POR_OMISSAO;
        cilindrada = CILINDRADA_POR_OMISSAO;
        totalAutomoveis++;
    }
//get
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }
//set
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String toString() {
        return String.format("Automóvel com matrícula %s é um %s e " +
                "tem cilindrada de %d cc", matricula, marca, cilindrada);

        // Alternativa menos eficiente:
        // return "Automóvel com matrícula " + matricula + " é um " + marca +
        //        " e tem cilindrada de " + cilindrada + " cc";

    }

    public int calcularDiferencaCilindrada(Automoveis outroAutomovel) {
        return cilindrada - outroAutomovel.cilindrada;
        // Alternativa:
        // return cilindrada - outroAutomovel.getCilindrada();
    }

    public boolean isCilindradaMaior(Automoveis outroAutomovel) {
        return cilindrada > outroAutomovel.cilindrada;
        // Alternativa:
        // return cilindrada - outroAutomovel.getCilindrada();
    }

    public boolean isCilindradaMaior(int cilindrada) {
        return this.cilindrada > cilindrada;
    }

    public static int getTotalAutomoveis() {
        return totalAutomoveis;
    }

}


