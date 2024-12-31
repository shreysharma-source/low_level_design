package LLD.FactoryPattern.ShapeFactory;

public class ShapeFactory {
    public Shape createShape(String iShapeName){
        switch(iShapeName){
            case "circle": return new Circle();
            case "rectangle": return new Rectangle();
            case "square" : return new Square();
            default : return null;
        }
    }

}
