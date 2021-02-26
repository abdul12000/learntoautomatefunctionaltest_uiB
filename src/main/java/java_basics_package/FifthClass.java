package java_basics_package;

import java.util.Scanner;

public class FifthClass {
    //more dynamic code with logical and
    public static void main(String[] args) {
        System.out.println( "Enter any number between 1 and 20");
        Scanner scanner = new Scanner(System.in);
        String numberEntered =scanner.nextLine();
        int convertedNumber = Integer.parseInt(numberEntered);
        if (convertedNumber<21 && convertedNumber>0){
            System.out.println("You have enter a valid number :" + convertedNumber);

            //previous class -FourthClass can go here
//            for (int i=1; i <=convertedNumber ; i++ ){
//                System.out.println(i);
//            }
        }else

        System.out.println("You have not entered a valid number ");

    }

}
