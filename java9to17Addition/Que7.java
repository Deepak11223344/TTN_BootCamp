package java9to17Addition;

import java.util.Arrays;
import java.util.List;

public class Que7 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        integerList.stream()
                .filter(e->e>5)
                .findFirst()
                .stream()
                .forEach(System.out::println);
    }
}
