package ua.com.alevel;

import java.io.*;
import java.util.Scanner;

public class Demo {
    public static String read(String path) {
//открываем файл по пути


            StringBuilder stringBuilder = new StringBuilder();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String currentString;
//построчно считываем файл
            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append(" \n ");
            }
//закрываем файл
            reader.close();
//возвращаем вычитанный текст в строке

        } catch (IOException e) {
            System.out.println("IOException = " + e.getMessage());
        } finally {
                System.out.println("Finally");
            }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        System.out.println(read("C:\\test.txt"));//в коде сразу была ошибка FileNotFoundEcxeption (в url были 2 пробела)пробела


    }

}