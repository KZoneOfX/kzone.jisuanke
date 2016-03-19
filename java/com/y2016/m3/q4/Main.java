package com.y2016.m3.q4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Xiaoke Zhang
 * Date: 3/18/2016
 * Time: 5:18 PM
 *
 *   矩阵翻转
 *   http://nanti.jisuanke.com/t/5
 *
 *   晓萌最近在做一个翻转图片的应用，你可能也知道，图片其实是由一个个的点组成的。于是，晓萌想先做一个可以翻转矩阵的程序，来解决他问题的核心部分。
 *   输入第一行包括由空格分开的整数M、N、T（0 < M < 200，0 < N < 200，T=0或1），其中M和N分别表示待处理矩阵的行数与列数，T为0时表示左右翻转，为1时表示上下翻转。
 *   之后的M行，每行包括由空格分隔的N个整数，依次为输入矩阵的每一行的数据。
 *   输出包括M行N列，每个数字之间用一个空格分隔，每一行行末均有一个空格，表示的是按照要求翻转后的矩阵。
 *   样例1
 *
 *   输入：
 *   4 4 1
 *   1 2 3 4
 *   5 6 7 8
 *   9 0 1 2
 *   3 4 5 6
 *
 *   输出：
 *   3 4 5 6
 *   9 0 1 2
 *   5 6 7 8
 *   1 2 3 4
 *
 */
public class Main {
    public Main() {
    }

    public static void main(String[] ages){
        Scanner scanner = new Scanner(System.in);
        int m,n,t;
        m = scanner.nextInt();
        n = scanner.nextInt();
        t = scanner.nextInt();

        int matrix[][] = new int[m][n];
        int result[][];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        Main main = new Main();
        result = main.overTurnMatrix(matrix,m,n,t);
        main.printMatrix(result,m,n);


    }

    /**
     * 打印矩阵
     * @param matrix
     * @param m
     * @param n
     */
    public void printMatrix(int matrix[][],int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    /**
     * 矩阵倒置
     * @param matrix
     * @param m
     * @param n
     * @param t
     * @return
     */
    public int[][] overTurnMatrix(int matrix[][],int m,int n,int t){
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = t==0 ? matrix[i][n-1-j]:matrix[m-1-i][j];
            }
        }
        return result;
    }

}
