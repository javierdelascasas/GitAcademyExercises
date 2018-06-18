import java.util.*;

public class V1ex6 {
    public static void main(String[] arg){

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Välj en färg genom att skriva respektive nummer:");
//        System.out.printf("%2d\t%s%n%2d\t%s%n%2d\t%s%n%2d\t%s%n",1,"Black",2,"White",3,"Red",4,"Green");
//        if(sc.hasNextInt()) {
//            int choice = sc.nextInt();
//            String color = "";
//            switch(choice){
//                case 1:
//                    color = "Black";
//                    break;
//                case 2:
//                    color = "White";
//                    break;
//                case 3:
//                    color = "Red";
//                    break;
//                case 4:
//                    color = "Green";
//                    break;
//                default:
//                    color = "ingen färg";
//                    break;
//            }
//            System.out.println("Du valde " + color + ".");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Välj en färg genom att skriva respektive nummer:");
//        System.out.printf("%2c\t%s%n%2c\t%s%n%2c\t%s%n%2c\t%s%n",'a',"Black",'b',"White",'c',"Red",'d',"Green");
//        if(sc.hasNext()) {
//            char choice = sc.next().charAt(0);
//            String color = "";
//            switch(choice){
//                case 'a':
//                    color = "Black";
//                    break;
//                case 'b':
//                    color = "White";
//                    break;
//                case 'c':
//                    color = "Red";
//                    break;
//                case 'd':
//                    color = "Green";
//                    break;
//                default:
//                    color = "ingen färg";
//                    break;
//            }
//            System.out.println("Du valde " + color + ".");
//        }

//        char input = 'b';
//        switch(input){
//            case 'a':
//                System.out.println("Airplane");
//                break;
//            case 'b':
//                System.out.println("Boat");
//
//            case 'c':
//                System.out.println("Car");
//                break;
//
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Välj en färg genom att skriva respektive nummer:");
//        System.out.printf("%2c\t%s%n%2c\t%s%n%2c\t%s%n%2c\t%s%n%2c\t%s%n%2c\t%s%n%2c\t%s%n",
//                'a',"Black",'b',"White",'c',"Red",'d',"Green",'w',"White",'W',"White",'v',"White");
//        if(sc.hasNext()) {
//            char choice = sc.next().charAt(0);
//            String color = "";
//            switch(choice){
//                case 'a':
//                    color = "Black";
//                    break;
//                case 'b':
//                case 'w':
//                case 'W':
//                case 'v':
//                    color = "White";
//                    break;
//                case 'c':
//                    color = "Red";
//                    break;
//                case 'd':
//                    color = "Green";
//                    break;
//                default:
//                    color = "ingen färg";
//                    break;
//            }
//            System.out.println("Du valde " + color + ".");
//        }

//        Scanner stdin = new Scanner(System.in);
//        int choice = 0;
//
//        System.out.println("Please enter your choice (1-4):");
//        choice = stdin.nextInt();
//
//        switch(choice){
//            case 1:
//                System.out.println("You selected 1.");
//                break;
//            case 2:
//            case 3:
//                System.out.println("You selected 2 or 3.");
//                break;
//            case 4:
//                System.out.println("You selected 4.");
//            default:
//                System.out.println("Please enter a choice between 1-4.");
//        }

//        Scanner sc = new Scanner(System.in);
//            System.out.println("================================");
//            System.out.println("======= ENKEL KALKYLATOR =======");
//            System.out.println("================================");
//            System.out.println("Var god knappa in första talet:");
//            int nr1 = sc.nextInt();
//            System.out.println("Var god knappa in andra talet:");
//            int nr2 = sc.nextInt();
//            System.out.println("Var god knappa in operationstecken: + - * /");
//            char ope = sc.next().charAt(0);
//            switch (ope){
//                case '+':
//                    System.out.println("Resultat: " + add(nr1,nr2));
//                    break;
//                case '-':
//                    System.out.println("Resultat: " + sub(nr1,nr2));
//                    break;
//                case '*':
//                    System.out.println("Resultat: " + mul(nr1,nr2));
//                    break;
//                case '/':
//                    System.out.printf("Resultat: %f", div(nr1,nr2));
//                    break;
//                default:
//                    System.out.println("Ogiltig operationstecken.");
//                    break;
//            }


//        char input = 'c'; //try with a, b, c here
//        switch (input) {
//            case 'a':
//                handlea();
//                break;
//            case 'b':
//                handleb();
//                break;
//            case 'c':
//                handlec();
//                break;
//        }

        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while(loop) {
            System.out.println("Skriv en bokstav:");
            if (sc.hasNextLine()) {
                char dinBokstav = sc.next().charAt(0);
                switch (dinBokstav){
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                    case 'y':
                    case 'Y':
                    case 'å':
                    case 'Å':
                    case 'ä':
                    case 'Ä':
                    case 'ö':
                    case 'Ö':
                        System.out.println(dinBokstav + " är en vokal.");
                        break;
                    default:
                        System.out.println(dinBokstav + " är en konsonant.");

                }
            }
        }

    }


    private static void handlec() {
        System.out.println("You pressed 'c'");
        System.out.println("The sum of the 10 first numbers are ");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }

    private static void handlea() {
        System.out.println("You pressed 'a'");
    }

    private static void handleb() {
        System.out.println("You pressed 'b' and here's 10 numbers");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static int add(int nr1, int nr2){
        return nr1 + nr2;
    }
    public static int sub(int nr1, int nr2){
        return nr1 - nr2;
    }
    public static int mul(int nr1, int nr2){
        return nr1 * nr2;
    }
    public static double div(int nr1, int nr2){
        double d = (double) nr1/nr2;
        return d;
    }
}
