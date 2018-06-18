import javax.swing.*;

public class Uppgift_2_2 {
    public static void main(String[] arg){
        String namn = JOptionPane.showInputDialog("Efternamn, förnamn:");
        int a = namn.indexOf(' ')+1;
        String förnamn = namn.substring(a);
        förnamn = förnamn.toUpperCase();
        JOptionPane.showMessageDialog(null, "Hej "+förnamn);

    }
}
