package ua.com.alevel;

public class NumberFormatExceptionClass {
    public static void main(String[] args) {

        String exampleVariableOne = "85 ";
        System.out.println("exampleString = " + exampleVariableOne);
        try {
            int exampleVariableTwo = Integer.parseInt(exampleVariableOne);
            System.out.println("exampleInteger = " + exampleVariableTwo);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }

    }
}
