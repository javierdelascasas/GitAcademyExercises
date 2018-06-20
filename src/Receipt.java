import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class Receipt {
    public void createReceipt(int amount,int paymentCost,String fromAccount,String toAccount) throws IOException {
        String receipt = "Bank transfer receipt\r\n" +
                "\r\nDate: " + LocalDateTime.now() +
                "\r\nAmount:" + amount +
                "\r\nCost: " + paymentCost +
                "\r\nFrom account:" + fromAccount +
                "\r\nTo account:" + toAccount + "\r\n";
        writeReceipt(receipt);
    }

    public void writeReceipt(String receipt) throws IOException {
        Files.write(Paths.get("./confirmation.txt"), receipt.getBytes(),
                StandardOpenOption.CREATE);
    }
}
