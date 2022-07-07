package factory_design_pattern;

/**
 * @Author Ayse Aydogdu
 * @Date 7/7/2022 6:02 PM
 */
public class FactoryTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape circle = shapeFactory.getShape("Circle");
        circle.draw();
        IShape square = shapeFactory.getShape("Square");
        square.draw();

    }
}
