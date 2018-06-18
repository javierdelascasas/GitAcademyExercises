import javax.swing.*;

public class Ovning_2_5 {
    public static void main(String[] arg){

        // Visar dialogruta för inmatning av förnamn
        String mittNamn = JOptionPane.showInputDialog("Vad heter du i förnamn?");
        // Visar dialogruta för inmatning av efternamn
        String mittEfternamn = JOptionPane.showInputDialog("Vad heter du i efternamn?");
        // Skapar variabel med välkomstext för användaren med info denne har uppget
        String halsning = "Välkommen "+mittNamn+" "+mittEfternamn;

        // Visar dialogruta med välkomsttext
        JOptionPane.showMessageDialog(null, halsning);
    }
}