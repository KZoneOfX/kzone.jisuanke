package com.y2016.m3.q2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Xiaoke Zhang
 * Date: 3/18/2016
 * Time: 4:32 PM
 * To change this template use File | Settings | File Templates.
 *   判断质数
 *   http://nanti.jisuanke.com/t/3
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N<=1 || N>1000){
            System.out.println("NO");
            return;
        }
        for (int i=2;i<N;i++){
            if(N/i >1 && N%i == 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
