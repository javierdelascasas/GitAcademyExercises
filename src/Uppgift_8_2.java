import javax.swing.*;

public class Uppgift_8_2 {
    public static void main(String[] arg){
        double a_pris = Double.parseDouble(JOptionPane.showInputDialog("Pris exk. moms:"));
        int moms = Integer.parseInt(JOptionPane.showInputDialog("Momsats:"));
        double t_pris = berPris(a_pris,moms);
        JOptionPane.showMessageDialog(null, "Total pris (inkl. " + moms + "% moms) är:\n" +
                t_pris);
    }

    public static double berPris(double a, int b){
        double p = a+(a*b*0.01);
        return p;
    }
}
