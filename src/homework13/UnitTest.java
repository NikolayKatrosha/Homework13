package homework13;

import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.exit;

public class UnitTest {
    Main main = new Main();
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    List<String> listString = Arrays.asList("one", "two", "three", "four", "five");

    public void testAverage(List<Integer> list) {
        int average, sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        average = sum / list.size();
        if (average != Main.getAverage(list)) {
            System.out.println("Error");
            System.out.println(average);
            exit(0);
        }
    }
}