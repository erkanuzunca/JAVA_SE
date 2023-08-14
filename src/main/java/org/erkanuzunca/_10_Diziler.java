package org.erkanuzunca;

import java.util.Arrays;

public class _10_Diziler {

    public static void main(String[] args) {
        int [] dizi= new int [6];
        dizi[0]=1;
        dizi[1]=2;
        dizi[2]=3;
        dizi[4]=5;
        dizi[5]=6;

        Arrays.sort(dizi);
        // System.out.println(dizi[0]);
        System.out.println("\n**************");

        for (int i=0;i<dizi.length;i++){
            System.out.print(dizi[i]+" ");
        }
        System.out.println("\n**************");

        int [][] matrix=new int [4][4];
        matrix[3][3]=33;

        for (int i =0;i<matrix.length;i++)
        {
            for (int k=0;k<matrix[i].length;k++){
                System.out.print(matrix[i][k]+" ");
            }
            System.out.println("");
        }


    }

}
