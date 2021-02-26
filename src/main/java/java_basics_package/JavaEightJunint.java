package java_basics_package;

import org.junit.Test;

import java.util.ArrayList;

public class JavaEightJunint {
    @Test
    public void firstTest() {
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
        for (int i=0; i<cars.size(); i++){
            String aCars = cars.get(i);
            if (aCars.startsWith("T")){
                count++;
            }

        }
        System.out.println(count);



    }

    @Test
    public void secondTestFilter() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Lexus");
        cars.add("Ferrari");
        cars.add("Lambogini");
        cars.add("Tesla");

        //find how many cars start with "T"
        Long a = cars.stream().filter(s -> s.startsWith("T")).count();
        System.out.println(a);
//print all the names of arrayList
        cars.stream().filter(s->s.length()>5).forEach(System.out::println);

        //Using Map
cars.stream().filter(s->s.endsWith("s")).map(s -> s.toUpperCase()).forEach(System.out::println);

cars.stream().sorted().forEach(System.out::println);
    }
}
