import java.util.Random;

public class LottoGenerator {
    public static int[] generateNumbers(){
        Random rnd = new Random();
        int[] results = new int[7];
        boolean status = true;
        boolean duplicate = false;
        while(status) {
            for (int i = 0; i < 7; i++) {
                results[i] = rnd.nextInt(35) + 1;
                if(checkDuplicate(results, results[i],i)){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                status  = false;
            }
        }
        return results;
    }
    public static boolean checkDuplicate(int[] array, int nr, int counter){
        boolean duplicate = false;
        for (int i = 0; i < counter; i++) {
            if(array[i]==nr){
                duplicate = true;
                break;
            }
        }
        return duplicate;
    }
}
