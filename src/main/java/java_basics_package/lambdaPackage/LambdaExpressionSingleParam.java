package java_basics_package.lambdaPackage;

public class LambdaExpressionSingleParam {
    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Greatable2 g1=(name)->{
            return "Hello, "+name;
        };
        System.out.println(g1.great("Abdul"));

        // You can omit function parentheses
        Greatable2 g2= name ->{
            return "Hello, "+name;
        };
        System.out.println(g2.great("Lateef"));
    }
}
