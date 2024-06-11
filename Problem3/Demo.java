package QAP3.Problem3;

public class Demo {
    public static void main(String[] args) {
        //create point
        Point point = new Point(1.0f, 2.0f);
        System.out.println("Initial point: " + point);

        //update point position
        point.setXY(3.0f, 4.0f);
        System.out.println("Updated Point: " + point);

        // create moveable
        MovablePoint movablePoint =  new MovablePoint(5.0f, 6.0f, 1.5f, 2.5f);
        System.out.println("Initial MovablePoint: " + movablePoint);

        //move movable point
        movablePoint.move(true, true);
        System.out.println("MovablePoint after moving right and up: " + movablePoint);

        movablePoint.move(false, true);
        System.out.println("MovablePoint after moving left and up: " + movablePoint);

        movablePoint.move(true, false);
        System.out.println("MovablePoint after moving right and down: " + movablePoint);

        movablePoint.move(false, false);
        System.out.println("MovablePoint after moving left and down: " + movablePoint);
    } 
}
