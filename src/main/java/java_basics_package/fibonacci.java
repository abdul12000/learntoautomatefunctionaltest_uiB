package java_basics_package;

public class fibonacci {
    //Interview questions: fibonacci series, prime numbers, factorial numbers and palindrome numbers
    public static void main(String[] args) {

//1, 2, 3, 5, 8, 13, 21, 34 ... fibonacci series
//        int n1 = 0;
//        int n2 = 1;
//        int count = 10;
//        int n3;
//         for (int i = 1; i <count; i++){
//             n3 =n2 + n1;
//             System.out.println(n3);
//             n1 = n2;
//             n2 = n3;
//
//         }
        System.out.println("----------------------------------------");
        //2,4, 8,... Even numbers

//        for (int i = 2; i < 10; i++){
//            if (i % 2 ==0){
//                System.out.println(i);
//
//            }
//        }

        System.out.println("----------------------------------------");
//         2, 3, 5, 7, 11, 13, 17.... Prime numbers
        {
            int i = 0;
            int num = 0;
            //Empty String
            String primeNumbers = "";

            for (i = 1; i <= 100; i++) {
                int counter = 0;
                for (num = i; num >= 1; num--) {
                    if (i % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    //Appended the Prime number to the String
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println("Prime numbers from 1 to 100 are :");
            System.out.println(primeNumbers);
        }
    }
}
