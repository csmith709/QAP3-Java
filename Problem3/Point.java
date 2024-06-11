package QAP3.Problem3;

public class Point {
    //attributes
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
        //default
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //get
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    //set
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    //set XY
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x,y};
    }

    //to string
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
