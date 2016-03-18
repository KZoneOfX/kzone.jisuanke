package com.y2016.m3.q1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Xiaoke Zhang
 * Date: 3/18/2016
 * Time: 4:31 PM
 * To change this template use File | Settings | File Templates.
 *
 * 整除问题
 * http://nanti.jisuanke.com/t/2
 *
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        if (M >=1 && M <=500 && N >=1 && N <=500 && M/N >= 1 && M%N == 0){
            System.out.println("YES\n");
        } else{
            System.out.println("NO\n");
        }
    }
}
