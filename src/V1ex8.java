import java.util.Scanner;

public class V1ex8 {
    public static void main(String[] args) {

//        char[] a = {'J', 'a', 'v', 'a', 'R', 'u', 'l', 'e', 's'};
//        String s = "";
//        for (int i = a.length-1; i >= 0; i--) {
//            s += a[i];
//        }
//        System.out.println(s);

//        char[] a = {'J', 'a', 'v', 'a', 'R', 'u', 'l', 'e', 's'};
//        String s = "";
//        for (int i = 0; i < a.length; i+=2) {
//            s += a[i];
//        }
//        System.out.println(s);

//        char[] a = {'J', 'a', 'v', 'a', 'R', 'u', 'l', 'e', 's'};
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i < a.length; i++) {
//            s.append(a[i]);
//        }
//        System.out.println(s);

//        String name = "Java Svensson";
//        char[] letters = new char[name.length()];
//        for (int i = 0; i < name.length(); i++) {
//            letters[i] = name.charAt(i);
//        }
//        for (int i = 0; i < letters.length; i++) {
//            System.out.print(letters[i]);
//        }

//        String input = "1,2,4,9,8,7,6,4,1";
//        int max = 0;
//        for (int i = 0; i < input.length(); i+=2) {
//            max++;
//        }
//        int[] numbers = new int[max];
//        int index = 0;
//        for (int i = 0; i < input.length(); i+=2) {
//            numbers[index] = Character.getNumericValue(input.charAt(i));
//            index++;
//        }
//        for(int i:numbers){
//            System.out.print(i);
//        }

//        char[] ascii = new char[128];
//        for (int i = 0; i < ascii.length; i++) {
//            ascii[i] = (char) i;
//        }
//        System.out.printf("%4s\t%4s\t%s%n","HEX","DEC","CHAR");
//        for(int i=0; i<ascii.length; i++){
//            String hx = String.format("%4x",(int)ascii[i]);
//            System.out.printf("%4s\t%4d\t%c%n",hx,i,ascii[i]);
//        }

//        Scanner sc = new Scanner(System.in);
//        if(sc.hasNextLine()) {
//            String s = sc.nextLine();
//            if(checkStr(s)){
//                System.out.println("OK");
//            } else {
//                System.out.println("Input error");
//            }
//        }

        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLine()){
            StringBuilder sb = new StringBuilder(sc.nextLine());
            //Check and remove +46
            if(check46(sb.toString())){
                sb.delete(0,3);
            }
            while(sb.indexOf(".")>=0){
                int i = sb.indexOf(".");
                sb.deleteCharAt(i);
            }
            System.out.println(sb);
        }

    }

    private static boolean check(String s){
        boolean check = true;
        if(check46(s)){
            check = false;
        }
        return check;
    }
    private static boolean check46(String s){
        boolean check = false;
        if(s.startsWith("+46")){
            check = true;
        }
        return check;
    }

//    private static boolean checkStr(String s){
//        boolean check = true;
//        if(s.length()>=4 && s.length()<=8){
//            if(!Character.isDigit(s.charAt(0)) || !Character.isDigit(s.charAt(1))) {
//                check = false;
//            }
//        }
//        return check;
//    }

}
