package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void getPerimeter(){
        int perimeter = (2*length)+(2*width);
        System.out.println("The perimeter is "+perimeter+".");
    }

    public void getArea(){
        int area = length*width;
        System.out.println("The area is "+area+".");
    }
}
