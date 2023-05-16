// This is the driver class

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