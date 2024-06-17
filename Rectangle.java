public class Rectangle implements Shape{

    private int width;
    private int height;

    @Override
    public double getArea() {
        return width * height ;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


}
