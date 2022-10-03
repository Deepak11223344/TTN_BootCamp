package java9to17Addition;

import java.util.Optional;
import java.util.stream.IntStream;

import java.util.*;

public class Que5a {

        public static void main(String[] args)
        {
            Optional<Integer> op
                = Optional.of(9455);
            
            System.out.println("Optional: "
                            + op);

            op.ifPresentOrElse(
                (value)
                    -> { System.out.println(
                            "Value is present, its: "
                            + value); },
                ()
                    -> { System.out.println(
                            "Value is empty"); });
        }
    }