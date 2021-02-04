package shapes;

public class Square extends Quadrilateral implements Measurable{
    Square(int side) {
        super(side, side);
    }
//    protected double side;
//    public Square(double side){
//        super(side, side);
//        this.side = side;
//    }
//    @Override
//    public void getPerimeter(){
//        double perimeter = 4* side;
//        System.out.println("The perimeter is "+perimeter+".");
//    }
//    @Override
//    public void getArea(){
//        double area = side*side;
//        System.out.println("The area is "+area+".");
//    }
}
