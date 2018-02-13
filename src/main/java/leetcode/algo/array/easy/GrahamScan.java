package leetcode.algo.array.easy;

//import java.awt.geom.Point2D;
import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.geometry.Point2D;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by banindita on 6/4/2017.
 */
public class GrahamScan {
    private Stack<Point2D> hull = new Stack<Point2D>();

    public static void main(String[] args) {
        Point2D[] points = new Point2D[8];
        points[0] = new Point2D(0,3);
        points[1] = new Point2D(1,1);
        points[2] = new Point2D(2,2);
        points[3] = new Point2D(4,4);
        points[4] = new Point2D(0,0);
        points[5] = new Point2D(1,2);
        points[6] = new Point2D(3,1);
        points[7] = new Point2D(3,3);
        System.out.println();

        GrahamScan graham = new GrahamScan(points);
        for(Point2D point:graham.hull){
            System.out.println(point);
        }
    }
    public GrahamScan(Point2D[] points) {
        int n = points.length;
        Point2D[] a = new Point2D[n];
        for(int i =0; i < n; i++){
            a[i] = points[i];
        }

        Arrays.sort(a);
    }

}
