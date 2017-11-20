/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä1;

/**
 *
 * @author mikko
 */
import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

public class Tehtävä1{
    public static void main(String[] args) {
        List<Point> points = Arrays.asList(new Point(12, 2), null);
        points.stream().map(p -> p.getX()).forEach(System.out::println);
    }
    
    public static class Point{
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public Point moveRightBy(int x) {
            return new Point(this.x + x, this.y);
        }
        
        @Override
        public boolean equals(Object obj) {
            if(obj != null && obj instanceof Point) {
                Point p = (Point) obj;
                if (p.x == this.x && p.y == this.y)
                    return true;
            }
            return false;
        }
        
        public static List<Point> moveAllPointsRightBy(List<Point> points, int x) {
            return points.stream().map(p -> p.moveRightBy(x)).collect(toList());
    }
    }
    
}
