import javax.swing.*;

public class Ovning_2_3 {
    public static void main(String[] arg){

        String mittNamn = JOptionPane.showInputDialog("Vad heter du i förnamn?");
        String mittEfternamn = JOptionPane.showInputDialog("Vad heter du i efternamn?");
        String halsning = "Välkommen "+mittNamn+" "+mittEfternamn;

        JOptionPane.showMessageDialog(null, halsning);
    }
}