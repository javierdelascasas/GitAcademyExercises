import javax.swing.*;

public class Uppgift_5_8 {
    public static void  main(String[] arg){
        String text = JOptionPane.showInputDialog("Skriv en text för att se om den är ett palindrom:");
        String bak = "";
        String bl = " ";
        while(text.endsWith(bl)){
            text = text.substring(0,text.length()-1);
        }
        for (int i=text.length()-1; i>=0; i--) {
            bak = bak + text.charAt(i);
        }
        if(text.equalsIgnoreCase(bak)){
            JOptionPane.showMessageDialog(null,"Ja! din text är en palindrom!\n" +
                    text + " - " + bak);
        }
        else{
            JOptionPane.showMessageDialog(null,"Tyvärr, din text är inte ett palindrom...\n" +
                    text + " - " + bak, "Oh no...", JOptionPane.ERROR_MESSAGE);
        }
    }
}
