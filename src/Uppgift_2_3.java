import javax.swing.*;

public class Uppgift_2_3 {
    public static void main(String[] arg){
        String mening = JOptionPane.showInputDialog("Skriv en mening (minst 2 ord):");
        int a = mening.length();
        int b = mening.indexOf(' ');
        int c = mening.lastIndexOf(' ')+1;
        String forsta = mening.substring(0,b);
        String sista = mening.substring(c);

        JOptionPane.showMessageDialog(null,"Meningen har "+a+" karaktärer.\n"+
            "Första ordet är \""+forsta+"\".\n"+
            "Sista ordet är \""+sista+"\".");
    }
}
