import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class HW2 {
    public static void main (String [] args) throws IOException {
        System.out.println(buildString(6, 'a', 'b')); // "ababab"

        Path of = Path.of("myFile.txt");
        try {
            Files.createFile(of);
          } catch (Exception e) {
            System.out.println("File already exists");
          }
                
        Files.writeString(of, someText(100, "text"));

    }

//     1. Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
// (6, 'a', 'b') -> "ababab"
    static String buildString(int n, char c1, char c2) {
        String result = "";
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                result += c1;
            }
            else if (i % 2 != 0) {
                result += c2;
            }
        }
        return result;
    }

// 2. Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз
    static String someText(int n, String str) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
            result += " ";
        } 
        return result;
    }

}


