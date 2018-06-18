import javax.swing.*;

public class Uppgift_4_2 {
    public static void main(String[] arg){
        String minRadie = JOptionPane.showInputDialog("Skriv cirkelns radie:");
        double r = Double.parseDouble(minRadie);
        if (r>0) {
            double d = r * 2;
            double o = Math.PI * d;
            double a = Math.PI * Math.pow(r, 2);

            JOptionPane.showMessageDialog(null, "Din cirkels omkrets är: " + o + ".\n" +
                    "Din cirkels area är: " + a + ".");
        }
        else {
            JOptionPane.showMessageDialog(null,"Värdet måste vara större än 0.");
        }

    }
}
