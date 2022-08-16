package lesson4;

import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        creatArray();

    }

    static int[][] creatArray() {
        int stringLength = 0;
        int columnLength = 0;

        if (scanner.hasNext()) {
            stringLength = scanner.nextInt();
            columnLength = scanner.nextInt();
        }
        int[][] array = new int[stringLength][columnLength];
        return array;
    }

}
