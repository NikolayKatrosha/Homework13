package homework13;

import java.util.Arrays;
import java.util.List;

public class Main {
static UnitTest test = new UnitTest();

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<String> listString = Arrays.asList("one", "two", "three", "four", "five");
        double avg = getAverage(list);
        System.out.println(avg);
        getFilter(listString);
        test.testAverage(list);
    }

    protected static double getAverage(List<Integer> list) {
        return list.stream()
                .mapToInt(a -> a)
                .average().orElse(0);
    }

    private static List<String> getUpperCase(List<String> list) {

        list.stream().map(String::toUpperCase)

                .forEach(name -> System.out.print( "{\""+name.toLowerCase()+"\":\""+name+"\"}, "));

        return list;
    }
    protected static List<String> getFilter(List<String> list){
        list.parallelStream()
                .filter(e -> (e.length() == 4))
                .filter(e->(e.equals(e.toLowerCase())))
                .forEach(System.out::println);
        return list;
    }

}