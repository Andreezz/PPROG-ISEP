package ginasio;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        utentes u1 = new utentes();
        utentes u2 = new utentes("Joao", "masculino", 40, 1.80, 80);


        System.out.println("Introduza o nome do utente: ");
        u1.setNome(ler.nextLine());

        System.out.println("Introduza o gênero do utente: ");
        u1.setGenero(ler.nextLine());

        System.out.println("Introduza a idade do utente: ");
        u1.setIdade(ler.nextInt());

        System.out.println("Introduza a altura do utente: ");
        u1.setAltura(ler.nextDouble());

        System.out.println("Introduza o peso do utente: ");
        u1.setPeso(ler.nextDouble());


        System.out.println(u1.toString());
        System.out.println(u1.grauObesidade());

        System.out.println(u2.toString());
        System.out.println(u2.grauObesidade());

        System.out.println("");
        System.out.println("A diferença de idade entre " + u1.getNome() + " e o " + u2.getNome() + " é de: " + Math.abs(u1.calcularDifereça(u2.getIdade())) + " anos");
        System.out.println("");
        System.out.println("O IMC do " + u1.getNome() + " é de: " + u1.calcularIMC());
        System.out.println("");

        u1.maisVelho(u2.getNome(), u2.getIdade());

        System.out.println("Número de instâncias criadas: " + utentes.getTotalUtentes());

    }

}
