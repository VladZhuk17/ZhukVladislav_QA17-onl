package lesson8.Utils;

import java.util.Random;

public class UtilMethods {

    public static int randomPersonID (){
      int  randomID = (int) (Math.random() * 1000000);
        return randomID;
    }
    public static int randomID (){
        int  randomID = (int) (Math.random() * 1000);
        return randomID;
    }
}
