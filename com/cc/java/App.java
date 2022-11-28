package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Child child = new Child();
        output(child.sayHello());
        output(child.sayHello(""));

        Parent parent = new Parent();
        output(parent.sayHello());
        output(parent.sayHello(""));
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

