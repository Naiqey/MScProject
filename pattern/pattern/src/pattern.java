public class pattern {




    public static void main(String[] args){

        int n = 4;
        int i, j = 0;
        int count = 0;
        int n0, n1, n2, n3, n4, n5, n6, n7, n8 = 0;

        int flag = 0;
        int flag2 = 1;
        int flag4 = 1;
        int flag6 = 1;
        int flag8 = 1;
        int flag5 = 1;

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

                                            for(i=0; i<9; i++){
                                                check[i] = 0;
                                            }

                                            check[n0]=1;
                                            check[n1]=1;
                                            check[n2]=1;
                                            check[n3]=1;
                                            check[n4]=1;
                                            check[n5]=1;
                                            check[n6]=1;
                                            check[n7]=1;
                                            check[n8]=1;

                                            int sum = check[0]+check[1]+check[2]+check[3]+check[4]+check[5]+check[6]+check[7]+check[8]+check[9];

                                            if(9!=sum){
                                                continue;
                                            }

                                            flag = 0;
                                            flag2 = 1;
                                            flag4 = 1;
                                            flag5 = 1;
                                            flag6 = 1;
                                            flag8 = 1;

                                            /*combinations[count][0] = n0;
                                            combinations[count][1] = n1;
                                            combinations[count][2] = n2;
                                            combinations[count][3] = n3;
                                            combinations[count][4] = n4;
                                            combinations[count][5] = n5;
                                            combinations[count][6] = n6;
                                            combinations[count][7] = n7;
                                            combinations[count][8] = n8;*/
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
        System.out.println(count);
    }


}

