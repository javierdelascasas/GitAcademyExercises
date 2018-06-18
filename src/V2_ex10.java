public class V2_ex10 {
    public static void main(String[] args) {

        int[] myArray = {132, 15, 498, 57, 3};
        System.out.println(ArrayHelper.maxNumber(myArray));
        System.out.println(ArrayHelper.minNumber(myArray));
        System.out.println(ArrayHelper.sumArray(myArray));

        int[] numbers = LottoGenerator.generateNumbers();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
