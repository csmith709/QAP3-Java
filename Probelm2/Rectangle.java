package QAP3.Probelm2;

public class Rectangle extends Shape{
    //attributes
    private double width = 1.0;
    private double length = 1.0;

    //constructors
    public Rectangle() {
        //default
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //get
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    //set
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //methods
    //area
    public double getArea() {
        return width * length;
    }

    //perimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }

    //to string
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}
