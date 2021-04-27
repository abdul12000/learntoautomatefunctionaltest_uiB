package java_basics_package;

import java.util.stream.Stream;

public class JavaStreamIteratingEg {

    //Java stream can be used to iterate any number of times.
    // Here is an example where we can also combine the use of other stream methods like filter
    public static void main(String[] args){
        Stream.iterate(1, element->element+1)
                .filter(element->element%5==0)
                .limit(10)
                .forEach(System.out::println);
    }
}
