package com.careerdevs;

public class Main {

    public static void main(String[] args) {
//    getFirstValue
        System.out.println(getFirstValue(new int[]{1, 3, 5, 7, 9}));
        System.out.println(addition(123));
    }
    // getFirstValue
    public static int getFirstValue(int[] arr) {
        return arr[0];
    }
    //    return next number in java
    public static int addition(int num) {
		int nextNum = num + 1;
        return nextNum;
    }
}

