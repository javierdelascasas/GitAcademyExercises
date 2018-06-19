import java.util.Scanner;

public class V2_ex10 {
    public static void main(String[] args) {

//        int[] myArray = {132, 15, 498, 57, 3};
//        System.out.println(ArrayHelper.maxNumber(myArray));
//        System.out.println(ArrayHelper.minNumber(myArray));
//        System.out.println(ArrayHelper.sumArray(myArray));

//        int[] numbers = LottoGenerator.generateNumbers();
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

//        int[] array = ArrayHelper.genRandomArray(20, 1000);
//        int[] sortedArray = BubbleSort.sortArray(array);
//        String s1 = "";
//        String s2 = "";
//        for (int i = 0; i <array.length; i++) {
//            s1 += array[i] + " ";
//        }
//        for (int i = 0; i <sortedArray.length; i++) {
//            s2 += sortedArray[i] + " ";
//        }
//        System.out.println(s1);
//        System.out.println(s2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv text:");
        String text = sc.nextLine();
        System.out.println("Skriv nyckel");
        String key = sc.nextLine();
        String encrypted = Encrypter.encrypt(text, key);
        System.out.println(encrypted);

        System.out.println("Skriv text:");
        String text2 = sc.nextLine();
        System.out.println("Skriv nyckel");
        String key2 = sc.nextLine();
        String decrypted = Encrypter.decrypt(text2, key2);
        System.out.println(decrypted);

    }
}
