package java_basics_package;

import java.util.Scanner;

public class SeventhClass {
    public static void main(String[] args) {
//Using if else loop
//
//        System.out.println( "Enter any number between 1 and 7");
//        Scanner scanner = new Scanner(System.in);
//        String numberEntered =scanner.nextLine();
//        int dayOfTheWeek = Integer.parseInt(numberEntered);

        int dayOfTheWeek = 1;
        if (dayOfTheWeek == 1){
            System.out.println("Monday");
        } else if (dayOfTheWeek == 2){
            System.out.println("Tuesday");
        }  else if (dayOfTheWeek == 3){
            System.out.println("Wednesday");
        }else if (dayOfTheWeek == 4){
            System.out.println("Thursday");
        }else if (dayOfTheWeek == 5){
            System.out.println("Friday");
        }else if (dayOfTheWeek == 6){
            System.out.println("Saturday");
        }else if (dayOfTheWeek == 7) {
            System.out.println("Sunday");
        }else {
            System.out.println("You have not entered a valid number");
        }

        int A = 100;
        int B = 50;
        if (A>B){
            System.out.println(A);
        } else
            System.out.println(B);

    }
}
