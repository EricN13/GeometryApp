public class Circle extends Shape {

    private double radius;
    public Circle(double radius) {
        this.radius=radius;
    }

    public Circle() {
        this.radius=1.0;
    }

    @Override
    public double calculate_Perimeter() {
        return (2*Math.PI*this.radius);
    }

    @Override
    public double calculate_area() {
        return this.radius*this.radius*Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {

        this.radius=newRadius;
    }
}
