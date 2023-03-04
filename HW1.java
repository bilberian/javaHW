import javax.swing.event.SwingPropertyChangeSupport;
// import java.util.*; - это я попробовала, чтобы Arrays.toString работал, 
// он работает, но выводит 0 в массиве. потому что ему не нравится перебор цикла for (int a : array)

public class HW1 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
    
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
    
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println();
        System.out.println(isLeapYear(2024));

        System.out.println(createArray(5, 6));
        // ВОПРОС по выводу массива на печать:
        // System.out.println(Arrays.toString(createArray(5, 6)));
        // выдает ошибку Arrays cannot be resolvedJava(570425394), а без метода массив печатается с хэшом в конце. Как это исправить?
        
        int [] myArray1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(changeArray(myArray1));

        int [] myArray2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(replaceArray(myArray2));

        System.out.println(buildArray(7));
        // int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        
    
    }
    
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        }
        return false;
    }
    
    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0) {
            return true;
        }
        return false;
    }
    
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
    }
    
    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }
    
    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int [] array = new int[len];
        for (int a : array) {
            a = initalValue;
            System.out.print(a + " ");
        }
        return array;
    }
    
    
    private static int[] changeArray(int [] array) {
        // С помощью цикла и условия заменить 0 на 1, 1 на 0
        for (int a : array) {
            if (a == 0) {
                a = 1;
            }
            else if (a == 1) {
                a = 0;
            }
            System.out.print(a + " ");
        }
        return array;
    }

    private static int[] replaceArray(int [] array) {
        // пройти по нему циклом, и числа меньшие 6 умножить на 2
        for (int a : array) {
            if (a < 6) {
                a *= 2;
            }
            System.out.print(a + " ");
        }
        return array;
    }

    private static int[][] buildArray(int len) {
        int [][] array = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (j == i) {
                    array[i][j] = 1;
                }
                else if (j == (len - 1 - i)) {
                    array[i][j] = 1;
                }
                else {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */
    }
