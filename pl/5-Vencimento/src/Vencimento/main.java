package Vencimento;

public class main {
    public static void main(String[] args) {
        //3.
        //a
        TrabalhadorPeca tp1 = new TrabalhadorPeca("Jorge Silva", 53, 62);
        //b
        TrabalhadorComissao tc1 = new TrabalhadorComissao("Susana Ferreira", 650, 2731.5f, 4.50f);
        //c
        TrabalhadorHora th1 = new TrabalhadorHora("Carlos Miguel", 168, 4.50f);
        //4.
        Trabalhador[] trabalhadores = new Trabalhador[10];
        //5.
        trabalhadores[0] = tp1;
        trabalhadores[1] = tc1;
        trabalhadores[2] = th1;
        //6.
        System.out.println("listagem das representações textuais dos trabalhadores;\n");

        // todas as informações acerca dos trabalhadores
        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] != null) {
                System.out.println(trabalhadores[i].toString());
                System.out.println("*******************************************");
            }
        }

        //apenas trabalhadores por hora + vencimento
        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] instanceof TrabalhadorHora) {
                System.out.println(trabalhadores[i].toString());
                System.out.println(String.format("Nome:%s%nVencimento: %.2f", trabalhadores[i].getNome(), ((TrabalhadorHora) trabalhadores[i]).calcularVencimento()));
            }
        }
        System.out.println("*******************************************");
        //apenas trabalhadores por comissao + vencimento
        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] instanceof TrabalhadorComissao) {
                System.out.println(trabalhadores[i].toString());
                System.out.println(String.format("Nome:%s%nVencimento: %.2f", trabalhadores[i].getNome(), ((TrabalhadorComissao) trabalhadores[i]).calcularVencimento()));
            }
        }
        System.out.println("*******************************************");
        //apenas trabalhadores por peça + vencimento
        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] instanceof TrabalhadorPeca) {
                System.out.println(trabalhadores[i].toString());
                System.out.println(String.format("Nome:%s%nVencimento: %.2f", trabalhadores[i].getNome(), ((TrabalhadorPeca) trabalhadores[i]).calcularVencimento()));

            }
        }
        System.out.println("*******************************************");


    }


}
