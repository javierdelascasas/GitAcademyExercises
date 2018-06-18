public class ArrayHelper {
    // Returns max value of the array
    public static int maxNumber(int[] numbers){
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(maxValue<numbers[i]){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }
    // Returns min value of the array
    public static int minNumber(int[] numbers){
        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(minValue>numbers[i]){
                minValue = numbers[i];
            }
        }
        return minValue;
    }
    // Returns sum of all values of the array
    public static int sumArray(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
