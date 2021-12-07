package listIter1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.*;

public class LıstIteratorDemo {
    public static void main(String[] args) {
        List<String> oop = new ArrayList<String>();

        oop.add("SmallTalk");
        oop.add("C++");
        oop.add("Java");
        oop.add("Python");
        oop.add("Rubby");

        //Obtaining list iterator
        ListIterator<String> litr = oop.listIterator();

        System.out.println("Listeyi ileriye doğru tarama : ");
        while (litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("=======================");
        System.out.println("Listeyi geriye doğru tarama : ");
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
