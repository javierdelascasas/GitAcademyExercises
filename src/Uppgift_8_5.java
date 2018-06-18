import javax.swing.*;

public class Uppgift_8_5 {
    public static void main(String[] arg){

        String nr;

        do {
            nr = JOptionPane.showInputDialog("Skriv ett tal mellan 1-10:");
            if (nr == null){
                JOptionPane.showMessageDialog(null, "Hejdå!");
                break;
            }
            if(checkIn(nr) && checkVa(nr)) {
                int i = Integer.parseInt(nr);
                visaTabell(i);
                break;
            }
        } while (!checkIn(nr) || !checkVa(nr));
    }

    // Kollar om indata har korrekt format
    public static boolean checkIn(String s){
        String control = "abcdefghijklmnopqrstuvwyzåäöABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ";
        boolean check = true;
        if (s.length()>2 || s.equals(" ") || s.equals("")){
            check = false;
        }
        else{
            int r;
            for(int i=0; i<s.length(); i++){
                r = control.indexOf(s.charAt(i));
                if(r>=0){
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    // Kollar om indata har korrekt värde
    public static boolean checkVa(String s){
        boolean check = true;
        int i;
        try{
            i = Integer.parseInt(s);
            if(i<0 || i>10){
                check = false;
            }
        }
        catch(NumberFormatException e){
            check = false;
        }
        return check;
    }

    // Visar tabellen
    public static void visaTabell(int a){
        String tab = "";
        for(int i=1; i<11; i++){
            tab = tab + i + " " + i*a + "\n";
        }
        JOptionPane.showMessageDialog(null,tab);
    }
}
