package java_basics_package;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaEightStream {
    //    @Test
    public void noJava8() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Lexus");
        cars.add("Ferrari");
        cars.add("Lambogini");
        cars.add("Tesla");

        int count = 0;
        for (int i = 0; i < cars.size(); i++) {
            String aCars = cars.get(i);
            if (aCars.startsWith("T")) {
                count++;
            }
        }
        System.out.println(count);
    }

    //    @Test
    public void wihtJava8() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Lexus");
        cars.add("Ferrari");
        cars.add("Lambogini");
        cars.add("Tesla");

        //1a  find how many cars start with "T"
        Long a = cars.stream().filter(s -> s.startsWith("T")).count();
        System.out.println(a);

//2a  print all the cars with more than 5xters in the arrayList
        cars.stream().filter(s -> s.length() > 5).forEach(s -> System.out.println(s));


        //2b  print all the names of arrayList using method reference
        cars.stream().filter(s -> s.length() > 5).forEach(System.out::println);

        //3a   print only the car with name that has more than 5xters
        cars.stream().filter(s -> s.length() > 5).limit(1).forEach(s -> System.out.println(s));

//3b sort:
        cars.stream().sorted().forEach(System.out::println);

        // 5a   Using Map
        cars.stream().filter(s -> s.endsWith("s")).map(s -> s.toUpperCase()).forEach(System.out::println);


    }

    //  Using Stream directly:
//        @Test
    public void thirdFiltertest() {
        //1b.  Using Stream directly:
        long countB = Stream.of("Hyundai", "Mitsubuishi", "Peugeot", "Lexus", "Ford").filter(s -> s.endsWith("i")
        ).count();
        System.out.println(countB);


//5b   Using map
        Stream.of("Hyundai", "Mitsubuishi", "Peugeot", "Lexus", "Ford").filter(s -> s.endsWith("i")
        ).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));


//5c Map above but using method reference for converting to uppercase
        Stream.of("Hyundai", "Mitsubuishi", "Peugeot", "Lexus", "Ford").filter(s -> s.endsWith("i")
        ).map(String::toUpperCase).forEach(s -> System.out.println(s));

    }


    //Using Array as list and performing aggregate operation on the list:
    @Test
    public void moreStreams() {

        //5c   sorting and mapping to uppercase
        List<String> cars = Arrays.asList("Hyundai", "Mitsubuishi", "Peugeot", "Lexus", "Ford", "Honda", "Hayat");
        cars.stream().filter(s -> s.startsWith("H")).sorted().map(s -> s.toUpperCase()).forEach(System.out::println);


        //4   Printing unique cars from a list
        List<String> carsB = Arrays.asList("Hyundai", "Ford", "Ford", "Mitsubuishi", "Peugeot", "Lexus", "Hyundai", "Ford", "Honda", "Hayat");
        carsB.stream().distinct().forEach(s -> System.out.println(s));

        //7  Get the value of a particular index in a list of numbers after sorting the list
        List<Integer> numbers = Arrays.asList(19, 1, 2, 6, 7, 3, 1, 6, 10, 20, 17);
        List<Integer> l = numbers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(l.get(0));
        System.out.println(l.size());

        //6   Converting list back to list after manipulation
        List<String> list = Stream.of("Hyundai", "Mitsubuishi", "Peugeot", "Lexus", "Ford").filter(s -> s.endsWith("i")
        ).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list.get(1));
    }

}
