package shapes;

public class ShapesTest {
    public static void main (String[] args){
        Measurable myShape = new Square(5);
        myShape.getPerimeter();
        Measurable myShape2 = new Rectangle(5,6);
        myShape2.getPerimeter();

//        Rectangle box1 = new Rectangle(4,5);
//        box1.getArea();
//        box1.getPerimeter();
//        Rectangle box2 = new Square(5);
//        box2.getPerimeter();
//        box2.getArea();
    }
}
