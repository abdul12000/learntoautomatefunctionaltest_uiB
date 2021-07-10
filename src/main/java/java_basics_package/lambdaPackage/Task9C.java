package java_basics_package.lambdaPackage;

public class Task9C {
    public static void main(String[] args) {

//
//        System.out.println("Multiples of 3 & 5 from 1 to 100");
//        for (int i = 0; i <= 100; ++i) {
//            if (i % 3 == 0) {
//                System.out.println("multiples of three:" + i);
//                if (i % 5 == 0) {
//                    System.out.println("multiples of five: " + i);
//                    if (i % 3 == 0 && i % 5 == 0) {
//                        System.out.println("multiples of three and five");
//                    } else
//                        System.out.println(i);
//                }
//            }
//        }

        System.out.println("Prime numbers between 1 and 20:");
        for (int i = 0; i <= 20; ++i) {
            if (i % 2 !=0) {
                System.out.println(i);
            }
        }

    }
}
