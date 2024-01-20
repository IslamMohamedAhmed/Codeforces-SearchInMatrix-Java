/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.searchinmatrix;

import java.util.Scanner;

/**
 *
 * @author Islam Mohamed
 */
public class SearchInMatrix {

    public static void main(String[] args) {
        int N, M;
        
        int X, isHere = 0;
        Scanner scan = new Scanner(System.in);
        N = scan.nextByte();
        M = scan.nextByte();
        int [][]A = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        X = scan.nextShort();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                 if(A[i][j] == X){
                     isHere++;
                     break;
                 }
            }
            if(isHere>0){
                break;
            }
        }
        if(isHere>0){
            System.out.println("will not take number");
        }
        else{
            System.out.println("will take number");
        }

    }
}
