package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    Rectangle(int length, int width) {
        super(length, width);
    }
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public void getPerimeter(){
//        double perimeter = (2*length)+(2*width);
//        System.out.println("The perimeter is "+perimeter+".");
//    }
//
//    public void getArea(){
//        double area = length*width;
//        System.out.println("The area is "+area+".");
//    }
}
