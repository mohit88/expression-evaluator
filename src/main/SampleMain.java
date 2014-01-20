package main;

import lib.SampleMethod;

public class SampleMain {
    public static void main(String[] args) {
        Boolean check = new SampleMethod().isItWorking(args[0]);
        System.out.println(check);
    }
}
