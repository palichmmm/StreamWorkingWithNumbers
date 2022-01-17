import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        int size = 0;
        for (Integer i : intList) {
            if (i > 0 && i % 2 == 0) {
                size++;
            }
        }
        Integer[] result = new Integer[size];
        int key = 0;
        for (Integer i : intList){
            if (i > 0 && i % 2 == 0) {
                result[key++] = i;
            }
        }
        Arrays.sort(result);
        for (Integer i : result){
            System.out.println(i);
        }
    }
}
