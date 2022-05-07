package odessa;

public class Circle {
    public static double CheckCorrectRadius(String value) {
        double side = -1;
        try {
            side = Double.parseDouble(value) > 0 ? Double.parseDouble(value) : -1;
        } catch (Exception e) {

        }

        return side;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius > 0 ? radius : -1;
    }

    @Override
    public String toString() {
        return getRadius() > 0 ? "Circle{" +
                "radius=" + radius + ", square = " + getSquare() + ", perimeter = " + getPerimeter() +
                '}' : "Error circle: radius = " + getRadius();
    }

    public double getDiameter() {
        return radius * radius;
    }

    public double getSquare()
    {
        return getRadius()*getRadius()*Math.PI;
    }

    public double getPerimeter()
    {
        return 2*Math.PI*getRadius();
    }

    private double radius;
}

