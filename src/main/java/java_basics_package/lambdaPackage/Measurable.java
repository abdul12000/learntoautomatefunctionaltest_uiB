package java_basics_package.lambdaPackage;

public interface Measurable {
    int measure(int x, int y);

}
class LambdaExpressionMultipleParam{
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Measurable area=(x,y)->(x*y);
        System.out.println(area.measure(5,10));

        // Multiple parameters with data type in lambda expression
        Measurable area2=(int x,int y)->(x*y);
        System.out.println(area2.measure(10,20));

        //Notice that I can change the operator in the function on the fly...
        Measurable add=(int x,int y)->(x+y);
        System.out.println(add.measure(10,20));

        //Another operator
        Measurable divide=(int x,int y)->(x/y);
        System.out.println(divide.measure(100,20));
    }
}
