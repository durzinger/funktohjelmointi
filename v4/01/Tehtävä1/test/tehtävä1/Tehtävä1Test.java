/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä1;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import tehtävä1.Tehtävä1.*;
/**
 *
 * @author mikko
 */
public class Tehtävä1Test {
    
    /**
     * Test of main method, of class Tehtävä1.
     * @throws java.lang.Exception
     */
    @Test
    public void testmoveAllPointsRightBy() throws Exception {
        List<Point> points = Arrays.asList(new Point(5,5), new Point(10,5));
        List<Point> expectedPoints = Arrays.asList(new Point(15,5), new Point(20,5));
        List<Point> newPoints = Point.moveAllPointsRightBy(points, 10);
        assertEquals(expectedPoints, newPoints);
    }
    
}
