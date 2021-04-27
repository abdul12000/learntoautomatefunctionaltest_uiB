package java_basics_package.lambdaPackage;

public interface Greatable {

    public String hello();

    class LambdaExpressionNoParam {
        public static void main(String[] args) {
            // Lambda expression with no parameter.
            Greatable s = () -> {
                return "Hello world";
            };
            System.out.println(s.hello());
        }
    }
}
