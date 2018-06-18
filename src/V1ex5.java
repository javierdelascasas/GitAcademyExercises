import java.util.Scanner;

public class V1ex5 {
    public static void main(String[] arg){

//        int x = 42;
//        System.out.println(x);
//        System.out.println(x++);
//        System.out.println(x);
//        System.out.println(++x);
//        System.out.println(x);

//        int x = 42;
//        x += 100;
//        x -= 23;
//        x *= 2;
//        x /= 5;
//        System.out.println(x);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Skriv en heltal:");
//        if(sc.hasNextInt()){
//            int i = sc.nextInt();
//            int rest = i%2;
//            if(rest==1){
//                System.out.println("Talet " + i + " är udda.");
//            }
//            else{
//                System.out.println("Talet " + i + " är jämt.");
//            }
//
//        }

//        for (int x=0; x<30; x++){
//            System.out.println(x%5);
//        }

//        Om x = -5 är output "Output3"
//        Om x = 0 är output "Output1"
//        Om x = 5 är output "Output2"

//        if(x > -1){
//            if(x == 0){
//                System.out.println("Output1");
//            }
//            else{
//                System.out.println("Output2");
//            }
//        }
//        System.out.println("Output3");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ange din ålder:");
//        if(sc.hasNextInt()){
//            int age = sc.nextInt();
//            if(age<0 || age>120){
//                System.out.println("Du är antingen ofödd eller död...");
//            }
//            else if(age>0 && age<=20) {
//                System.out.println("Under age");
//            }
//            else if(age>20 && age<40){
//                System.out.println("Youg adult");
//            }
//            else if(age>=40 && age<=60){
//                System.out.println("Middle aged");
//            }
//            else{
//                System.out.println("Old");
//            }
//        }

//        for(int i=1; i<=100; i++){
//            String s = "";
//            if(i%3==0){
//                s += "Fizz";
//            }
//            if(i%5==0){
//                s += "Buzz";
//            }
//            if(i%3!=0 && i%5!=0){
//                System.out.println(i);
//            }
//            else{
//                System.out.println(s);
//            }
//        }

//        for(int i=0; i<100; i++){
//            if(!(i<6 || i>10)){
//                System.out.println(i);
//            }
//        }

//        for(int i=0; i<100; i++){
//            if(i>=5 && i<=10 || i == 42){
//                System.out.println(i);
//            }
//        }
//        for(int i=0; i<100; i++){
//            if(!(i<=41 || i>=43) || !(i<5 || i>10) ){
//                System.out.println(i);
//            }
//        }
//        for(int i=0; i<100; i++){
//            if(!(i<5) && !(i>10) || (!(i<=41) && !(i>=43))){
//                System.out.println(i);
//            }
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv ett årtal:");
        if(sc.hasNextInt()){
            int year = sc.nextInt();
            if(year%4!=0){
                System.out.println("Årtalet " + year + " är inte skottår.");
            }
            else if(year%100!=0){
                System.out.println("Årtalet " + year + " är skottår.");
            }
            else if(year%400!=0){
                System.out.println("Årtalet " + year + " är inte skottår.");
            }
            else{
                System.out.println("Årtalet " + year + " är skottår.");
            }
        }

    }
}
