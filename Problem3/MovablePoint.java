package QAP3.Problem3;

public class MovablePoint extends Point{
    //attriblutes
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        super();
    }

    //get
    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    //set
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    //methods
    //set speed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //get speed
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    //move
    public MovablePoint move(boolean addX, boolean addY) {
        float newX = getX() + (addX ? xSpeed : -xSpeed);
        float newY = getY() + (addY ? ySpeed : -ySpeed);
        setXY(newX, newY);
        return this;
    }

    //toString
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }
}
