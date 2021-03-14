package ru.stqa.seamys.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest4 {
    @Test
    public void testDistance(){
        Point p1 = new Point(2,1);
        Point p2 = new Point(7,7);
        Assert.assertEquals(p1.distance(p2),7.810249675906654);
    }
}
