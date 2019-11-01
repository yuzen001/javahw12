package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入正方形的邊長(整數1~50): ");
        int n;
        int i, j, k, m;
        n = sc.nextInt();
        m = n;
        if( n <= 50 ){
            for( k = 1; k <= m; k++ ){

                for( j = n; j < m; j++ ){
                    System.out.print(" ");
                }

                for( i = 1; i <= n; i++ ){
                    System.out.print("*");
                }

                System.out.print("\n");
                n--;
            }

        }

        else{
            System.out.print("此數值不再範圍內");
        }
        
    }

}
