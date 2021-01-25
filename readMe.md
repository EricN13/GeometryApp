I can create a rectangle with a length and a width

When I create a rectangle with a length and width
Then I can retrieve the length and width from the rectangle

*************************************************************
I can create a rectangle without a length and width

When I create a rectangle without a length and width
Then the length and width I retrieve are both 1

****************************************************************

I can change the length and width of a rectangle

When I change the width of the rectangle
Then the width I retrieve is the new width

When I change the length of the rectangle
Then the length I retrieve is the new length

****************************************************************
I can create a circle with a radius

When I create a circle with a radius
Then I can retrieve the radius from the circle

**************************************************************
I can create a circle without a radius

When I create a circle without a radius
Then the radius I retrieve is 1

*************************************************************

I can change the radius of a circle

When I change the radius of a circle
Then the radius I retrieve is the new radius

************************************************************
I can set the color of any shape

When I set the color of any shape
Then I can retrieve the color of that shape

When I have not set the color of a shape
Then the color I retrieve is “Burnt Umber”

**************************************************
I can find the perimeter of any shape

When I have a shape
Then I can retrieve its perimeter

**************************************************

I can find the area of any shape

When I have a shape
Then I can retrieve its area

***************************************************

I can create a point

When I create a point (x,y)
Then I can retrieve its x and y coordinates

************************************************
I can place any shape at an (x,y) point on a cartesian plane

When I have a shape and a point
Then I can set the shape’s center location to the point





