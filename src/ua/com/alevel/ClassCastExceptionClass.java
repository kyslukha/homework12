package ua.com.alevel;

public class ClassCastExceptionClass {
    public static void main(String[] args) {
        Object object = new Object();
        try {
            Integer integer;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }
    }
}
