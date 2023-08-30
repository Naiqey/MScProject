import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.LineSegment;

import java.util.HashMap;
import java.util.Map;

public class intersections {

    public static int intersections(int[] pattern,int n){

        Coordinate[] points = {
                new Coordinate(1, 1), new Coordinate(2, 1), new Coordinate(3, 1),
                new Coordinate(1, 2), new Coordinate(2, 2), new Coordinate(3, 2),
                new Coordinate(1, 3), new Coordinate(2, 3), new Coordinate(3, 3)
        };

        LineSegment[] segments = new LineSegment[n-1];

        for (int i=0; i<n-1; i++){
            //System.out.println(pattern[i]);
            segments[i] = new LineSegment(points[pattern[i]-1],points[pattern[i+1]-1]);
        }


        int intersectionCount = 0;

        for (int i = 0; i < segments.length - 1; i++) {
            for (int j = i + 1; j < segments.length; j++) {

                if (segments[i].intersection(segments[j]) != null) {
                    intersectionCount++;
                }
            }
        }

        return intersectionCount;
    }


}
