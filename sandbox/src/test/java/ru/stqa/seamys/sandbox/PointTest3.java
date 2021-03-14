package ru.stqa.seamys.sandbox;

import org.testng.annotations.Test;

public class PointTest3 {
    @Test
    public void testDistance(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,0);
        assert p1.distance(p2) == 0.0;
    }
}
