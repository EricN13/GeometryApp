public abstract class Shape {
    private String color;
    private Point center;
    public Shape(){
        this.color= "Burnt Umber";
    }
    public abstract double calculate_Perimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculate_area();

    public void setCenter(Point point){
      this.center=point;
    }

    public Point getCenter(){
        if(center==null){
            throw new RuntimeException("shape is not on the plane");
        }
        return center ;
    }

    public double distanceTo(Shape shape) {
        double x=(shape.getCenter().getX()-this.center.getX())*(shape.getCenter().getX()-this.center.getX());
        double y=(shape.getCenter().getY()-this.center.getY())*(shape.getCenter().getY()-this.center.getY());
        return Math.sqrt(x+y);
    }

    public String display(){
//        if(this instanceof Rectangle){
//           return  ((Rectangle) this).getLength()+"X"+((Rectangle) this).getWidth() + "rectangle at "+ this.getCenter().getX() +",this.getCenter() ";
//        }
        return "";
    }
}
