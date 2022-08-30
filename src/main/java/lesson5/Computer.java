package lesson5;

import java.util.Random;
import java.util.Scanner;

     /*  Создать класс компьютер.
        Поля:
        boolean isOn, boolean процессор, boolean оперативка, boolean жесткий диск,
        int ресурс полных циклов работы (включений/выключений).
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
        System.out.println(resource + "]");
    }

    public boolean turnOn() {
        if (isOn) {
            System.out.println("The computer is turned on");
            return false;
        }
        if (resource == 0) {
            System.out.println("The computer burned");
            return false;
        }
        if (!hasProcessor() || !hasHardDrive() || !hasMemory()) {
            System.out.println("Check components of your computer");
            return false;
        }
        if (randomAndScanner()) {
            isOn = false;
            System.out.println("You are lucky, you have turned on the computer!");
            return true;
        }
        return true;
    }

    public boolean hasProcessor() {
        if (!processor) {
            System.out.println("processor missing ");
            return false;
        }
        return true;
    }

    public boolean hasHardDrive() {
        if (!hardDrive) {
            System.out.println("hasHardDrive missing ");
            return false;
        }
        return true;
    }

    public boolean hasMemory() {
        if (!memory) {
            System.out.println("memory missing ");
            return false;
        }
        return true;
    }

    public boolean randomAndScanner() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 0 or 1: ");
        if (random.nextInt(2) != scanner.nextInt()) {
            resource = 0;
            System.out.println("Ba-bah");
            System.out.println("The computer has burnt");
            return false;
        }
        return true;
    }

    public boolean turnOff() {
        if (isOn) {
            System.out.println("The computer turn off");
            return true;
        }
        if (!randomAndScanner()) {
            resource = 0;
            System.out.println("The computer has burnt");
            return false;
        } else {
            resource--;
            isOn = false;
            System.out.println("The computer has turned off");
            return true;
        }
    }

    public static void main(String[] args) {
        Computer asus = new Computer(true, true, true, 15);
        Computer apple = new Computer(false, false, true, 22);

        asus.info();
        asus.turnOn();
        asus.turnOff();
    }
}