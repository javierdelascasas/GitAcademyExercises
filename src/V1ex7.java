import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalSize;
import java.nio.charset.Charset;

import java.math.BigInteger;
import java.util.Random;


public class V1ex7 {
    public static void main(String[] arg){

//        int[] input = new int[]{1, 4, 5, 7, 20000, -511, 100, -200, 400};
//        System.out.println("Summan av alla element i arrayen är: " + getSum(input));
//        System.out.println("Det minsta värde i arrayen är: " + input[getMin(input)]);
//        System.out.println("Det största värde i arrayen är: " + input[getMax(input)]);

//        int[] input = new int[]{1, 4, 5, 7, 20000, -511, 100, -200, 400};
//        System.out.println("Summan av alla element i arrayen är: " + getSum(input));
//        System.out.println("Det minsta värde i arrayen är: " + getMin(input));
//        System.out.println("Det största värde i arrayen är: " + getMax(input));

//        for(int i=9; i>0; i--){
//            System.out.println(i);
//        }

//        for(int i=9; i>0; i-=2){
//            System.out.println(i);
//        }

//        for(int i=0; i<10; i++){
//            String s = "";
//            for(int x=0; x<10; x++){
//                if(x<=i){
//                    s = s+Integer.toString(x);
//                } else{
//                    s = s+"*";
//                }
//            }
//            System.out.println(s);
//        }

//        int head = 0;
//        int tail = 0;
//        for(int i=0; i<100; i++){
//            Random rnd = new Random();
//            int toss = rnd.nextInt()%2;
//            if (toss==0){
//                head++;
//            } else{
//                tail++;
//            }
//        }
//        System.out.println("Head: " + head);
//        System.out.println("Tail: " + tail);


//        ===== ====== NR 2 ====== =====
//        int[] input = new int[]{1, 4, 5, 7,20000, -511, 100, -201, 400};
//        int[] result;
//        int resultSize = 0;
//        String s = "";
//        for(int i:input){
//            if(i%2 == 0){
//                s = s + Integer.toString(i) + " ";
//                resultSize++;
//            }
//        }
//        Scanner sc = new Scanner(s);
//        result = new int[resultSize];
//        int index = 0;
//        while(sc.hasNextInt()){
//            result[index] = sc.nextInt();
//            index++;
//        }
//        for (int item : result) {
//            System.out.println(item);
//        }

//        Scanner sc = new Scanner(System.in);
//        boolean loop = true;
//        String nr = "";
//        while(loop) {
//            System.out.println("Skriv ett binär tal:");
//            nr = sc.next();
//            loop = checkBinary(nr);
//        }
//        if(!checkBinary(nr)) {
//            System.out.println(binaryStringToInteger(nr));
//        }


//        boolean[][] board = new boolean[8][8];
//        for(int x=0; x<board.length; x++){
//            boolean status = true;
//            if(x%2==1){
//                status = !status;
//            }
//            for(int y=0; y<board[x].length; y++){
//                if(y%2==0){
//                    board[x][y] = status;
//                } else {
//                    board[x][y] = !status;
//                }
//            }
//        }
//        char c1 = '\u2B1B';
//        char c2 = '\u2B1C';
//        for(int x=0; x<board.length; x++){
//            String rad = "";
//
//            for(int y=0; y<board[x].length; y++){
//                if(board[x][y]){
//                    rad += c1;
//                } else {
//                    rad += c2;
//                }
//            }
//            System.out.println(rad);
//        }

//        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
//        terminal.enterPrivateMode();
//
//        boolean[][] board = new boolean[8][8];
//        for(int x=0; x<board.length; x++){
//            boolean status = true;
//            if(x%2==1){
//                status = !status;
//            }
//            for(int y=0; y<board[x].length; y++){
//                if(y%2==0){
//                    board[x][y] = status;
//                } else {
//                    board[x][y] = !status;
//                }
//            }
//        }
//        char c1 = '\u2B24';
//        char c2 = '\u2B1C';
//        for(int x=0; x<board.length; x++){
//            for(int y=0; y<board[x].length; y++){
//                terminal.moveCursor(x,y);
//                if(board[x][y]){
//                    terminal.applyBackgroundColor(Terminal.Color.WHITE);
//                    terminal.putCharacter(c1);
//                } else {
//                    terminal.applyBackgroundColor(Terminal.Color.RED);
//                    terminal.putCharacter(c2);
//                }
//            }
//        }

        Terminal terminal = TerminalFacade.createTerminal(System.in,System.out,Charset.forName("UTF8"));
        terminal.enterPrivateMode();
        int[][] board = new int[20][20];
        Random rnd = new Random();
        for(int i=0; i<100; i++){
            int x = rnd.nextInt(20);
            int y = rnd.nextInt(20);
            board[x][y] = rnd.nextInt(256);
        }

        for(int x=0; x<board.length; x++){
            for (int y=0; y<board[x].length; y++){
                int color = board[x][y];
                terminal.moveCursor(x,y);
                int f = x*25;
                if(f>255){
                    f = (board[x].length-x)*25;
                }
                terminal.applyBackgroundColor(f,color,color);
                terminal.putCharacter(' ');
            }
        }

    }

//    private static int binaryStringToInteger(String binary){
//        int sum = 0;
//        for(int i=binary.length()-1; i>=0; i--){
//            int exp = (i + 1 - binary.length())*-1;
//            int bin = Integer.parseInt(Character.toString(binary.charAt(i)));
//                sum = sum + ((int) Math.pow(2,exp) * bin);
//            }
//        return sum;
//    }
//
//    private static boolean checkBinary(String s){
//        boolean check = false;
//        String approved = "01";
//        for(int i=0; i<s.length(); i++){
//            if(approved.indexOf(s.charAt(i))<0){
//                check = true;
//                break;
//            }
//        }
//        return check;
//    }

//    private static int getSum(int[] intArray){
//        int sum = 0;
//        for(int i:intArray){
//            sum += i;
//        }
//        return sum;
//    }

//    private static int getMin(int[] intArray){
//        int m = 0;
//        for(int i=0; i<intArray.length; i++){
//            if(intArray[i]<=intArray[m]){
//                m = i;
//            }
//        }
//        return m;
//    }
//
//    private static int getMax(int[] intArray){
//        int m = 0;
//        for(int i=0; i<intArray.length; i++){
//            if(intArray[i]>=intArray[m]){
//                m = i;
//            }
//        }
//        return m;
//    }

//    private static int getMin(int[] intArray){
//        int m = 0;
//        for(int tal:intArray){
//            if(tal<m){
//                m = tal;
//            }
//        }
//        return m;
//    }
//
//    private static int getMax(int[] intArray){
//        int m = 0;
//        for(int tal:intArray){
//            if(tal>m){
//                m = tal;
//            }
//        }
//        return m;
//    }


}
