package shapes;
import util.Input;
public class CircleApp {

    public static void main(String[] args){
        Input input = new Input();
        double radius = input.getDouble();
        Circle circle = new Circle(radius);
        circle.setArea();
        circle.setCircumference();
        double circleArea = circle.getArea();
        double circleCircumference = circle.getCircumference();
        System.out.println(circleArea);
        System.out.println(circleCircumference);
    }

}
