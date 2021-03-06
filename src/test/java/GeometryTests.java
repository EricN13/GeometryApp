import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeometryTests {
    @Test
    public void length_width_of_rectangle() {
        Rectangle rectangle = new Rectangle(20.0, 10.0);
        assertEquals(20.0d, rectangle.getLength(), 0);
        assertEquals(10.0d, rectangle.getWidth(), 0);
    }

    @Test
    public void length_width_of_rectangle_withoutParameters() {
        Rectangle rectangle = new Rectangle();
        assertEquals(1.0, rectangle.getLength(), 0);
        assertEquals(1.0, rectangle.getWidth(), 0);

    }

    @Test
    public void update_length_width_of_rectangle() {
        Rectangle rectangle = new Rectangle(25.0, 12.0);
        rectangle.setLength(15.0);
        rectangle.setWidth(8.0);
        assertEquals(15.0, rectangle.getLength(), 0);
        assertEquals(8.0, rectangle.getWidth(), 0);


    }

    @Test
    public void radius_of_circle() {
        Circle circle = new Circle(23.0);
        assertEquals(23.0, circle.getRadius(), 0);

    }

    @Test
    public void radius_of_circle_without_parameters() {
        Circle circle = new Circle();
        assertEquals(1.0, circle.getRadius(), 0);

    }

    @Test
    public void update_radius_of_circle() {
        Circle circle = new Circle(25.0);
        circle.setRadius(15.0);
        assertEquals(15.0, circle.getRadius(), 0);

    }

    @Test
    public void retrieve_color_of_shape() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("blue");
        assertEquals("blue", rectangle.getColor());
        Circle circle = new Circle();
        assertEquals("Burnt Umber", circle.getColor());
    }
    @Test
    public void retrieve_perimeter(){
        Rectangle rectangle = new Rectangle(10.0,5.0);
        assertEquals((10.0+5.0)*2,rectangle.calculate_Perimeter(),0);
        Circle circle = new Circle(10.0);
        assertEquals(2*Math.PI*10.0,circle.calculate_Perimeter(),0);


    }

    @Test
    public void retrieve_area(){
        Rectangle rectangle = new Rectangle(10.0,5.0);
        assertEquals(10.0*5.0,rectangle.calculate_area(),0);
        Circle circle = new Circle(10.5);
        assertEquals(10.5*10.5*Math.PI,circle.calculate_area(),0);

    }
    @Test
    public void retrieve_x_y_coordinates(){
        Point point = new Point(6,5);
        assertEquals(6,point.getX());
        assertEquals(5,point.getY());

    }
    @Test
    public void set_get_center_of_shape(){
        Point point1= new Point(6,5);
        Rectangle rectangle= new Rectangle(10.5,5.5);
        rectangle.setCenter(point1);
        assertEquals(point1,rectangle.getCenter());
        Point point2= new Point(10,7);
        Circle circle= new Circle(6.0);
        circle.setCenter(point2);
        assertEquals(point2,circle.getCenter());

    }

    @Test
    public void retrieve_center_not_on_plane(){
        Rectangle rectangle= new Rectangle(10.5,5.5);
        try{
           rectangle.getCenter();
           fail();
        }
        catch(Exception ex){
            assertEquals("shape is not on the plane",ex.getMessage());
        }

    }
    @Test
    public void move_point(){
        Point point=new Point(10,20);
        point.move(5,2);
        Point expected= new Point(15,22);
        assertEquals(expected.getX(),point.getX());
        assertEquals(expected.getY(),point.getY());
    }
    @Test
    public void move_center_of_shape(){
        Point point= new Point(6,5);
        Rectangle rectangle= new Rectangle(10.5,5.5);
        rectangle.setCenter(point);
        rectangle.getCenter().move(4,5);
        Point expected= new Point(10,10);
        assertEquals(expected.getX(),rectangle.getCenter().getX());
        assertEquals(expected.getY(),rectangle.getCenter().getY());


    }
    @Test
    public void retrieve_distance_between_shapes(){
        Point point1= new Point(0,0);
        Rectangle rectangle= new Rectangle(10.5,5.5);
        rectangle.setCenter(point1);
        Point point2= new Point(0,7);
        Circle circle= new Circle(6.0);
        circle.setCenter(point2);

        assertEquals(7.0,circle.distanceTo(rectangle),0);
        assertEquals(7.0,rectangle.distanceTo(circle),0);

    }
    @Test
    public void display_shape(){
        Point point1= new Point(0,0);
        Rectangle rectangle= new Rectangle(10.5,5.5);
        rectangle.setCenter(point1);
        assertEquals("10.5 X 5.5 rectangle at (0,0)",rectangle.display());

    }


}
