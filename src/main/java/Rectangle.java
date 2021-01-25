public class Rectangle extends Shape{
   private double length;
   private double width;
    public Rectangle(double length,double width){
       this.length=length;
       this.width=width;
    }

    public Rectangle() {
     this.length=1.0;
     this.width=1.0;
    }

    @Override
    public double calculate_Perimeter() {
        return (this.width+this.length)*2;
    }

    @Override
    public double calculate_area() {
        return this.length*this.width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double newLength) {
        this.length=newLength;
    }

    public void setWidth(double newWidth) {
        this.width=newWidth;
    }
}
