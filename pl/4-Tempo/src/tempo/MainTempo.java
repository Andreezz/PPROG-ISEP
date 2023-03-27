package tempo;


public class MainTempo {
    public static void main(String[] args) {
        //a
        tempo t1 = new tempo(5, 30, 12);
        //b
        System.out.println(t1.toString());
        System.out.println(t1.toStringHMS());

        //c
        t1.tick();

        //d
        System.out.println(t1.toString());

        //e
        tempo t2 = new tempo(18,5,20);


        //f
        System.out.println(t2.toString());

        //g
        System.out.println(t1.isMaior(t2));

        //h
        System.out.println(t1.isMaiorHMS(23,7,4));

        //i
        System.out.println(t1.calcularDif(t2));
        //teste da i
        tempo t3 = new tempo(5,30,11);
        System.out.println(t1.calcularDif(t3));


    }
}
