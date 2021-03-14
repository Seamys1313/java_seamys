package ru.stqa.seamys.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance() {

        Point p1 = new Point(5.0,6.0 );
        Point p2 = new Point(6.0, 7.0);
        Assert.assertEquals(p1.distance(p2), 1.4142135623730951);

    }
}



