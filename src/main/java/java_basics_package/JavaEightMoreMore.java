package java_basics_package;

import java.util.ArrayList;

public class JavaEightMoreMore {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("England");
        countries.add("Poland");
        countries.add("France");
        countries.add("Portugal");
        countries.forEach( (n) -> { System.out.println(n); } );




    }
}
