/*
         * Реализовать консольное приложение, которое:
         * 1. Принимает от пользователя строку вида text~num
         * 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию
         * num.
         * 2. Если введено print~num, выводит строку из позиции num в связном списке.
         * 3. Если введено exit, завершаем программу
         *
         * Пример:
         * string~4
         * num~3
         * print~3
         * > num
         * print~4
         * > string
         * my_value~1
         * print~1
         * > my_value
         */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class HW4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> myList = new LinkedList<>();

        while (true) { 
            String s = sc.nextLine();
            if (s.equals("exit")) { 
                break;
            } else {
                String[] split = s.split("~");
                System.out.println(Arrays.toString(split));
                int myIndex = Integer.parseInt(split[1]);
                String theWord = split[0];
                int size = 0;
                if (size < myIndex) {
                    size = myIndex;
                }
                
                while (myList.size() <= size) {
                    myList.add(null);
                }
                if (theWord.equals("print")) { 
                    System.out.println(myList.get(myIndex));
                } else {
                    myList.set(myIndex, theWord);
                    System.out.println(myList);
                }
                
            }
        // sc.close(); - поясните, пожалуйста, зачем система рекомендует закрывать sc, и что это дает 

        }
    }
}
