import javax.swing.*;

public class Ovning_2_1 {
    public static void main(String[] arg){

        String mittNamn;
        String minAdress;
        String minTelefon;

        mittNamn = "Javier De Las Casas";
        minAdress = "Kilsmogatan 14 - 12470 BANDHAGEN";
        minTelefon = "073-557 99 55";

        String minInfo = mittNamn+"\n"+minAdress+"\n"+minTelefon;

        JOptionPane.showMessageDialog(null, minInfo);
    }
}
