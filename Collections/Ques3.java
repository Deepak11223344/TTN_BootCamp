package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ques3 {
    int getMin(List<Integer> integers) {
        Collections.sort(integers);
        return (integers.get(0));
    }
    public static void main(String[] args) {
        Ques3 ques3 = new Ques3();
        List<Integer> integerList = new LinkedList<Integer>();
        System.out.println("Pushing Elements onto Stack:");
        ((LinkedList<Integer>) integerList).push(5);
        ((LinkedList<Integer>) integerList).push(3);
        ((LinkedList<Integer>) integerList).push(1);
        ((LinkedList<Integer>) integerList).push(6);
        ((LinkedList<Integer>) integerList).push(2);
        ListIterator listIterator = integerList.listIterator();
        while(listIterator.hasNext())
             System.out.print(listIterator.next() + " ");
        System.out.println("\nPopping elements from stack:"); 
        System.out.println(((LinkedList<Integer>) integerList).pop());
        System.out.println(((LinkedList<Integer>) integerList).pop());
        System.out.println("Is stack empty? " + integerList.isEmpty());
        System.out.println("Minimum element: " + ques3.getMin(integerList));
        System.out.println("Final stack:");
        listIterator = integerList.listIterator(0);
        while (listIterator.hasNext())
            System.out.print(listIterator.next() + " ");    
    }
}