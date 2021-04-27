package java_basics_package;

import java.util.ArrayList;
import java.util.function.Consumer;

public class JavaEightMore {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        //Using Lambda expression:
//        numbers.forEach( (n) -> { System.out.println(n); } );

        //using forEach:
        numbers.forEach(  System.out::println );

    }
}
