package com.huawei.niuke;
/*
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
 * 如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 */
import java.util.Scanner;

public class Qujinsizhi {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	float f=sc.nextFloat();
    	System.out.println(Math.round(f));
    	

    }
 
}