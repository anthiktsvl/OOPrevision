public class Circle implements Shape{

    private double radius;

    private static final double PI = 3.14;


    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return 2 * PI * radius * radius;
    }


}
