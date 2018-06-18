import javax.swing.*;

public class Uppgift_8_1 {
    public static void main(String[] arg){
        int nr = Integer.parseInt(JOptionPane.showInputDialog("Skriv ett heltal"));
        String msg = "";
        switch (tecken(nr)){
            case -1:
                msg = "Ditt tal var ett negativtal.";
                break;
            case 0:
                msg = "Ditt tal var 0.";
                break;
            case 1:
                msg = "Ditt tal var ett positivtal.";
                break;
        }
        JOptionPane.showMessageDialog(null,msg);
    }

    public static int tecken (int i){
        int r;
        if(i<0){
            r=-1;
        } else if (i==0){
            r=0;
        } else {
            r=1;
        }
        return r;
    }
}
