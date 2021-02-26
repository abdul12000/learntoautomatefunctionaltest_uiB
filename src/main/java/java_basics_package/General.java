package java_basics_package;

import java.util.Scanner;

public class General {
    //writing dynamic code
    private static String generatnumber(int total){
       String a ="a";
        for (int i = 1; i < total; i ++){
            a = a+i;


        }
        return a.toString();
    }
    public static void main(String[] args) {

        System.out.println(General.generatnumber(279));

    }
}
