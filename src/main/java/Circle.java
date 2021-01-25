public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius=radius;
    }

    public Circle() {
        this.radius=1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        this.radius=newRadius;
    }
}
