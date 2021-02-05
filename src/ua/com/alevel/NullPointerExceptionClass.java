package ua.com.alevel;

public class NullPointerExceptionClass {
    public static void main(String[] args) {
        Double x = null;
        try {
            System.out.println("(Math.pow(" + x + ",2)) = " + (Math.pow(x, 2)));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException ");
        }

    }
}
