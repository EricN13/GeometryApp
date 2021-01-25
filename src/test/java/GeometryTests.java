import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeometryTests {
    @Test
    public void length_width_of_rectangle(){
        Rectangle rectangle=new Rectangle(20.0,10.0);
        assertEquals(20.0d,rectangle.getLength(),0);
        assertEquals(10.0d,rectangle.getWidth(),0);
    }

    @Test
    public void length_width_of_rectangle_withoutParameters(){
        Rectangle rectangle= new Rectangle();
        assertEquals(1.0,rectangle.getLength(),0);
        assertEquals(1.0,rectangle.getWidth(),0);

    }
    @Test
    public void update_length_width_of_rectangle(){
        Rectangle rectangle= new Rectangle(25.0,12.0);
        rectangle.setLength(15.0);
        rectangle.setWidth(8.0);
        assertEquals(15.0,rectangle.getLength(),0);
        assertEquals(8.0,rectangle.getWidth(),0);


    }


}
