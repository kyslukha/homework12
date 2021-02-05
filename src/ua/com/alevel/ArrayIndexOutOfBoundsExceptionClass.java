package ua.com.alevel;

public class ArrayIndexOutOfBoundsExceptionClass {
    public static void main(String[] args) {
        int[] integers = {14, 25, 15};
        try {
            for (int i = 0; i <= integers.length; i++) {
                System.out.println("integers = " + i + " " + integers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
//мы добавляем в код только те исключения, которые могут встретится (случиться) в программе. Возможно,
// когда код большой, а опыт небольшой в написании кода, надо добавлять finally, чтобы по тексту message понять место ошибки,
//если  сработало неучтенное исключение
