import java.util.List;
import java.util.ArrayList;
// import org.apache.commons.lang3.math.NumberUtils;

public class HW3 {
    public static void main (String [] args) {
        ArrayList<Integer> myArray = new ArrayList<>(List.of(1, 3, 4, 18, 9, 3, 7, 4, 8, 45, 66));
        System.out.println(myArray);
        changeArray(myArray);
        System.out.println(myArray);

        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        //["string", "s", "my_value"]
        System.out.println(list);
        reviseList(list);
        System.out.println(list);
    }

//     1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
    static void changeArray(List<Integer> source) {
        int i = 0;
        while (i < source.size()) {
            Integer element = source.get(i);
            if (element % 2 != 0) {
                source.remove(element);
                i--;
            }
            i++;
        }
   }

// 2. Дан список ArrayList<String>. Удалить из него все строки, которые являются числами 
    static void reviseList(List<String> source) {
        int i = 0;
        while (i < source.size()) {
            String element = source.get(i);
            if (isNumeric(element)) {
                source.remove(element);
                i--;
            }
            i++;
        }
    }

    static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


