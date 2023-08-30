import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class newPattern {

    public static int[][] generate(int n){
        int i, j, count = 0;
        int n0, n1, n2, n3, n4, n5, n6, n7, n8;

        int flag, flag2, flag4, flag6, flag8, flag5;

        int[][] combinations = new int[50000000][9];

        int[] check = new int[10];

        for (n0 = 1; n0 <= 9; n0++){
            for (n1 = 1; n1 <= 9; n1++){
                for(n2 = 1; n2 <= 9; n2++){
                    for(n3 = 1; n3 <= 9; n3++){
                        for(n4 = 1; n4 <= 9; n4++){
                            for(n5 = 1; n5 <= 9; n5++){
                                for(n6 = 1; n6 <= 9; n6++){
                                    for(n7 = 1; n7 <= 9; n7++){
                                        for(n8 = 1; n8 <= 9; n8++){

                                            for(i=0; i<10; i++){
                                                check[i] = 0;
                                            }
                                            if(n>3){
                                                check[n0]=1;
                                                check[n1]=1;
                                                check[n2]=1;
                                                check[n3]=1;
                                            }
                                            if(n>4){
                                                check[n4]=1;
                                            }
                                            if(n>5){
                                                check[n5]=1;
                                            }
                                            if(n>6){
                                                check[n6]=1;
                                            }
                                            if(n>7){
                                                check[n7]=1;
                                            }
                                            if(n>8){
                                                check[n8]=1;
                                            }

                                            int sum = check[0]+check[1]+check[2]+check[3]+check[4]+check[5]+check[6]+check[7]+check[8]+check[9];

                                            if(n!=sum){
                                                continue;
                                            }

                                            flag = 0;
                                            flag2 = 1;
                                            flag4 = 1;
                                            flag5 = 1;
                                            flag6 = 1;
                                            flag8 = 1;


                                            if(n>3){
                                                combinations[count][0] = n0;
                                                combinations[count][1] = n1;
                                                combinations[count][2] = n2;
                                                combinations[count][3] = n3;
                                            }
                                            if(n>4){
                                                combinations[count][4] = n4;
                                            }
                                            if(n>5){
                                                combinations[count][5] = n5;
                                            }
                                            if(n>6){
                                                combinations[count][6] = n6;
                                            }
                                            if(n>7){
                                                combinations[count][7] = n7;
                                            }
                                            if(n>8){
                                                combinations[count][8] = n8;
                                            }

                                            for(j=0; j<8; j++){
                                                if(combinations[count][j]==2) flag2 = 0;
                                                if(combinations[count][j]==4) flag4 = 0;
                                                if(combinations[count][j]==5) flag5 = 0;
                                                if(combinations[count][j]==6) flag6 = 0;
                                                if(combinations[count][j]==8) flag8 = 0;

                                                if((combinations[count][j] == 1)&&(combinations[count][j+1]==3)&&(flag2==1)) flag = 1;
                                                if((combinations[count][j] == 3)&&(combinations[count][j+1]==1)&&(flag2==1)) flag = 1;

                                                if((combinations[count][j] == 1)&&(combinations[count][j+1]==7)&&(flag4==1)) flag = 1;
                                                if((combinations[count][j] == 7)&&(combinations[count][j+1]==1)&&(flag4==1)) flag = 1;

                                                if((combinations[count][j] == 2)&&(combinations[count][j+1]==8)&&(flag5==1)) flag = 1;
                                                if((combinations[count][j] == 8)&&(combinations[count][j+1]==2)&&(flag5==1)) flag = 1;

                                                if((combinations[count][j] == 4)&&(combinations[count][j+1]==6)&&(flag5==1)) flag = 1;
                                                if((combinations[count][j] == 6)&&(combinations[count][j+1]==4)&&(flag5==1)) flag = 1;

                                                if((combinations[count][j] == 1)&&(combinations[count][j+1]==9)&&(flag5==1)) flag = 1;
                                                if((combinations[count][j] == 9)&&(combinations[count][j+1]==1)&&(flag5==1)) flag = 1;

                                                if((combinations[count][j] == 3)&&(combinations[count][j+1]==7)&&(flag5==1)) flag = 1;
                                                if((combinations[count][j] == 7)&&(combinations[count][j+1]==3)&&(flag5==1)) flag = 1;

                                                if((combinations[count][j] == 3)&&(combinations[count][j+1]==9)&&(flag6==1)) flag = 1;
                                                if((combinations[count][j] == 9)&&(combinations[count][j+1]==3)&&(flag6==1)) flag = 1;

                                                if((combinations[count][j] == 7)&&(combinations[count][j+1]==9)&&(flag8==1)) flag = 1;
                                                if((combinations[count][j] == 9)&&(combinations[count][j+1]==7)&&(flag8==1)) flag = 1;
                                            }

                                            if(flag == 1){
                                                for(j = 0; j < 9; j++ ){
                                                    combinations[count][j] = 0;
                                                }
                                            }

                                            if (flag == 0) {
                                                int equality = 0;
                                                if (count > 0){
                                                    for (j = 0; j < 9; j++ ) {
                                                        if (combinations[count - 1][j] == combinations[count][j]) {
                                                            equality++;
                                                        }
                                                    }
                                                    if (equality == 9){
                                                        for(j = 0; j < 9; j++ ){
                                                            combinations[count][j] = 0;
                                                        }
                                                    }else {
                                                        for(j = 0; j < 9; j++ ){
                                                            System.out.println(combinations[count][0] + "" + combinations[count][1] + "" + combinations[count][2] + "" + combinations[count][3]
                                                                    + "" + combinations[count][4] + "" + combinations[count][5] + "" + combinations[count][6] + "" + combinations[count][7] + "" + combinations[count][8] );
                                                        }
                                                        count++;
                                                    }
                                                }else{
                                                    for(j = 0; j < 9; j++ ){
                                                        System.out.println(combinations[count][0] + "" + combinations[count][1] + "" + combinations[count][2] + "" + combinations[count][3]
                                                                + "" + combinations[count][4] + "" + combinations[count][5] + "" + combinations[count][6] + "" + combinations[count][7] + "" + combinations[count][8] );
                                                    }
                                                    count++;
                                                }

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
        return combinations;
    }


    public static void main(String[] args){

        //int[][] pattern4 = generate(4);
        //int[][] pattern5 = generate(5);
        //int[][] pattern6 = generate(6);
        //int[][] pattern7 = generate(7);
        //int[][] pattern8 = generate(8);
        int[][] pattern9 = generate(9);

        //int[][] pattern_An4 = Andriotis.meter(pattern4,Constants.NUM_OF_PATTERN4);
        //int[][] pattern_An5 = Andriotis.meter(pattern5,Constants.NUM_OF_PATTERN5);
        //int[][] pattern_An6 = Andriotis.meter(pattern6,Constants.NUM_OF_PATTERN6);
        //int[][] pattern_An7 = Andriotis.meter(pattern7,Constants.NUM_OF_PATTERN7);
        //int[][] pattern_An8 = Andriotis.meter(pattern8,Constants.NUM_OF_PATTERN8);
        //int[][] pattern_An9 = Andriotis.meter(pattern9,Constants.NUM_OF_PATTERN9);

        //int[][] pattern_Sun4 = Sun.meter(pattern4,Constants.NUM_OF_PATTERN4);
        //int[][] pattern_Sun5 = Sun.meter(pattern5,Constants.NUM_OF_PATTERN5);
        //int[][] pattern_Sun6 = Sun.meter(pattern6,Constants.NUM_OF_PATTERN6);
        //int[][] pattern_Sun7 = Sun.meter(pattern7,Constants.NUM_OF_PATTERN7);
        //int[][] pattern_Sun8 = Sun.meter(pattern8,Constants.NUM_OF_PATTERN8);
        //int[][] pattern_Sun9 = Sun.meter(pattern9,Constants.NUM_OF_PATTERN9);

        //double[][] pattern_Song4 = Song.meter(pattern4,Constants.NUM_OF_PATTERN4);
        //double[][] pattern_Song5 = Song.meter(pattern5,Constants.NUM_OF_PATTERN5);
        //double[][] pattern_Song6 = Song.meter(pattern6,Constants.NUM_OF_PATTERN6);
        //double[][] pattern_Song7 = Song.meter(pattern7,Constants.NUM_OF_PATTERN7);
        //double[][] pattern_Song8 = Song.meter(pattern8,Constants.NUM_OF_PATTERN8);
        //double[][] pattern_Song9 = Song.meter(pattern9,Constants.NUM_OF_PATTERN9);

        //double[][] pattern_Bier4 = Bier.meter(pattern4,4,Constants.NUM_OF_PATTERN4);
        //double[][] pattern_Bier5 = Bier.meter(pattern5,5,Constants.NUM_OF_PATTERN5);
        //double[][] pattern_Bier6 = Bier.meter(pattern6,6,Constants.NUM_OF_PATTERN6);
        //double[][] pattern_Bier7 = Bier.meter(pattern7,7,Constants.NUM_OF_PATTERN7);
        //double[][] pattern_Bier8 = Bier.meter(pattern8,8,Constants.NUM_OF_PATTERN8);
        double[][] pattern_Bier9 = Bier.meter(pattern9,9,Constants.NUM_OF_PATTERN9);



        try {
            //FileWriter fileWriter4 = new FileWriter("Bier_4.txt");
            //FileWriter fileWriter5 = new FileWriter("Bier_5.txt");
            //FileWriter fileWriter6 = new FileWriter("Bier_6.txt");
            //FileWriter fileWriter7 = new FileWriter("Bier_7.txt");
            //FileWriter fileWriter8 = new FileWriter("Bier_8.txt");
            FileWriter fileWriter9 = new FileWriter("Bier_9.txt");

            //FileWriter fileWriter44 = new FileWriter("Bier pattern4.txt");
            //FileWriter fileWriter55 = new FileWriter("Bier pattern5.txt");
            //FileWriter fileWriter66 = new FileWriter("Bier pattern6.txt");
            //FileWriter fileWriter77 = new FileWriter("Bier pattern7.txt");
            //FileWriter fileWriter88 = new FileWriter("Bier pattern8.txt");
            FileWriter fileWriter99 = new FileWriter("Bier pattern9.txt");


            //BufferedWriter bufferedWriter4 = new BufferedWriter(fileWriter4);
            //BufferedWriter bufferedWriter5 = new BufferedWriter(fileWriter5);
            //BufferedWriter bufferedWriter6 = new BufferedWriter(fileWriter6);
            //BufferedWriter bufferedWriter7 = new BufferedWriter(fileWriter7);
            //BufferedWriter bufferedWriter8 = new BufferedWriter(fileWriter8);
            BufferedWriter bufferedWriter9 = new BufferedWriter(fileWriter9);

            //BufferedWriter bufferedWriter44 = new BufferedWriter(fileWriter44);
            //BufferedWriter bufferedWriter55 = new BufferedWriter(fileWriter55);
            //BufferedWriter bufferedWriter66 = new BufferedWriter(fileWriter66);
            //BufferedWriter bufferedWriter77 = new BufferedWriter(fileWriter77);
            //BufferedWriter bufferedWriter88 = new BufferedWriter(fileWriter88);
            BufferedWriter bufferedWriter99 = new BufferedWriter(fileWriter99);

            /*for(int i=0; i<Constants.NUM_OF_PATTERN4; i++){
                for(int j=0; j<10; j++){
                    bufferedWriter44.write(pattern_Bier4[i][j] + " ");
                }
                bufferedWriter4.write("4 " + pattern_Bier4[i][9]);
                bufferedWriter4.newLine(); // 换行
            }*/


            /*for(int i=0; i<Constants.NUM_OF_PATTERN5; i++){
                for(int j=0; j<10; j++){
                    bufferedWriter55.write(pattern_Bier5[i][j] + " ");
                }
                bufferedWriter5.write("5 " + pattern_Bier5[i][9]);
                bufferedWriter5.newLine(); // 换行
            }*/


            /*for(int i=0; i<Constants.NUM_OF_PATTERN6; i++){
                for(int j=0; j<10; j++){
                    bufferedWriter66.write(pattern_Bier6[i][j] + " ");
                }
                bufferedWriter6.write("6 " + pattern_Bier6[i][9]);
                bufferedWriter6.newLine(); // 换行
            }*/


            /*for(int i=0; i<Constants.NUM_OF_PATTERN7; i++){
                for(int j=0; j<10; j++){
                    bufferedWriter77.write(pattern_Bier7[i][j] + " ");
                }
                bufferedWriter7.write("7 " + pattern_Bier7[i][9]);
                bufferedWriter7.newLine(); // 换行
            }*/

            /*for(int i=0; i<Constants.NUM_OF_PATTERN8; i++){
                for(int j=0; j<10; j++){
                    bufferedWriter88.write(pattern_Bier8[i][j] + " ");
                }
                bufferedWriter8.write("8 " + pattern_Bier8[i][9]);
                bufferedWriter8.newLine(); // 换行
            }*/

            for(int i=0; i<Constants.NUM_OF_PATTERN9; i++){
                for(int j=0; j<10; j++){
                    bufferedWriter99.write(pattern_Bier9[i][j] + " ");
                }
                bufferedWriter9.write("9 " + pattern_Bier9[i][9]);
                bufferedWriter9.newLine(); // 换行
            }


            //bufferedWriter4.close();
            //bufferedWriter5.close();
            //bufferedWriter6.close();
            //bufferedWriter7.close();
            //bufferedWriter8.close();
            bufferedWriter9.close();

            //bufferedWriter44.close();
            //bufferedWriter55.close();
            //bufferedWriter66.close();
            //bufferedWriter77.close();
            //bufferedWriter88.close();
            bufferedWriter99.close();

            System.out.println("Array content has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
