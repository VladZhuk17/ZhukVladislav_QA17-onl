package lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = makeMassiveUsingKeybord();
        printMassive(array);
        sortMassiveByBubbleWay(array);
        printSortedDescMassive(array);
    }

    public static int[] makeMassiveUsingKeybord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arrSize = scanner.nextInt();
        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter element [" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printMassive(int[] array) {
        System.out.println("Your base massive is: ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }

    public static int[] sortMassiveByBubbleWay(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] < array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    isSorted = false;
                }
            }
        }
        return array;
    }


    public static void printSortedDescMassive(int[] array) {
        System.out.println("Your sorted massive: ");
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }
}


















