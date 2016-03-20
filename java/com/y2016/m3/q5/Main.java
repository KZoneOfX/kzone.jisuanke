package com.y2016.m3.q5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Xiaoke Zhang
 * Date: 3/19/2016
 * Time: 6:15 PM
 *
 * 泥塑课
 * http://nanti.jisuanke.com/t/6
 * 小米是一个幼儿园老师，每学期的泥塑课上，她都会给每个学生发不超过250立方厘米的等量橡皮泥，教大家做泥塑。
 * 在上课过程中，她发现每个班都恰好有一个小朋友会去抢另一个小朋友的橡皮泥，于是她决定，在正式开始做泥塑前，
 * 让大家把手里的橡皮泥都捏成一个立方体，并且测量手里捏好的橡皮泥的长、宽和高。这样，她就可以知道谁被谁抢了橡皮泥了。
 *
 * 小米老师在不同的学期可能会带一个班或者同时带多个班，因此输入数据可能有一组或者多组。每组输入数据的第一行为一个整数n，
 * 表示了这个班的小朋友数，之后n行每行包括了由空格分隔的三个整数和一个字符串，那个字符串表示了小朋友的名字，
 * 前面三个整数则是这个学生手里橡皮泥块的长、宽、高数据。按照幼儿园的规定，每个班最多有9个小朋友，最少也要有2个小朋友，
 * 每个小朋友在学籍系统中的名称不超过8个字符长。当出现一个班级的小朋友数为-1时，表示没有更多的班级了。
 * 输出行数与小米老师带的班级数相同，形式为“X took clay from Y.”，具体请参考样例输出。
 *
 * 样例1
 * 输入：
 3
 10 10 2 Jill
 5 3 10 Will
 5 5 10 Bill

 4
 2 4 10 Cam
 4 3 7 Sam
 8 11 1 Graham
 6 2 7 Pam
 -1
 * 输出：
 Bill took clay from Will.
 Graham took clay from Cam.
 *
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ArrayList<String> result = new ArrayList<>();
        int avg_cubic,sum_cubic;
        while (number != -1){
            sum_cubic=0;
            ArrayList<Student> students = new ArrayList<>();
            for (int i = 0; i < number; i++) {
                students.add(new Student(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.next()));
                sum_cubic += students.get(i).cubic;
            }
            avg_cubic = sum_cubic / students.size();
            StringBuilder stringBuffer = new StringBuilder(" took clay from ");
            for (Student student: students){
                if (student.cubic != avg_cubic) {
                    if (student.cubic > avg_cubic){
                        stringBuffer.insert(0,student.name);
                    } else {
                        stringBuffer.append(student.name);
                    }
                }
            }
            stringBuffer.append(".");
            result.add(stringBuffer.toString());
            number = scanner.nextInt();
        }
        result.forEach(System.out::println);
//        result.forEach 相当于 下边操作】
//        for (String string :result){
//            System.out.println(string);
//        }
    }
}
class Student{
    String name;

    int length;

    int width;

    int height;

    int cubic;

    public Student( int length, int width, int height,String name) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.cubic = length*width*height;
    }
}
