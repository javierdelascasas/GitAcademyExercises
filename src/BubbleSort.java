public class BubbleSort {
    public static int[] sortArray(int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        boolean finish = false;
        while(!finish) {
            finish = true;
            for (int i = 0; i < newArray.length - 1; i++) {
                if (newArray[i] > newArray[i + 1]) {
                    int temp = newArray[i+1];
                    newArray[i + 1] = newArray[i];
                    newArray[i] = temp;
                    finish = false;
                }
            }
        }
        return newArray;
    }
}
