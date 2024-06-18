public class ShapesProgram {

    public static void main(String[] args) {

        AllShapes allShapes = new AllShapes();
        Rectangle rectangle1 = new Rectangle(1,2);
        Rectangle rectangle2 = new Rectangle(2,2);
        Circle circle = new Circle(2);



        allShapes.addShape(rectangle1);
        allShapes.addShape(rectangle2);
        

        try {
            allShapes.removeShape(circle); // kodikas pou dimiourgei tin anagki gia exception
        } catch (ShapeNotInCollectionException e){
            System.out.println(e.getMessage()); // kodikas pou kanoum execute me afto to exception
        }

        allShapes.printAllAreas();

    }
}
