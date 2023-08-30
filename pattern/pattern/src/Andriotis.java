public class Andriotis {

    public static int[][] meter(int[][] combinations, int m){
        int [][] results = new int[m][10];
        int x1, x2, x3, x4, x5 = 0;

        /*//x1
        for (int i=0; i<m; i++){
            if (combinations[i][0] == 1){
                x1=1;
            }else x1 = 0;
        }*/

        //x2
        /*if (n>=6){
            x2 = n-5;
        }else x2 = 0;*/

        //x3 direction change
        /*int c = 0;
        for(int i=0; i<m; i++){
            for(int j=1; j<8; j++){
                if (combinations[i][j] == 0){
                    continue;
                }
                if (combinations[i][j] == 1 || combinations[i][j] == 3 || combinations[i][j] == 7 || combinations[i][j] == 9){
                    c ++;
                }
                if (combinations[i][j] == 2){
                    if(combinations[i][j-1]*combinations[i][j+1] != 3){
                        c ++;
                    }
                }
                if (combinations[i][j] == 4){
                    if(combinations[i][j-1]*combinations[i][j+1] != 7){
                        c ++;
                    }
                }
                if (combinations[i][j] == 6){
                    if(combinations[i][j-1]*combinations[i][j+1] != 27){
                        c ++;
                    }
                }
                if (combinations[i][j] == 8){
                    if(combinations[i][j-1]*combinations[i][j+1] != 63){
                        c ++;
                    }
                }
                if (combinations[i][j] == 5){
                    if(combinations[i][j-1]*combinations[i][j+1] != 9
                    && combinations[i][j-1]*combinations[i][j+1] != 16
                    && combinations[i][j-1]*combinations[i][j+1] != 21
                    && (!(combinations[i][j-1]==4 && combinations[i][j+1]==6))
                    && (!(combinations[i][j-1]==6 && combinations[i][j+1]==4))){
                        c ++;
                    }
                }
            }
        }
        if(c >=2 ){
            x3 = 1;
        }else {
            x3 = 0;
        }*/

        // x4 knight move
        // 16/18/27/29/34/38/49/67
        //int k = 0;
        /*for(int i=0; i<m; i++){
            for (int j=1; j<9; j++){
                if((combinations[i][j] == 1 && combinations[i][j-1] == 6) || (combinations[i][j] == 6 && combinations[i][j-1] == 1)
                || (combinations[i][j] == 1 && combinations[i][j-1] == 8) || (combinations[i][j] == 8 && combinations[i][j-1] == 1)
                || (combinations[i][j] == 2 && combinations[i][j-1] == 7) || (combinations[i][j] == 7 && combinations[i][j-1] == 2)
                || (combinations[i][j] == 2 && combinations[i][j-1] == 9) || (combinations[i][j] == 9 && combinations[i][j-1] == 2)
                || (combinations[i][j] == 3 && combinations[i][j-1] == 4) || (combinations[i][j] == 4 && combinations[i][j-1] == 3)
                || (combinations[i][j] == 3 && combinations[i][j-1] == 8) || (combinations[i][j] == 8 && combinations[i][j-1] == 3)
                || (combinations[i][j] == 4 && combinations[i][j-1] == 9) || (combinations[i][j] == 9 && combinations[i][j-1] == 4)
                || (combinations[i][j] == 6 && combinations[i][j-1] == 7) || (combinations[i][j] == 7 && combinations[i][j-1] == 6)){
                    k ++;
                }
            }
        }*/
        //x4 = k;

        // x5 overlapping
        // e.g 231/213
        // 13/17/19/28/37/39/46/79
        //int o = 0;
       /* for(int i=0; i<m; i++){
            for (int j=1; j<9; j++){
                if((combinations[i][j] == 1 && combinations[i][j-1] == 3) || (combinations[i][j] == 3 && combinations[i][j-1] ==1)
                        || (combinations[i][j] == 1 && combinations[i][j-1] == 7) || (combinations[i][j] == 7 && combinations[i][j-1] == 1)
                        || (combinations[i][j] == 1 && combinations[i][j-1] == 9) || (combinations[i][j] == 9 && combinations[i][j-1] == 1)
                        || (combinations[i][j] == 2 && combinations[i][j-1] == 8) || (combinations[i][j] == 8 && combinations[i][j-1] == 2)
                        || (combinations[i][j] == 3 && combinations[i][j-1] == 7) || (combinations[i][j] == 7 && combinations[i][j-1] == 3)
                        || (combinations[i][j] == 3 && combinations[i][j-1] == 9) || (combinations[i][j] == 9 && combinations[i][j-1] == 3)
                        || (combinations[i][j] == 4 && combinations[i][j-1] == 6) || (combinations[i][j] == 6 && combinations[i][j-1] == 4)
                        || (combinations[i][j] == 7 && combinations[i][j-1] == 9) || (combinations[i][j] == 9 && combinations[i][j-1] == 7)){
                    o ++;
                }
            }
        }
        x5 = o;*/

        for(int i=0; i<m; i++){

            //x1
            if (combinations[i][0] == 1){
                x1=1;
            }else x1 = 0;

            //x2
            int P = 9;
            for(int j=0; j<9; j++){
                if (combinations[i][j] == 0){
                    P = j;
                    break;
                }
            }
            if (P >= 6){
                x2 = P - 5;
            }else x2 = 0;

            //x3
            int c = 0;
            int k =0;
            int o = 0;
            for(int j=0; j<9; j++){
                if(j > 0 && j < 8){
/*                    if (combinations[i][j] == 0){
                        continue;
                    }*/
                    if (combinations[i][j] == 1 || combinations[i][j] == 3 || combinations[i][j] == 7 || combinations[i][j] == 9){
                        c ++;
                    }
                    if (combinations[i][j] == 2){
                        if(combinations[i][j-1]*combinations[i][j+1] != 3){
                            c ++;
                        }
                    }
                    if (combinations[i][j] == 4){
                        if(combinations[i][j-1]*combinations[i][j+1] != 7){
                            c ++;
                        }
                    }
                    if (combinations[i][j] == 6){
                        if(combinations[i][j-1]*combinations[i][j+1] != 27){
                            c ++;
                        }
                    }
                    if (combinations[i][j] == 8){
                        if(combinations[i][j-1]*combinations[i][j+1] != 63){
                            c ++;
                        }
                    }
                    if (combinations[i][j] == 5){
                        if(combinations[i][j-1]*combinations[i][j+1] != 9
                                && combinations[i][j-1]*combinations[i][j+1] != 16
                                && combinations[i][j-1]*combinations[i][j+1] != 21
                                && (!(combinations[i][j-1]==4 && combinations[i][j+1]==6))
                                && (!(combinations[i][j-1]==6 && combinations[i][j+1]==4))){
                            c ++;
                        }
                    }
                }
                if(j > 0){
                    if((combinations[i][j] == 1 && combinations[i][j-1] == 6) || (combinations[i][j] == 6 && combinations[i][j-1] == 1)
                            || (combinations[i][j] == 1 && combinations[i][j-1] == 8) || (combinations[i][j] == 8 && combinations[i][j-1] == 1)
                            || (combinations[i][j] == 2 && combinations[i][j-1] == 7) || (combinations[i][j] == 7 && combinations[i][j-1] == 2)
                            || (combinations[i][j] == 2 && combinations[i][j-1] == 9) || (combinations[i][j] == 9 && combinations[i][j-1] == 2)
                            || (combinations[i][j] == 3 && combinations[i][j-1] == 4) || (combinations[i][j] == 4 && combinations[i][j-1] == 3)
                            || (combinations[i][j] == 3 && combinations[i][j-1] == 8) || (combinations[i][j] == 8 && combinations[i][j-1] == 3)
                            || (combinations[i][j] == 4 && combinations[i][j-1] == 9) || (combinations[i][j] == 9 && combinations[i][j-1] == 4)
                            || (combinations[i][j] == 6 && combinations[i][j-1] == 7) || (combinations[i][j] == 7 && combinations[i][j-1] == 6)){
                        k ++;
                    }

                    if((combinations[i][j] == 1 && combinations[i][j-1] == 3) || (combinations[i][j] == 3 && combinations[i][j-1] ==1)
                            || (combinations[i][j] == 1 && combinations[i][j-1] == 7) || (combinations[i][j] == 7 && combinations[i][j-1] == 1)
                            || (combinations[i][j] == 1 && combinations[i][j-1] == 9) || (combinations[i][j] == 9 && combinations[i][j-1] == 1)
                            || (combinations[i][j] == 2 && combinations[i][j-1] == 8) || (combinations[i][j] == 8 && combinations[i][j-1] == 2)
                            || (combinations[i][j] == 3 && combinations[i][j-1] == 7) || (combinations[i][j] == 7 && combinations[i][j-1] == 3)
                            || (combinations[i][j] == 3 && combinations[i][j-1] == 9) || (combinations[i][j] == 9 && combinations[i][j-1] == 3)
                            || (combinations[i][j] == 4 && combinations[i][j-1] == 6) || (combinations[i][j] == 6 && combinations[i][j-1] == 4)
                            || (combinations[i][j] == 7 && combinations[i][j-1] == 9) || (combinations[i][j] == 9 && combinations[i][j-1] == 7)){
                        o ++;
                    }
                }

                results[i][j] = combinations [i][j];

            }
            if(c >=2 ){
                x3 = 1;
            }else {
                x3 = 0;
            }

            x4 = k;

            x5 = o;

            int[] matrix1 = {x1, x2, x3, x4, x5};
            int[] matrix2 = {1, 1, 1, 1, 1};

            int dotProduct = 0;

            for (int q = 0; q < matrix1.length; q++) {
                dotProduct += matrix1[q] * matrix2[q];
            }

            results[i][9] =dotProduct;

        }
        return results;
    }

}
