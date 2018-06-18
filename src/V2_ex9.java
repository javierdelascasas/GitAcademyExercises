import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class V2_ex9 {
    public static void main(String[] args) {
//        LocalDate lastRunDate = LocalDate.of(2016,11,11);
//        LocalDate today = LocalDate.of(2016,11,16);
//        if(sevenDaysPass(lastRunDate, today)){
//            System.out.println("Time to run again!");
//        } else {
//            System.out.println("Not time yet");
//        }

        LocalDate christmas = LocalDate.of(2018,12,24);
        LocalDate today = LocalDate.now();
        System.out.println("Nästa jul blir " + christmas);
        System.out.println("Idag är det " + today);
        Period per = Period.between(today, christmas);
        System.out.println("Nästa jul infaller om " + per.getYears() + " år " +
                per.getMonths() + " månader och " + per.getDays() + " dagar.");
        long daysLeft = ChronoUnit.DAYS.between(today,christmas);
        System.out.println("Total " + daysLeft + " dagar.");


    }

//    private static boolean sevenDaysPass(LocalDate lastDate, LocalDate newDate){
//        if(lastDate.isBefore(newDate)){
//            if(lastDate.plusDays(7).isBefore(newDate)){
//                return true;
//            } else{
//                return false;
//            }
//        } else {
//            return false;
//        }
//    }

}
