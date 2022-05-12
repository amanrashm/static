package com.aman;

public class StaticBlock {
    static{
        System.out.println("static block1");
    }
    static{
        System.out.println("static block 2");
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("main method");
    }
}
