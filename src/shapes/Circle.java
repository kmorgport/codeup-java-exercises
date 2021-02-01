package shapes;

public class Circle {
    private double radius;
    private double area;
    private double circumference;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea (){
        return area;
    }

    public double getCircumference(){
        return circumference;
    }

    public void setArea(){
        double newArea = Math.PI * (radius * radius);
        this.area = newArea;
    }

    public void setCircumference(){
        double newCircumference = (2*Math.PI)*radius;
        this.circumference = newCircumference;
    }

    public static void main(String[] args){
        Circle circle = new Circle(3.0);
        circle.setCircumference();
        circle.setArea();
        double circleArea = circle.getArea();
        double circleCircumference = circle.getCircumference();
        System.out.println(circleArea);
        System.out.println(circleCircumference);
    }
}
