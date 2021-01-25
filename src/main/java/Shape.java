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
        return center ;
    }
}
