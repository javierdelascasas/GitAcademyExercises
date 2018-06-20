import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;


public class Bank {
    public void sendMoney(int amount, String fromAccount, String toAccount) throws
            IOException {
        String logstr = "";

//Calculate the transfer cost
        int paymentCost = setPaymentCost(amount);

//Write to a log file for debugging purposes
        Logging.createLog(amount,fromAccount,toAccount,paymentCost);
        System.out.printf("Payment cost " + paymentCost);
//save a receipt to disk
        String receipt = "Bank transfer receipt\r\n" +
                "\r\nDate: " + LocalDateTime.now() +
                "\r\nAmount:" + amount +
                "\r\nCost: " + paymentCost +
                "\r\nFrom account:" + fromAccount +
                "\r\nTo account:" + toAccount + "\r\n";
        Files.write(Paths.get("./confirmation.txt"), receipt.getBytes(),
                StandardOpenOption.CREATE);
//Doing the bank transfer somehow....
    }

    private int setPaymentCost(int amount){
        int paymentCost = 10;
        if(amount > 1000){
            paymentCost = 50;
        }
        return paymentCost;
    }
}