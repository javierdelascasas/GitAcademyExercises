import javax.swing.*;

public class Ovning_3_3 {
    public static void main(String[] arg){
        String minRadie = JOptionPane.showInputDialog("Skriv cirkelns radie:");
        double r = Double.parseDouble(minRadie);
        double d = r*2;
        double o = Math.PI * d;
        double a = Math.PI * Math.pow(r,2);

        JOptionPane.showMessageDialog(null, "Din cirkels omkrets är: "+o+".\n"+
            "Din cirkels area är: "+a+".");

    }
}
