import javax.swing.*;

public class Uppgift_5_5 {
    public static void main(String[] arg){
        String antal = JOptionPane.showInputDialog("Hur många rader?");
        int n = Integer.parseInt(antal);
        String text = "";

        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                text = text + j*i + " ";
            }
            text = text + "\n";
        }
        JOptionPane.showMessageDialog(null,text);
    }
}
