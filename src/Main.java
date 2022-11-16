import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println();

        int maxSum = -1;
        for (int y = 0; y < arr.length; y++) {
            if (arr[y] > maxSum) {
                maxSum = arr[y];
            }
        }
        int minSum = arr[0];//2
        for (int o = 1; o < arr.length; o++) {
            if (arr[o] < minSum) {
                minSum = arr[o];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");
        System.out.println();

        double mean = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей");


        char[] reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i >= 0; i--) {

            System.out.print(reverseFullName[i]);
        }


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;


    }


}