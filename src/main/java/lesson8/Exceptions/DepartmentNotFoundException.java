package lesson8.Exceptions;

public class DepartmentNotFoundException extends Exception {

    String message = "Такого факультета нет";

    public String getMassage(){
        return message;
    }
}