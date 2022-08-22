package lesson5;

import java.util.Random;
import java.util.Scanner;

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

public class Computer {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

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
        System.out.println("[есть”, “есть”, “есть”, " + resource + " циклов]");
    }

    public int turnOn() {

        if (resource > 0) {
            System.out.println("Для запуска компьютера введите число 0 либо 1");
            int randomNumberForTernOn = random.nextInt(2);
            int scannerNumberForTernOn = scanner.nextInt();
            if (randomNumberForTernOn == scannerNumberForTernOn) {
                resource--;
                System.out.println("Компьютер запущен, циклов осталось: " + resource);
            } else {
                resource = 0;
                System.out.println("Произошел сбой, компьютер сгорел");
            }
        } else {
            resource = 0;
            System.out.println("Компьютер сгорел");
        }
        return resource;
    }

    public int turnOff() {
        System.out.println("Для выключения компьютера введите число 0 либо 1");
        int scannerNumberForTernOff = scanner.nextInt();
        int randomNumberForTernOff = random.nextInt(2);
        if (scannerNumberForTernOff == randomNumberForTernOff) {
            resource--;
            System.out.println("Компьютер выключается");
        } else {
            System.out.println("Компьютер не выключен, произошёл сбой");
        }
        return resource;
    }

    public static void main(String[] args) {

        Computer apple = new Computer(true, true, true, 1);
                apple.turnOn();
                apple.turnOn();
        }
}


