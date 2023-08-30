import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BierDirection {

    int x;
    int y;

    public BierDirection(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BierDirection otherD = (BierDirection) o;

        return x == otherD.x && y == otherD.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


    public static Map<BierDirection,Integer> wdMap = new HashMap<>();

    static {
        //L
        wdMap.put(new BierDirection(5,4),1);
        wdMap.put(new BierDirection(6,4),1);
        //U
        wdMap.put(new BierDirection(5,2),1);
        wdMap.put(new BierDirection(8,2),1);
        //R
        wdMap.put(new BierDirection(5,6),1);
        wdMap.put(new BierDirection(4,6),1);
        //D
        wdMap.put(new BierDirection(5,8),1);
        wdMap.put(new BierDirection(2,8),1);
        //Y
        wdMap.put(new BierDirection(5,1),2);
        wdMap.put(new BierDirection(9,1),2);
        //T
        wdMap.put(new BierDirection(5,3),2);
        wdMap.put(new BierDirection(7,3),2);
        //E
        wdMap.put(new BierDirection(5,7),2);
        wdMap.put(new BierDirection(3,7),2);
        //P
        wdMap.put(new BierDirection(5,9),2);
        wdMap.put(new BierDirection(1,9),2);
        //H
        wdMap.put(new BierDirection(8,1),3);
        wdMap.put(new BierDirection(1,8),3);
        //Q
        wdMap.put(new BierDirection(8,3),3);
        wdMap.put(new BierDirection(3,8),3);
        //W
        wdMap.put(new BierDirection(2,7),3);
        wdMap.put(new BierDirection(7,2),3);
        //G
        wdMap.put(new BierDirection(2,9),3);
        wdMap.put(new BierDirection(9,2),3);
        //X
        wdMap.put(new BierDirection(4,9),3);
        wdMap.put(new BierDirection(9,4),3);
        //V
        wdMap.put(new BierDirection(6,7),3);
        wdMap.put(new BierDirection(7,6),3);
        //F
        wdMap.put(new BierDirection(6,1),3);
        wdMap.put(new BierDirection(1,6),3);
        //A
        wdMap.put(new BierDirection(4,3),3);
        wdMap.put(new BierDirection(3,4),3);
    }

}
