package lesson6;

/*
Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
Добавить конструктор без параметров.
Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
Вызвать этот метод.
Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
*/

import java.util.Scanner;

public class Phone {

    Scanner scanner = new Scanner(System.in);
    private int number;
    private int weight;
    private String model;

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void phoneDescription() {
        System.out.println(number + " " + " " + model + " " + " " + weight);
    }

    public void receiveCall(String callingName) {
        System.out.println("Звонит " + callingName);
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall(String callingName, int number) {
        System.out.println("Звонит " + callingName + " с номера " + number);
    }

    public void sendMessage(int... numberPhone) {
        for (int i=0; i< numberPhone.length;i++){
            System.out.println("Вы отправили сообщение " + numberPhone[i]);
        }
    }
}