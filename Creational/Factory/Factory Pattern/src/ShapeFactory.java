//Objects of concrete classes are created in the method getShapeInstance, which is in the class ShapeFactory

public class ShapeFactory {
    public Shape getShapeInstance(String type) {
        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        }

        if (type.equalsIgnoreCase("Square")) {
            return new Square();
        }

        return null;
    }
}
