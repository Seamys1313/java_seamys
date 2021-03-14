package ru.stqa.seamys.sandbox;

import org.testng.annotations.Test;

public class PointTest2 {
    @Test
    public void testDistance(){
        Point p1 = new Point(-3,-5);
        Point p2 = new Point(-6,-7);
        assert p1.distance(p2) == 3.605551275463989;
    }
}
