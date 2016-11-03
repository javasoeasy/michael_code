package com.china.hello;

/**
 * Created by xingzhe on 2016/11/2.
 */
public class Helllo implements W3C{
    public static void main(String[]args){
        Computer computer = new Computer(1,"戴尔",255.25D);
        computer.setBrand("联想");
        System.out.println(computer);
    }
}