import javax.swing.*;

public class Uppgift_3_1 {
    public static void  main(String[] arg){
        double r = Double.parseDouble(JOptionPane.showInputDialog("Skriv sfärens radie:"));
        double v = (4*Math.PI*Math.pow(r,3))/3;
        double a = 4*Math.PI*Math.pow(r,2);
        JOptionPane.showMessageDialog(null, "Sfärens volym är: " + v + "\n" +
                "Sfärens area är: " + a);
    }
}
