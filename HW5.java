
/**
 * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */
import java.util.*;

public class HW5 {

    public static void main(String[] args) {
        String sometext = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        collectStats(sometext);
    }

    static void collectStats(String text) {
        String[] split = text.split(" ");
        Map<Integer, List<String>> stats = new HashMap<>();
        List<String> myList = new ArrayList<>();

        int size = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() > size) {
                size = split[i].length();
            }
        }
        for (int j = 1; j <= size; j++) {
            for (int i = 0; i < split.length; i++) {
                if (split[i].length() == j) {
                    myList.add(split[i]);
                    stats.putIfAbsent(j, myList);
                }
            }
            if (stats.get(j) != null) {
                System.out.println(stats.get(j).toString().replaceAll("^\\[|\\]|\\,", ""));
            }
            myList.clear();
        }
    }
}
