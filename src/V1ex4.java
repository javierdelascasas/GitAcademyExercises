import java.nio.channels.FileLock;
import java.util.*;

public class V1ex4 {
    public static void main(String[] arg){

//        float f1 = 3.14f;
//        float f2 = 3.14F;
//        float f3 = (float) 3.14;
//
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(f3);

//        float amount = 0;
//
//        amount = amount +0.1f;
//        amount = amount +0.1f;
//        amount = amount +0.1f;
//        amount = amount +0.1f;
//        amount = amount +0.1f;
//        amount = amount +0.1f;
//        amount = amount +0.1f;
//        amount = amount +0.1f;
//        amount = amount +0.1f;
//        amount = amount +0.1f;
//
//        System.out.println(amount);
//
//        double amount1 = 0;
//
//        amount1 = amount1 + 0.1d;
//        amount1 = amount1 + 0.1d;
//        amount1 = amount1 + 0.1d;
//        amount1 = amount1 + 0.1d;
//        amount1 = amount1 + 0.1d;
//        amount1 = amount1 + 0.1d;
//        amount1 = amount1 + 0.1d;
//        amount1 = amount1 + 0.1d;
//        amount1 = amount1 + 0.1d;
//        amount1 = amount1 + 0.1d;
//
//        System.out.println(amount1);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Skriv ett \"float\" värde:");
//        if(sc.hasNextFloat()){
//            float f = sc.nextFloat();
//            System.out.println("Ditt \"float\" " + f + " blir avrundad till " + Math.round(f) + ".");
//        }

//        int min = Integer.MIN_VALUE;
//        int max = Integer.MAX_VALUE;
//        System.out.println("Min och max värde av int:");
//        System.out.println(min);
//        System.out.println(max);
//        byte minb = Byte.MIN_VALUE;
//        byte maxb = Byte.MAX_VALUE;
//        System.out.println("Min och max värde av byte:");
//        System.out.println(minb);
//        System.out.println(maxb);
//        short mins = Short.MIN_VALUE;
//        short maxs = Short.MAX_VALUE;
//        System.out.println("Min och max värde av short:");
//        System.out.println(mins);
//        System.out.println(maxs);
//        long minl = Long.MIN_VALUE;
//        long maxl = Long.MAX_VALUE;
//        System.out.println("Min och max värde av long:");
//        System.out.println(minl);
//        System.out.println(maxl);
//        float minf = Float.MIN_VALUE;
//        float maxf = Float.MAX_VALUE;
//        System.out.println("Min och max värde av float:");
//        System.out.println(minf);
//        System.out.println(maxf);
//        double mind = Double.MIN_VALUE;
//        double maxd = Double.MAX_VALUE;
//        System.out.println("Min och max värde av double:");
//        System.out.println(mind);
//        System.out.println(maxd);

//        System.out.println("int: "+Integer.SIZE);
//        System.out.println("byte: "+Byte.SIZE);
//        System.out.println("short: "+Short.SIZE);
//        System.out.println("long: "+Long.SIZE);
//        System.out.println("float: "+Float.SIZE);
//        System.out.println("double: "+Double.SIZE);

        int x = Integer.MAX_VALUE;
        System.out.println(x);
        x = x+1;
        System.out.println(x);

        byte b = Byte.MAX_VALUE;
        System.out.println(b);
        b = (byte)(b+1);
        System.out.println(b);


    }
}
