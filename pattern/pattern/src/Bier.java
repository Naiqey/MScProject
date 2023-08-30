import java.util.HashMap;
import java.util.Map;

public class Bier {

    static Map<Integer,Double> P0Map = new HashMap<>();
    static{
        P0Map.put(1,0.39);
        P0Map.put(2,0.1);
        P0Map.put(3,0.12);
        P0Map.put(4,0.06);
        P0Map.put(5,0.04);
        P0Map.put(6,0.06);
        P0Map.put(7,0.075);
        P0Map.put(8,0.055);
        P0Map.put(9,0.1);
    }

    //m(P) = m(P0;d1,d2,d3...dk) = (1 - p(P0)) (1 - a^k) (sum(wd) / 3k)

    static double a = 0.8;

    public static double[][] meter(int[][] combinations, int size, int m){

        double [][] results = new double[m][10];
        int k = size-1;
        int i,j;


        for (i=0; i<m; i++){
            int sumWd = 0;
            double mp = 0.0;
            for (j=0; j<9; j++){
                results[i][j] = combinations[i][j];
            }
            for (j=1; j<size; j++){
                if (null != BierDirection.wdMap.get(new BierDirection(combinations[i][j-1],combinations[i][j]))){
                    sumWd += BierDirection.wdMap.get(new BierDirection(combinations[i][j-1],combinations[i][j]));
                }



            }

            mp = (double)(1 - P0Map.get(combinations[i][0])) * (double)(1 - Math.pow(0.8,k)) * ((double)sumWd/(3*k));
            //System.out.println((1 - P0Map.get(combinations[i][0]))+" "+(1 - Math.pow(0.8,k))+" "+(sumWd/(3*k))+" "+mp+" "+i);
            results[i][9] = mp;
        }
        return results;
    }



}
