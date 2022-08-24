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

        private boolean isOn;
        private boolean processor;
        private boolean hardDrive;
        private boolean memory;
        private int resource;

        public Computer(boolean processor, boolean hardDrive, boolean memory, int resource) {
            this.processor = processor;
            this.hardDrive = hardDrive;
            this.memory = memory;
            this.resource = resource;
        }

        public void info() {
            System.out.print("[");
            if (processor == true) {
                System.out.print("processor есть; ");
            } else {
                System.out.print("processor нет; ");
            }
            if (hardDrive == true) {
                System.out.print("hardDrive есть; ");
            } else {
                System.out.print("hardDrive нет; ");
            }
            if (memory == true) {
                System.out.print("memory есть; ");
            } else {
                System.out.print("memory нет; ");
            }
            System.out.print(resource + "]");
        }

        public int turnOn() {
            if (isOn = true) {
                if (resource > 0) {
                    System.out.println("Для запуска компьютера введите число 0 либо 1");
                    int randomNumberForTernOn = random.nextInt(2);
                    int scannerNumberForTernOn = scanner.nextInt(2);
                    if (randomNumberForTernOn == scannerNumberForTernOn) {
                        resource--;
                        System.out.println("Компьютер запущен, циклов осталось: " + resource);
                        isOn = false;
                    } else {
                        resource = 0;
                        System.out.println("Произошел сбой, компьютер сгорел");
                    }
                } else {
                    resource = 0;
                    System.out.println("Компьютер сгорел");
                }
            }
            return resource;
        }

        public void turnOff() {
            System.out.println("Для выключения компьютера введите число 0 либо 1");
            int scannerNumberForTernOff = scanner.nextInt(2);
            int randomNumberForTernOff = random.nextInt(2);
            if (scannerNumberForTernOff == randomNumberForTernOff) {
                System.out.println("Компьютер выключается");
            } else {
                System.out.println("Компьютер не выключен, произошёл сбой");
            }
        }

        public static void main(String[] args) {
            lesson5.Computer asus = new lesson5.Computer(true, true, true, 15);
            lesson5.Computer apple = new lesson5.Computer(false, false, true, 22);
            apple.turnOn();
            apple.turnOn();
            apple.turnOff();
        }
    }
