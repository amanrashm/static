package com.aman;
public class StaticClass {
    static String name = "abc";
    static void display ()
    {
        System.out.println("hi");

    }
    public static void main(String[] args) {
            StaticClass.display();
            display();
        }
    }