package Cumprimentar;

/**
 * @author 1210804
 */

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Exercícicio 1


            System.out.println("Introduza o seu nome:");
            String nome = ler.nextLine();
            System.out.println("Olá " + nome);



        //Exercício 2
        Identidade c1 = new Identidade();
        System.out.println("Introduza o seu nome:");
        c1.SetNome(ler.nextLine());
        //Exercício 3
        System.out.println("Introduza a sua idade:");
        c1.SetIdade(ler.nextInt());

        System.out.println(c1.toString());


    }
}
