import javax.swing.*;

public class Uppgift_3_2 {
    public static void  main(String[] arg){
        int f = Integer.parseInt(JOptionPane.showInputDialog("Skriv temperaturen i Fahrenheit:"));
        int c = (f-32)*5/9;
        JOptionPane.showMessageDialog(null, f + " grader Fehrenheit är " + c + " grader Celsius.");
    }
}
