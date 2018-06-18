import javax.swing.*;

public class Uppgift_5_4 {
    public static void main(String[] arg){
        String text = JOptionPane.showInputDialog("Skriv en rad:");
        String bak = "";
        for(int i=text.length()-1; i>=0; i--){
            bak = bak + text.charAt(i);
        }
        JOptionPane.showMessageDialog(null, "Din text baklänges:\n" + bak);
    }
}
