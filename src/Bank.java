import java.io.IOException;

public class Bank {
    public void sendMoney(int amount, String fromAccount, String toAccount) throws
            IOException {

//Calculate the transfer cost
        int paymentCost = setPaymentCost(amount);

//Write to a log file for debugging purposes
        Logging.createLog(amount,fromAccount,toAccount,paymentCost);
        System.out.printf("Payment cost " + paymentCost);

//save a receipt to disk
        Receipt receipt = new Receipt();
        receipt.createReceipt(amount,paymentCost,fromAccount,toAccount);

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
