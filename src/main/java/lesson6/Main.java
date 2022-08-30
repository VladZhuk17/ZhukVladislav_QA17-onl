package lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Phone xiaomi = new Phone(294442211, "Redmi T9", 550);
        Phone iPhone = new Phone(297774400, "11", 400);
        Phone samsung = new Phone(339996688, "S8", 450);

        xiaomi.phoneDescription();
        iPhone.phoneDescription();
        samsung.phoneDescription();

        xiaomi.receiveCall("Tom");
        iPhone.receiveCall("Jerry");
        samsung.receiveCall("Bob");

        xiaomi.getNumber();
        iPhone.getNumber();
        samsung.getNumber();

        iPhone.receiveCall("Bob");
        iPhone.receiveCall("Tom", 298665423);

        iPhone.sendMessage(2324324,456756,345345,1231323,456546,3424);
    }
}