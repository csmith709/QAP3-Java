package QAP3.Probelm2;

public class Square extends Rectangle{
    //constructors
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    //get
    public double getSide() {
        return getWidth();
    }

    //set
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    //override to maintain square shape (Width)
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    //override to maintain square shape (Length)
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    //to String
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }

}
