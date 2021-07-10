package java_basics_package;

import java.util.Scanner;

public class Task999 {

    public static void main(String[] args) {
        int number = 11;
        System.out.println("List of all even numbers between 1 & 11:" + " ");
        for (int i = 1; i <= number; i++) {  // this is the loop
            if (i % 2 == 0) {  //Modulo % function for division & remainder
                System.out.println(i);
                //or
                //public static void main (String[] args) {
                int x = 11;
                System.out.print("List of all even numbers between 1 & 11:" + " ");
                for (int y = 1; y <= x; y++) {  // this is the loop
                    if (y % 2 == 0) {  //Modulo % function for division & remainder
                        System.out.print(y + " ");
                    }
                }
            }
//            System.out.println("Enter a number ");
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            primeCal(n);
//        }

//        static void primeCal(int num) {
//            int count ;
////            for (int i = 1; i <= num; i++) {
////                System.out.print("Enter n value : ");
////                Scanner sc = new Scanner(System.in);
////                int n = sc.nextInt();
//                System.out.println("Prime numbers between 1 to " + num + " are ");
//                for (int j = 2; j <= num; j++) {
//                    count = 0;
//                    for (int i = 1; i <= j; i++) {
//                        if (j % i == 0) {
//                            count++;
//                        }
//                    }
//                    if (count == 2)
//                        System.out.print(j + "  ");
//                }
//            }


                }}
}
