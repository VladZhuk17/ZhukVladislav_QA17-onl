package lesson3;
/*Создать программу, которая позволяет ввести с клавиа-туры массив размером n и отсортировать его по убыванию. Т.е.:
        1. Нужно считать с клавиатуры значение числа "n"(размер массива), используя метод makeMassiveUsingKeybord();
        2.1 Ввести значения, которые будут добавлены в массив (при размере массива, равном «n», необходимо ввести элементы массива «n» раз).
        Example: Выводит на экран строку типа:
        Enter element [номер элемента]: {Введенное с клавиа-туры целое число}
        2.2 Далее вывести массив, который мы создали, каждый элемент через запятую и пробел, используя метод printMassive()}.
        Example: 7, 23, 12, 0, 322
        3. Отсортировать базовый массив по убыванию сорти-ровкой Пузырька, используя метод sortMassiveByBubbleWay()}.
        4. Вывести отсортированный массив, используя метод printSortedDescMassive()}.
        Example: [322, 23, 12, 7, 0]*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = makeMassiveUsingKeybord();
        printMassive(array);
        printSortedDescMassive(sortMassiveByBubbleWay(array));
    }

    public static int[] makeMassiveUsingKeybord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: -> ");
        int arrSize = scanner.nextInt();
        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter element " + i + ": ");
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
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    isSorted = false;
                }
            }
        }
        return array;
    }

    public static void printSortedDescMassive(int[] array) {
        System.out.println("Sorted massive DESK: ");
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }
}