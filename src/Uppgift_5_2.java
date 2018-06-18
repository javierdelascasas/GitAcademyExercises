import javax.swing.*;

public class Uppgift_5_2 {
    public static void main(String[] arg){
        String tab = "";
        int i = 1;
        do {
            tab = tab + i + " " + i*i + " " + i*i*i + "\n";
            i++;
        } while (i < 13);
        JOptionPane.showMessageDialog(null,tab);
    }
}
