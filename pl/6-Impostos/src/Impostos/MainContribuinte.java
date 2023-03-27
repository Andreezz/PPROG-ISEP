package Impostos;

public class MainContribuinte {

    public static void main(String[] args) {

        Reformado cr1 = new Reformado("António Silva", "Rua 25 de Abril, 10", 12500, 4500);
        TrabalhadorContaOutrem tco1 = new TrabalhadorContaOutrem("José Pereira", "Avenida 25 de Abril, 7", "Randstad", 9500, 1500);
        TrabalhadorContaPropria tcp1 = new TrabalhadorContaPropria("Pedro Sousa", "Praça do Comércio, 2", "Engenheiro", 5000, 51000);
        Desempregado d1 = new Desempregado("Zé", "Lugar do Sossego, casa 2", 10000, 6);

        System.out.printf("%s%nImposto extraordinário: %.2f%n%n", cr1.toString(), cr1.calcularImposto());
        System.out.printf("%s%nImposto extraordinário: %.2f%n%n", tco1.toString(), tco1.calcularImposto());
        System.out.printf("%s%nImposto extraordinário: %.2f%n%n", tcp1.toString(), tcp1.calcularImposto());
        System.out.printf("%s%nImposto extraordinário: %.2f%n%n", d1.toString(), d1.calcularImposto());

        System.out.println("4. a/b/c/d");
        Object[] contribuintes = new Object[10];

        contribuintes[0] = cr1;
        contribuintes[1] = tco1;
        contribuintes[2] = tcp1;
        contribuintes[3] = d1;

        for (int i = 0; i < contribuintes.length; i++) {
            if (contribuintes[i] instanceof Reformado) {
                System.out.printf("%s%nImposto extraordinário: %.2f%n%n", contribuintes[i].toString(), ((Reformado) contribuintes[i]).calcularImposto());
            }

            if (contribuintes[i] instanceof TrabalhadorContaOutrem) {
                System.out.printf("%s%nImposto extraordinário: %.2f%n%n", tco1.toString(), ((TrabalhadorContaOutrem) contribuintes[i]).calcularImposto());
            }

            if (contribuintes[i] instanceof TrabalhadorContaPropria) {
                System.out.printf("%s%nImposto extraordinário: %.2f%n%n", tcp1.toString(), ((TrabalhadorContaPropria) contribuintes[i]).calcularImposto());
            }

            if (contribuintes[i] instanceof Desempregado) {
                System.out.printf("%s%nImposto extraordinário: %.2f%n%n", d1.toString(), ((Desempregado) contribuintes[i]).calcularImposto());
            }
        }

        System.out.println("4. e/f");
        Desempregado.setTaxa(.01f);

        for (int i = 0; i < contribuintes.length; i++) {

            if (contribuintes[i] instanceof Desempregado) {
                System.out.printf("%s%nImposto extraordinário: %.2f%n%n", d1.toString(), ((Desempregado) contribuintes[i]).calcularImposto());
            }
        }
    }
}