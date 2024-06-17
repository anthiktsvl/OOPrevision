import java.util.ArrayList;

public class AllShapes {

    private ArrayList<Shape> shapes;


    public AllShapes(){
        shapes = new ArrayList<>();
    }




    public void addShape(Shape s){
        shapes.add(s);

    }

//    public void removeShape(Shape s){
//
//        try {
//            if (!shapes.remove(s)) {
//                throw new ShapeNotInCollectionException("Shape does not exists");
//            }
//            shapes.remove(s);
//        } catch (ShapeNotInCollectionException e){
//            System.out.println(e.getMessage());
//        }
//    }

    public void removeShape(Shape s) throws ShapeNotInCollectionException{
        if (!shapes.remove(s)) {
            throw new ShapeNotInCollectionException("Shape does not exists");
        }
        shapes.remove(s);
    }
    public void printAllAreas(){
        for ( Shape s : shapes ){
            System.out.println(s.getArea());
        }
    }



}
