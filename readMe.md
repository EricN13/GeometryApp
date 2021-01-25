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

**************************************************************

I can find the location of any shape on my plane

When I have a shape that’s been placed on my plane
Then I can retrieve the point at which it is located

**************************************************************

I cannot find the location of a shape that is not on my plane

When I have a shape that’s not been placed on my plane
Then attempting to retrieve its location informs me that the 
shape is not on the plane

**************************************************************
I can move any point by an (x,y) offset

When I have a point
Then if I give that point an (x, y) offset
Then the point changes to the sum of its coordinates and those I’ve provided

******************************************************************

I can move any shape by an (x,y) offset from its current location

When I have a shape that’s been placed on my plane
Then if I give the shape an (x,y) offset
Then the shape’s center point moves by that offset

*******************************************************************

I can find the distance between any two shapes

If I have two shapes on my plane
Then I can find the absolute linear distance between their centers

**********************************************************************

I can see representations of all of the things I have

If I have a rectangle on my plane
Then I should see “<length> X <width> rectangle at (x,y)”

If I have a rectangle not on my plane
Then I should see “<length> X <width> rectangle”

If I have a circle on my plane
Then I should see “circle of radius <radius> at (x,y)”

If I have a rectangle not on my plane
Then I should see “circle of radius <radius>”

If I have a point
Then I should see “(x,y)”

If I have a segment
Then I should see “[(x,y)--(x,y)]”

If I have any items on my plane
Then I should be able to see a representation of all of them




