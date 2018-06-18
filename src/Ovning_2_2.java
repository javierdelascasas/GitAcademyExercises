import javax.swing.*;

public class Ovning_2_2 {
    public static void main(String[] arg){

        String mittNamn = "Javier De Las Casas";
        String minAdress = "Kilsmogatan 14 - 12470 BANDHAGEN";
        String minTelefon = "073-557 99 55";

        String minInfo = mittNamn+"\n"+minAdress+"\n"+minTelefon;

        JOptionPane.showMessageDialog(null, minInfo);
    }
}
