import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Logging {

    public static void createLog(int amount,String fromAccount,String toAccount,int paymentCost) throws IOException {
        String logstr;
        logstr = "Bank auditlog" + "\r\n" +
                "Doing a desposit of " + amount + " Sek " +
                "from " + fromAccount +
                " to " + toAccount + "\r\n" +
                "Payment cost" + paymentCost + "\r\n";
        startLogEntry(logstr);
    }

    private static void startLogEntry(String logstr) throws IOException {
        Files.write(Paths.get("./log.txt"), logstr.getBytes(),
                StandardOpenOption.CREATE);
    }
}
