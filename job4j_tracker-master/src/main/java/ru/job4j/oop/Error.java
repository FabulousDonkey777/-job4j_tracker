package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error (boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }
    public static void main(String[] args) {
        Error error = new Error();
        Error positive = new Error(true,0,"Все отлично!");
        Error neutral  = new Error(false, 0, "Ни рыба, ни мясо!");
        error.printInfo();
        System.out.println("  ");
        positive.printInfo();
        System.out.println("  ");
        neutral.printInfo();
    }


}
