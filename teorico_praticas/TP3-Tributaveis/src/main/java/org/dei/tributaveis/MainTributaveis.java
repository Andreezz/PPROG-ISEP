package org.dei.tributaveis;

public class MainTributaveis {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("22-33-CC", 1000, "encarnado");
        System.out.println("v1: " + v1);

        Veiculo v2 = new Veiculo("44-55-CL", 2500, Cores.AZUL);
        System.out.println("v2: " + v2);

        Veiculo v3 = new Veiculo("33-45-RF", 1000, Veiculo.VERDE);
        System.out.println("v3: " + v3);

        Moradia m1 = new Moradia("Rua 25 de Abril", 90, Moradia.CINZENTO);
        System.out.println("m1 :" + m1);

        //Cores obj;
        Tributavel obj;

        obj = v2;
        System.out.println("\nObj (v2): " + obj);
        System.out.println("Imposto Obj: " + obj.calcularImposto()); // polimorfismo (Tributavel)

        obj = m1;
        System.out.println("Obj (m1): " + obj);
        System.out.println("Imposto Obj: " + obj.calcularImposto()); // polimorfismo (Tributavel)

        System.out.println("\nImposto v2: " + v2.calcularImposto());
        System.out.println("Imposto m1: " + m1.calcularImposto());

    }
}

