// This is the Driver class, which utilise the factory class for getting the object of the required type

public class ShapeDriver {

    public static void main(String[] args)
    {
        ShapeFactory shapefactory=new ShapeFactory();
        Shape Rectangle=shapefactory.getShapeInstance("Rectangle");
        Rectangle.draw();

        Shape Square=shapefactory.getShapeInstance("Square");
        Square.draw();

        Shape Triangle=shapefactory.getShapeInstance("Triangle");
        Triangle.draw();

    }


}
