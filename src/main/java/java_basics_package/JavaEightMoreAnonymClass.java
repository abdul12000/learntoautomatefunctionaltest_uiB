package java_basics_package;

import java.util.ArrayList;
import java.util.function.Consumer;

public class JavaEightMoreAnonymClass {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<String >();
        car.add("toyota");
        car.add("honda");
        car.add("jaguar");
        car.add("hyundai");


//Firstly, Review the JDK Iterable class, it has a default method forEach()
// to accept a function interface Consumer
//https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html


        //using anonymous class as the forEach implementation.
        car.forEach(new Consumer<String>() {       // anonymous class
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });

        //Using Lambda expression for the forEach implementation
        car.forEach(s -> System.out.println(s));

    }
}
