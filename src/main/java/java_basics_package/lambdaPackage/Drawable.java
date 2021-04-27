package java_basics_package.lambdaPackage;

public interface Drawable {
    public void draw();

    public class LambaExpressionExample {
        public static void main(String[] args) {
            int length = 10;

            //Implementing an interface without using lambda expression
            Drawable drawable = new Drawable() {
//                @Override
                public void draw() {
                    System.out.println("Length without lambda is: " + length );
                }
            };
            drawable.draw();


            //Implementing an interface with lambda expression -
            // Notice there is no implementation of the functional interface like in the one without lambda
            Drawable drawable2 = () ->{
                System.out.println("Length using lambda is : " + length );
            };
            drawable2.draw();

        }
    }
}