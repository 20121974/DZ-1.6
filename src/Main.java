import java.sql.SQLOutput;

public class Main {
    int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {

        //DZ 1.6.1
        var salaries = generateRandomArray();
        int sum = 0;
        for (var salary : salaries) {
            sum += salary;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей", sum);

        //DZ 1.6.2
        System.out.println("");
        int max = salaries [0];
        int min = salaries [0];
        for (int i = 0; i < salaries.length; i++) {
            if (max < salaries [i]){
                max = salaries [i];}
            if (min > salaries [i]){
                min = salaries [i];}
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей", min, max);

        //DZ 1.6.3
        System.out.println("");
        int averageSpending = sum / salaries.length;
        System.out.printf("Средняя сумма трат за месяц составила %d рублей", averageSpending);
        System.out.println("");

        //DZ 1.6.4
        System.out.println("");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName [i]);

        }

    }
}



