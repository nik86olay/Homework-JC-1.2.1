import java.util.*;

public class Main {

    private static final List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
    private static final StreamMain streamMain = new StreamMain();
    private static final List<Integer> intNewList = new ArrayList<>();


    public static void main(String[] args) {
        streamMain.main(intList);


        System.out.println("\nРеализация без Stream\n");

        for (Integer x : intList) {
            if (x > 0 && x % 2 == 0) {
                intNewList.add(x);
            }
        }
        intNewList.sort(Comparator.naturalOrder());
        for (Integer integer : intNewList) {
            System.out.println(integer);
        }
    }
}
