package QAP3.Probelm2;

public class Circle extends Shape{
    //attribute
    private double radius = 1.0;

    //constructors
    public Circle() {
        //defualt
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled); //called from Shape class
        this.radius = radius;
    }

    //get
    public double getRadius() {
        return radius;
    }

    //set
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //methods
    // area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //to String
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
