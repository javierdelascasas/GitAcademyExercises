import javax.swing.*;

public class Ovning_2_9 {
    public static void  main(String[] arg){
        String a = " Erik Andersson 860314-2714   ";
        a = a.trim();
        int i = a.lastIndexOf(' ')+3;
        int j = a.indexOf('-')-2;
        int g = a.lastIndexOf(' ')+5;
        int h = a.indexOf('-');
        String b = a.substring(i,j);
        String c = a.substring(g,h);

        JOptionPane.showMessageDialog(null, c +"/"+ b);
    }
}
