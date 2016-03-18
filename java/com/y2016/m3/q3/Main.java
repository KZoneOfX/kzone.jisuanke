package com.y2016.m3.q3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Xiaoke Zhang
 * Date: 3/18/2016
 * Time: 4:37 PM
 * To change this template use File | Settings | File Templates.
 *      简单斐波那契
 *      http://nanti.jisuanke.com/t/4
 *
 *      斐波那契数列
 *      斐波那契数列是一种非常有意思的数列，由 0 和 1 开始，之后的斐波那契系数就由之前的两数相加。用数学公式定义斐波那契数列则可以看成如下形式：
 *      F0=0
 *      F1=1
 *      Fn=Fn-1+Fn-2.
 *      我们约定Fn表示斐波那契数列的第n项，你能知道斐波那契数列中的任何一项吗？
 *      输入包括一行，包括一个数字N（0≤N≤50）。
 *      输出包括一行，包括一个数字，为斐波那契数列的第N项的值。
 *      样例1
 *      输入：
 *      7
 *      输出：
 *      13
 */
public class Main {
    public static void main(String[] args){
        int f[] = new int[100];
        f[0] = 0;
        f[1] = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
            System.out.println(f[i]);
        }
        System.out.println(f[n]);
    }
}
