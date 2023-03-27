package data;

public class main {
    public static void main(String[] args) {
        // a/b
        Data data1 = new Data(2022, 03, 9);
        System.out.println(data1.toString());

        // c/d
        Data data2 = new Data(1974 , 04, 25);
        System.out.println(data2.getAno()+"/" + data2.getMes()+"/"+data2.getDia());

        //e
        if (data1.isMaior(data2) == true){
            System.out.println("A primeira data: " + data1.getAno()+"/"+data1.getMes()+"/"+data1.getDia()
                    + " ,é maior do que a segunda data: "+data2.getAno()+"/"+data2.getMes()+"/" +data2.getDia());

        }else
            System.out.println("A segunda data: " + data2.getAno()+"/"+data2.getMes()+"/"+data2.getDia()
                    + " ,é maior do que a primeira data: "+data1.getAno()+"/"+data1.getMes()+"/" +data1.getDia());

        //f
        System.out.println("O número de dias entre data1 e data2 é de: " + data1.calcularDiferenca(data2));

        // g
        int ano = 2022;
        int mes = 12;
        int dia = 25;

        System.out.println("Faltam " + data1.calcularDiferenca(ano, mes, dia) + " dias para o Natal");

        //h
        System.out.println("O 25 de Abril de 1974 calhou numa: " + data2.determinarDiaDaSemana());

        //i

        if (Data.isAnoBissexto(data2.getAno())== true){
            System.out.println("O ano de 1974 é bissexto");
        }else
            System.out.println("O ano de 1974 não é bissexto");

        // ou podia usar...
        //System.out.println(data2.isAnoBissexto(ano));
    }
}
