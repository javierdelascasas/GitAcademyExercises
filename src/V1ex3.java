import java.util.*;
import java.io.*;

public class V1ex3 {
    public static void main(String[] arg) throws FileNotFoundException{

//        ===== printf =====

//        System.out.println("Line 1");
//        System.out.println("Line 2");
//        System.out.println("Line 3");

//        String a = "Line 1";
//        String b = "Line 2";
//        String c = "Line 3";
//        System.out.printf("%s%n%s%n%s",a,b,c);


//        System.out.print("Line 1%n");
//        System.out.println("Line 1%n");
//        System.out.printf("Line 1%n");

//        String name = "Java";
//        int x = 42;
//        float f = 3.14f;
//        System.out.printf("%s %f %d", name, f, x);

//        int x = 12;
//        int y = 345;
//        int z = 6789;
//        System.out.printf("%4d%n%4d%n%4d%n", x, y, z);
//
//        System.out.printf("%04d%n%04d%n%04d%n", x, y, z);


//        ===== Scanner =====

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Skriv in 3 nummer (använd en rad per nummer");
//        int nr1 = Integer.parseInt(sc.nextLine());
//        int nr2 = Integer.parseInt(sc.nextLine());
//        int nr3 = Integer.parseInt(sc.nextLine());
//        System.out.printf("%d %d %d", nr1, nr2, nr3);

//        Scanner sc = new Scanner("123 232 2323");
//        while (sc.hasNext()){
//            System.out.println(sc.next());
//        }

        File file = new File("./resources/hello.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();


    }
}
