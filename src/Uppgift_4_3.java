import javax.swing.*;


public class Uppgift_4_3 {
    public static void main(String[] arg){
        String postnr = JOptionPane.showInputDialog("Skriv ett postnummer: ");
        String index = postnr.substring(0,2);
        int i = Integer.parseInt(index);

        if (i<10){
            JOptionPane.showMessageDialog(null, "Ogiltig postnummer");
        }
        else {
            if((i>19 && i<63) || (i>64 && i<67)){
                JOptionPane.showMessageDialog(null, "Postnumret " + postnr + " tillhör Götaland.");
            }
            else if(i>79){
                JOptionPane.showMessageDialog(null, "Postnumret " + postnr + " tillhör Norrland.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Postnumret " + postnr + " tillhör Svealand.");
            }
        }
    }
}
