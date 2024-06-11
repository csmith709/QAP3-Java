package QAP3.Probelm2;

public class Shape {
    //attributes
    private String color = "red";
    private boolean filled = true;

    //constructors
    public Shape() {
        //default
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //get
    public String getColor(){
        return color;
    }

    public boolean getFilled() {
        return filled;
    }

    //set
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    //to string
    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
