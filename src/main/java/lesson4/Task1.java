package lesson4;

import java.util.Random;
import java.util.Scanner;

/*   Ввести с клавиатуры размер 2-двухмерного массива.
     Вывести на экран изначальную матрицу. Значения заполнить рандомом, ограничив от 0 до 5.
     Вывести каждую сумму отдельно (с пояснением, что оно такое).
     Вычесть из суммы элементов 2 строки сумму побочной диагонали. Но, если матрица не квадратная, то вместо диагонали – сумму 2 столбца.
     Вывести итоговый ответ.*/

public class Task1 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        centrArray(createArray());

    }

    public static int[][] createArray() {
        System.out.println("Введите размерность массива: ");
        int stringLength = 0;
        int columnLength = 0;
        if (scanner.hasNext()) {
            stringLength = scanner.nextInt();
            columnLength = scanner.nextInt();
        }
        int[][] array = new int[stringLength][columnLength];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int number = random.nextInt(5);
                array[i][j] = number;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    public static void calculate(int[][] array) {
        int stringArray = array.length;
        int columnArray = array[0].length;
        int secondStringSum = 0;
        int secondСolumnSum = 0;
        int diagonalSum = 0;
        int result;

        if (stringArray == columnArray) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == 1) {                                                             /*считаем сумму элементов второй строки*/
                        secondStringSum += array[i][j];
                    }
                    if (j == array.length - i - 1) {                                         /*считаем сумму элементов побочной диагонали*/
                        diagonalSum += array[i][j];
                    }
                }
            }
            System.out.println("Сумма элементов второго строки: " + secondStringSum);
            System.out.println("Сумма элементов побочной диагонали: " + diagonalSum);
            result = secondStringSum - diagonalSum;
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == 1) {                                                             /*считаем сумму элементов второй строки*/
                        secondStringSum += array[i][j];
                    }
                    if (j == 1) {                                                                   /*считаем сумму элементов второго столбца */
                        secondСolumnSum += array[i][j];
                    }
                }
            }
        }
        System.out.println("Сумма элементов второго строки: " + secondStringSum);
        System.out.println("Сумма элементов второго столбца: " + secondСolumnSum);
        result = secondStringSum - secondСolumnSum;


        System.out.println("Результат вычислений: " + result);
    }

    /*Для звёздочки, если квадратная - вывести индекс и значение ее центра, если центр невыявляем,
    сделать матрицу пригодной (удалить столбец справа и предпоследнюю строку) для этого и вывести получившуюся.
    А если неквадратная – сделать ее размер равным наименьшему значению и найти центр.*/
    public static void centrArray(int[][] array) {
        int string = array.length;
        int column = array[0].length;
        if (string == column) {                                     /*если массив квадратный*/
            if (string % 2 == 1) {                     /*если матрица квадратная и центр выявляем*/
                System.out.println("Центр квадратного массива → [" + array.length / 2 + "][" + array.length / 2 + "] = " + array[string / 2][column / 2]);
            } else {                                                /*если матрица квадратная, но центр невыявляемый*/
                string = array.length - 1;
                column = string;
                System.out.println();
                System.out.println("Наша обновленная матрица:");
                for (int i = 0; i < string-1; i++) {
                    for (int j = 0; j < column-1; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Подрезав квадратный массив, получили → [" + (array.length - 1) / 2 + "][" + (array.length - 1) / 2 + "] = " + array[string / 2][column / 2]);
            }
        } else {                                                         /*иначе массив не квадратный*/
            if (string != column && string > column) {                     /*если число строк больше*/
                do {
                    string--;
                } while (string == column);                                 /*сделали квадратной*/
                if (string % 2 == 1) {                                        /*центр выявляем*/
                    System.out.println();
                    System.out.println("Наша обновленная матрица: ");
                    for (int i = 0; i < string; i++) {
                        for (int j = 0; j < column; j++) {
                            System.out.print(array[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Центр массива → [" + array.length / 2 + "][" + array.length / 2 + "] = " + array[string / 2][column / 2]);
                } else {                                                      /*если центр невыявляемый*/
                    string = array.length - 1;
                    column = string;
                    System.out.println("Подрезав квадратный массив, получили → [" + (array.length - 1) / 2 + "][" + (array.length - 1) / 2 + "] = " + array[string / 2][column / 2]);
                }
            } else {                                                        /*иначе число столбцов больше*/
                do {
                    column--;
                } while (column == string);
                if (string % 2 == 1) {                                       /*центр выявляем*/
                    System.out.println("Сделав массив квадратным, получили центр → [" + array.length / 2 + "][" + array.length / 2 + "] = " + array[string / 2][column / 2]);
                } else {                                                       /*центр невыявляемый*/
                    string = array.length - 1;
                    column = string;
                    System.out.println("Подрезав квадратный массив, получили → [" + (string - 1) / 2 + "][" + (string - 1) / 2 + "] = " + array[string / 2][column / 2]);
                }
            }
        }
    }
}