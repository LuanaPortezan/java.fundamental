package conceitos.tipos.de.dados;

public class tipos {

    public static void tipos(String[] args){

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
       // short s2 = 40000; // ultrapassa o limite do short

        //int i1 = -100000000000; //ultrapassa o limite inferior
        int i2 = 28500;

        long l1 = 100000000000000000L;
        long l2 = 2000400500000600007L;

        //float f1 = 4.5; //só numero o java acha q é um double
        float f2 = 10.56F;

        double d1 = 85.69;
        double d2 = 99.84D;

        char c1 = 'W';
        //char c2 = 'Tw';//só pode ser um caractere
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cícrano";
        String st3 = " ahhd udhfkjh ihdakhd798798 dhiuadhkjdhkj";

        //String dt1 = "09/04/1989";//data tem um palavra reservada

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);






    }





}
