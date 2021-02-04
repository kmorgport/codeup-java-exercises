package shapes;

public class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;
    Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }




    public void getPerimeter() {
        double perimeter = (2*length)+(2*width);
        System.out.println("The perimeter is "+perimeter+".");
    }

    public void getArea() {
        double area = length*width;
        System.out.println("The area is "+area+".");
    }

    @Override
    public void setLength(int len) {

    }

    @Override
    public void setWidth(int wid) {

    }
}
