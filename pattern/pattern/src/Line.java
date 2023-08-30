import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Line {
    int x;
    int y;

    public Line(int x, int y){
        this.x = x;
        this.y = y;
    }



    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line otherLine = (Line) o;

        return x == otherLine.x && y == otherLine.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static Map<Line,Double> lengthMap = new HashMap<>();
    static Double SR2 = Math.sqrt(2);
    static Double SR5 = Math.sqrt(5);
    static {
        lengthMap.put(new Line(1,2), 1.0);
        lengthMap.put(new Line(1,3), 2.0);
        lengthMap.put(new Line(1,4), 1.0);
        lengthMap.put(new Line(1,5), SR2);
        lengthMap.put(new Line(1,6), SR5);
        lengthMap.put(new Line(1,7), 2.0);
        lengthMap.put(new Line(1,8), SR5);
        lengthMap.put(new Line(1,9), SR2*2);
        lengthMap.put(new Line(2,3), 1.0);
        lengthMap.put(new Line(2,4), SR2);
        lengthMap.put(new Line(2,5), 1.0);
        lengthMap.put(new Line(2,6), SR2);
        lengthMap.put(new Line(2,7), SR5);
        lengthMap.put(new Line(2,8), 2.0);
        lengthMap.put(new Line(2,9), SR5);
        lengthMap.put(new Line(3,4), SR5);
        lengthMap.put(new Line(3,5), SR2);
        lengthMap.put(new Line(3,6), 1.0);
        lengthMap.put(new Line(3,7), SR2*2);
        lengthMap.put(new Line(3,8), SR5);
        lengthMap.put(new Line(3,9), 2.0);
        lengthMap.put(new Line(4,5), 1.0);
        lengthMap.put(new Line(4,6), 2.0);
        lengthMap.put(new Line(4,7), 1.0);
        lengthMap.put(new Line(4,8), SR2);
        lengthMap.put(new Line(4,9), SR5);
        lengthMap.put(new Line(5,6), 1.0);
        lengthMap.put(new Line(5,7), SR2);
        lengthMap.put(new Line(5,8), 1.0);
        lengthMap.put(new Line(5,9), SR2);
        lengthMap.put(new Line(6,7), SR5);
        lengthMap.put(new Line(6,8), SR2);
        lengthMap.put(new Line(6,9), 1.0);
        lengthMap.put(new Line(7,8), 1.0);
        lengthMap.put(new Line(7,9), 2.0);
        lengthMap.put(new Line(8,9), 1.0);
    }

    static Double length(int[] pattern){


        Double length = 0.0;
        for (int i=1; i<9; i++){
            if (pattern[i]==0){
                break;
            }
            int x = pattern[i-1];
            int y = pattern[i];
            if (x>y){
                int temp = x;
                x = y;
                y = temp;
            }
            System.out.println("Getting value for Line (" + x + "," + y + ")");

            length += lengthMap.get(new Line(x,y));
        }
        return length;
    }
}

