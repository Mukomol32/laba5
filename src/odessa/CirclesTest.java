package odessa;

import java.util.Arrays;

public class CirclesTest {
    public Circle[] getCircles() {
        return circles;
    }

    public void setCircleAt(int index, Circle circle)
    {
        circles[index] = circle;
    }

    public void add(Circle circle)
    {
        int n = 0;
        for (Circle circle1 : circles)
            if (circle1 == null)
                break;
            else
                n++;

        if (circles.length == n)
            resize(n+1);

        setCircleAt(n, circle);
    }

    public void resize(int newLength)
    {
        Circle [] tempCircles = new Circle[newLength];
        {
            tempCircles = Arrays.copyOf(circles, newLength);
        }
        circles = tempCircles;
    }

    public double getAverageSquare()
    {
        double area = 0;
        for (int i = 0; i < circles.length; i++) {
            area+=circles[i].getSquare();
        }
        return area/circles.length;
    }

    private Circle[] circles;

    public CirclesTest() {
        circles = new Circle[0];
    }

    public CirclesTest(int length) {
        this.circles = new Circle[length];
    }
}
