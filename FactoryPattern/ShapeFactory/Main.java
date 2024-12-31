package LLD.FactoryPattern.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.createShape("circle");
        Shape shape2 = shapeFactory.createShape("square");

        shape1.draw();
        shape2.draw();
    }
}
