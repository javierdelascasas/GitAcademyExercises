import javax.swing.*;
import java.util.Calendar;

public class Uppgift_2_1 {
    public static void main(String[] arg){
        String datumtid = Calendar.getInstance().getTime().toString();
        String tid = datumtid.substring(11,19);
        JOptionPane.showMessageDialog(null, "Klockan är: "+tid);
    }
}
