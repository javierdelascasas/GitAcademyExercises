import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Logging {
//    private String logstr;
//    private int amount;
//    private String fromAccount;
//    private String toAccount;
//    private int paymentCost;

    public static void createLog(int amount,String fromAccount,String toAccount,int paymentCost) throws IOException {
        String logstr;
        logstr = "Bank auditlog" + "\r\n";
        startLogEntry(logstr);
        logstr = "Doing a desposit of " + amount + " Sek from " + fromAccount + " to "
                + toAccount + "\r\n";
        appendLogEntry(logstr);
        logstr = "Payment cost" + paymentCost + "\r\n";
        appendLogEntry(logstr);
    }

    private static void startLogEntry(String logstr) throws IOException {
        Files.write(Paths.get("./log.txt"), logstr.getBytes(),
                StandardOpenOption.CREATE);
    }

    private static void appendLogEntry(String logstr) throws IOException{
        Files.write(Paths.get("./log.txt"), logstr.getBytes(),
                StandardOpenOption.APPEND);
    }
}
