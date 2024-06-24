package Factory;

public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        return switch (shapeType) {
            case "square" -> new Square();
            case "circle" -> new Circle();
            default -> null;
        };
    }
}
