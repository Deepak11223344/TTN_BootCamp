package java9to17Addition;

import java.util.*;
public class Que6 {
    
        public static void main(String[] args)
        {
            Optional<Integer> op
                = Optional.of(9455);

            System.out.println("Optional: "
                            + op);

            System.out.println("Getting the Stream:");
            op.stream().forEach(System.out::println);
        }
    }
