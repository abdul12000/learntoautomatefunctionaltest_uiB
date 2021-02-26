package java_basics_package;

import java.util.ArrayList;

public class JavaEight {
    public static void main(String[] args) {
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
}
