package ru.stqa.seamys.sandbox;



import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance() {

        Point p1 = new Point(-5, -5);
        Point p2 = new Point(-5, -5);
        assert(p1.distance(p2) == 0.0);

    }
}



