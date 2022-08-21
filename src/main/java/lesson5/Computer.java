package lesson5;

      /*  Создать класс компьютер.
        Поля:
        boolean isOn, boolean процессор, boolean оперативка, boolean жесткий диск, int ресурс полных циклов работы (включений/выключений).
        Методы:
        - метод описание(вывод всех полей)
        вывод:  [“есть”, “есть”, “есть”, 18 циклов]
        - метод включить, при включении может произойти сбой, при вызове метода
        рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
        угадали комп включается, если нет сгорает. Если комп сгорел, при попытке
        включить нужно выдать сообщение, что ему конец.
        - выключить (аналогично включению)
        - при превышении лимита ресурса комп сгорает */

import java.util.Random;
import java.util.Scanner;

public class Computer {
    boolean isOn;
    boolean processor;
    boolean hardDrive;
    boolean memory;
    int resource;

    public Computer(boolean processor, boolean hardDrive, boolean memory, int resource) {
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.memory = memory;
        this.resource = resource;
    }

    public void info() {
        System.out.println("[есть”, “есть”, “есть”, " + resource + "циклов]");
    }

    public static int turnOn(int resource) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        if (resource != 0) {
            System.out.println("Для запуска компьютера введите число 0 либо 1");
            int randomNumber = random.nextInt(2);
            int scannerNumber = scanner.nextInt();
            if (randomNumber == scannerNumber) {
                resource++;
                System.out.println("Компьютер запущен, циклов осталось: " + resource);
            }

        } else {
            System.out.println("Компьютер сгорел");
        }
        return resource;
    }

    public static void main(String[] args) {
        Computer asus = new Computer(true, true, true, 21);
        asus.info();
    }
}
