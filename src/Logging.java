

public class Logging {
    private String logstr;
    private int amount;
    private String fromAccount;
    private String toAccount;
    private int paymentCost;

    public Logging() {
        logstr = "Bank auditlog" + "\r\n";
        startLogEntry(logstr);
        logstr = "Doing a desposit of " + amount + " Sek from " + fromAccount + " to "
                + toAccount + "\r\n";
        appendLogEntry(logstr);
        logstr = "Payment cost" + paymentCost + "\r\n";
        appendLogEntry(logstr);
        System.out.printf("Payment cost " + paymentCost);
    }
}
