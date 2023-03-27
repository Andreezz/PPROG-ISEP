package tempo;

/**
 * @author 1210804
 */
public class tempo {

    //variavéis
    private int hora;
    private int minuto;
    private int segundo;
    private static int count;

    //variaveis default
    private static final int HORA_POR_OMISSAO = 0;
    private static final int MINUTO_POR_OMISSAO = 0;
    private static final int SEGUNDO_POR_OMISSAO = 0;

    //construtores e sets e gets
    public tempo() {
        hora = HORA_POR_OMISSAO;
        minuto = MINUTO_POR_OMISSAO;
        segundo = SEGUNDO_POR_OMISSAO;
        count++;
    }

    public tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        count++;
    }

    public tempo(int minuto, int segundo) {
        this.minuto = minuto;
        this.segundo = segundo;
        count++;
    }

    public tempo(int segundo) {
        this.segundo = segundo;
        count++;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    //tostring para mostrar a data com pm ou am
    public String toString() {
        return String.format("%02d:%02d:%02d %s",
                ((hora == 12 || hora == 0) ? hora : hora % 12),
                minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }

    //tostring para mostrar a data normal
    public String toStringHMS() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
//Adicionar 1 segundo ao tempo

    public void tick() {
        segundo = ++segundo % 60;

        if (segundo == 0) {
            minuto = ++minuto % 60;
        }

        if (minuto == 0) {
            hora = ++hora % 24;
        }
    }

    //calcula os segundos de uma data
    private int calcularSegundos() {
        int segundos = hora * 3600 + minuto * 60 + segundo;

        return segundos;
    }

    //calcula os segundos de uma data dada
    private int calcularSegHMS(int hora, int minuto, int segundo) {
        int segundos = hora * 3600 + minuto * 60 + segundo;

        return segundos;
    }

    //verifica qual das datas é maior tempo como parametro uma instacia de tempo
    public String isMaior(tempo outroTempo) {
        if (calcularSegundos() > outroTempo.calcularSegundos()) {
            return String.format("O " + outroTempo + " é menor!");
        } else return String.format("O " + outroTempo + " é maior!");

    }

    //verifica qual das datas é maior tempo como parametro uma outra data
    public String isMaiorHMS(int hora, int minuto, int segundo) {
        if (calcularSegundos() > calcularSegHMS(hora, minuto, segundo)) {
            return String.format("O %02d:%02d:%02d é menor!" ,hora,minuto,segundo);
        } else return String.format("O %02d:%02d:%02d é maior!" ,hora,minuto,segundo);


    }

    //calcula a difereça de tempo e segundos
    public int calcularDif(tempo outroTempo) {
        int resultado = Math.abs(calcularSegundos() - outroTempo.calcularSegundos());
        return resultado;
    }


    }




