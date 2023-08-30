public class Song {



    // Mp = 0.81 * Lp/15 + 0.04 * Np + 0.15 * min(Ip, 5)/5
    // Lp is sum of segments' vertical and horizontal length  Max(|x1-x2|, |y1-y2|)
    // Np is the ratio of non-repeated sub-patterns
    // Ip is the number of intersections

    public static double[][] meter(int[][] combinations, int m){
        double [][] results = new double[m][10];
        int i,j;

        for (i=0; i<m; i++){
            int[] tempPattern = new int[9];
            double Mp = 0.0;
            int Lp = 0;
            int Sp = 0;
            int Rp = 0;
            int Ip = 0;
            Double Np = 0.0;
            int size = 9;
            for (j=0;j<9;j++){
                if (combinations[i][j]==0){
                    size = j;
                    break;
                }
            }
            for (j=0;j<9;j++){
                results[i][j] = combinations[i][j];
                tempPattern[j] = combinations[i][j];
                if (j>0 && j<size){
                    int length = Math.max(Math.abs(Point.pointMap.get(combinations[i][j]).x-Point.pointMap.get(combinations[i][j-1]).x),
                            Math.abs(Point.pointMap.get(combinations[i][j]).y-Point.pointMap.get(combinations[i][j-1]).y));
                    Lp += length;
                }

            }



            for (j=0;j<size;j++){
                Rp = 2 * checkContinuousSequences(tempPattern);
            }

            Sp = size - 1;
            Np = (double) (Sp - Rp)/(double) Sp;

            Ip = intersections.intersections(tempPattern,size);

            Mp = 0.81 * Lp/15 + 0.04 * Np + 0.15 * Math.min(Ip, 5)/5;

            results[i][9] = Mp;

        }
        return results;
    }

    public static int checkContinuousSequences(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (isSequence(arr, i, new int[]{1, 2, 3}) ||
                    isSequence(arr, i, new int[]{1, 4, 7}) ||
                    isSequence(arr, i, new int[]{1, 5, 9}) ||
                    isSequence(arr, i, new int[]{2, 5, 8}) ||
                    isSequence(arr, i, new int[]{3, 2, 1}) ||
                    isSequence(arr, i, new int[]{3, 5, 7}) ||
                    isSequence(arr, i, new int[]{3, 6, 9}) ||
                    isSequence(arr, i, new int[]{4, 5, 6}) ||
                    isSequence(arr, i, new int[]{6, 5, 4}) ||
                    isSequence(arr, i, new int[]{7, 4, 1}) ||
                    isSequence(arr, i, new int[]{7, 5, 3}) ||
                    isSequence(arr, i, new int[]{7, 8, 9}) ||
                    isSequence(arr, i, new int[]{8, 5, 2}) ||
                    isSequence(arr, i, new int[]{9, 8, 7}) ||
                    isSequence(arr, i, new int[]{9, 5, 1}) ||
                    isSequence(arr, i, new int[]{9, 6, 3})) {
                count++;
            }
        }

        return count;
    }

    public static boolean isSequence(int[] arr, int startIndex, int[] sequence) {
        for (int i = 0; i < sequence.length; i++) {
            if (arr[startIndex + i] != sequence[i]) {
                return false;
            }
        }
        return true;
    }
}
