import javax.swing.*;
import java.util.Calendar;

public class Uppgift_4_5 {
    public static void main(String[] arg){
        String idag = Calendar.getInstance().getTime().toString();

        String pnr = JOptionPane.showInputDialog("Skriv ditt personnummer (ååmmddxxxx):");
        if(pnr.length()==10){

            String f = pnr.substring(2,6);

            String strM = idag.substring(4,7);
            String d = idag.substring(8,10);
            String m = "";
            switch(strM){
                case "Jan":
                    m = "01";
                    break;
                case "Feb":
                    m = "02";
                    break;
                case "Mar":
                    m = "03";
                    break;
                case "Apr":
                    m = "04";
                    break;
                case "Maj":
                    m = "05";
                    break;
                case "Jun":
                    m = "06";
                    break;
                case "Jul":
                    m = "07";
                    break;
                case "Aug":
                    m = "08";
                    break;
                case "Sep":
                    m = "09";
                    break;
                case "Okt":
                    m = "10";
                    break;
                case "Nov":
                    m = "11";
                    break;
                case "Dec":
                    m = "12";
                    break;
            }

            idag = m+d;
            if(idag.equals(f)){
                JOptionPane.showMessageDialog(null, "Grattis på födelsedagen!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Inte än...");
            }

        }
        else{
            JOptionPane.showMessageDialog(null, "Fel längd på numret.");
        }
    }
}
