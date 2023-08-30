import java.util.HashMap;
import java.util.Map;

public class Point {

    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    static Map<Integer, Point> pointMap = new HashMap<>();

    static {
        pointMap.put(1,new Point(1,1));
        pointMap.put(2,new Point(1,2));
        pointMap.put(3,new Point(1,3));
        pointMap.put(4,new Point(2,1));
        pointMap.put(5,new Point(2,2));
        pointMap.put(6,new Point(2,3));
        pointMap.put(7,new Point(3,1));
        pointMap.put(8,new Point(3,2));
        pointMap.put(9,new Point(3,3));
    }
}
