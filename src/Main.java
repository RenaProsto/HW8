import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        double[] number = {1.57, 7.654, 9.986};

        int[] houses = {2_500_000, 2_700_000, 3_000_000, 4_000_000, 5_000_000};

        System.out.println("Задача 2");
        System.out.println(Arrays.toString(weight));
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(houses));

        System.out.println();

        System.out.println("Задача 3");

        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i] + ", ");
        }
        System.out.println();

        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + ", ");
        }
        System.out.println();

        for (int i = houses.length - 1; i >= 0; i--) {
            System.out.print(houses[i] + ", ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0){
                weight[i] += 1;
            }
            System.out.print(weight[i] + ", ");
        }
    }
}










