package shapes;

public class Square extends Rectangle {
    protected int side;
    public Square(int side){
        super(side, side);
        this.side = side;
    }
    @Override
    public void getPerimeter(){
        int perimeter = 4* side;
        System.out.println("The perimeter is "+perimeter+".");
    }
    @Override
    public void getArea(){
        int area = side*side;
        System.out.println("The area is "+area+".");
    }
}
