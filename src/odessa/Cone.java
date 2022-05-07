package odessa;

    public class Cone extends Circle {
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        // TODO add check
        this.height = height;
    }

    private double height;

    public Cone(double radius, double height) {
        super(radius);
        setHeight(height);
    }

    @Override
    public double getSquare() {
        return super.getSquare()*Math.PI*2*getRadius()+getHeight()*getRadius();
    }

    public double getVolume() {
        return super.getRadius()*1/3*Math.PI*2*getHeight();
    }

    @Override
    public String toString() {
        return "Cone{" + "radius = " + getRadius()
                + ", height=" + height + ", square = " + this.getSquare()
                + ", volume = " + getVolume() + '}';
    }
}
