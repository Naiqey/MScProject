import org.locationtech.jts.geom.Coordinate;

import java.util.HashMap;
import java.util.Map;

public class Sun {


    // PSp = Sp * Log2(Lp + Ip + Op)
    // PSp is the strength score of pattern P
    // Sp is the size
    // Lp is the physical length
    // Ip is the number of intersections
    // Op is the number of overlaps of P
    public static int[][] meter(int[][] combinations, int m){
        int [][] results = new int[m][10];
        int i,j;
        int Sp = 9; //size


        //Sp
        for (j=0; j<9;j++){
            if (combinations[0][j]==0){
                Sp = j;
                break;
            }
        }

        for(i=0; i<m; i++){
            Double PSp = 0.0;
            Double Lp = 0.0; //length
            int Ip = 0; //intersections
            int Op = 0; //overlapping

            int[] tempPattern = new int[9];
            for (j=0;j<9;j++){
                tempPattern[j] = combinations[i][j];




                if(j > 0){
                    if((combinations[i][j] == 1 && combinations[i][j-1] == 3) || (combinations[i][j] == 3 && combinations[i][j-1] ==1)
                            || (combinations[i][j] == 1 && combinations[i][j-1] == 7) || (combinations[i][j] == 7 && combinations[i][j-1] == 1)
                            || (combinations[i][j] == 1 && combinations[i][j-1] == 9) || (combinations[i][j] == 9 && combinations[i][j-1] == 1)
                            || (combinations[i][j] == 2 && combinations[i][j-1] == 8) || (combinations[i][j] == 8 && combinations[i][j-1] == 2)
                            || (combinations[i][j] == 3 && combinations[i][j-1] == 7) || (combinations[i][j] == 7 && combinations[i][j-1] == 3)
                            || (combinations[i][j] == 3 && combinations[i][j-1] == 9) || (combinations[i][j] == 9 && combinations[i][j-1] == 3)
                            || (combinations[i][j] == 4 && combinations[i][j-1] == 6) || (combinations[i][j] == 6 && combinations[i][j-1] == 4)
                            || (combinations[i][j] == 7 && combinations[i][j-1] == 9) || (combinations[i][j] == 9 && combinations[i][j-1] == 7)){
                        Op ++;
                    }
                }
                results[i][j] = combinations [i][j];
            }
            Ip = intersections.intersections(tempPattern,Sp);
            Lp = Line.length(tempPattern);
            results[i][9] = (int) (Sp * Math.log(Lp + Ip + Op) / Math.log(2));



        }

        return results;
    }
}
