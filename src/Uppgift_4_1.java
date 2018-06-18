import javax.swing.*;

public class Uppgift_4_1 {
    public static void main(String[] arg){
        String min = JOptionPane.showInputDialog("Hur många minuter ska du ringa för?");
        int m = Integer.parseInt(min);

        if (m<34){
            JOptionPane.showMessageDialog(null, "Du borde ha abonnemang Kontant.");
        }
        else if (m>33 && m<67){
            JOptionPane.showMessageDialog(null, "Du borde ha abonnemang Normal.");
        }
        else{
            JOptionPane.showMessageDialog(null,"Du borde ha abonnemang Plus.");
        }
    }
}
