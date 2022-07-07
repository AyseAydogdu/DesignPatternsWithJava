package factory_design_pattern;

/**
 * @Author Ayse Aydogdu
 * @Date 7/7/2022 5:35 PM
 */
public class ShapeFactory {

    IShape getShape(String shapeName){
        if(shapeName.equals("Circle"))
        {
            return new Circle();
        }
        if(shapeName.equals("Square"))
        {
            return new Square();
        }
        if(shapeName.equals("Elips"))
        {
            return new Elips();
        }

        return null;
    }
}
