import java.time.LocalDate;

public class V2_ex9 {
    public static void main(String[] args) {
        LocalDate lastRunDate = LocalDate.of(2016,11,11);
        LocalDate today = LocalDate.of(2016,11,16);
        if(sevenDaysPass(lastRunDate, today)){
            System.out.println("Time to run again!");
        } else {
            System.out.println("Not time yet");
        }
    }

    private static boolean sevenDaysPass(LocalDate lastDate, LocalDate newDate){
        if(lastDate.isBefore(newDate)){
            if(lastDate.plusDays(7).isBefore(newDate)){
                return true;
            } else{
                return false;
            }
        } else {
            return false;
        }
    }

}
