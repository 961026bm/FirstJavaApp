package com.careerdevs;

public class Main {

    public static void main(String[] args) {
//    getFirstValue
        System.out.println(getFirstValue(new int[]{1, 3, 5, 7, 9}));
        System.out.println(addition(123));
        System.out.println(giveMeSomething("career-devs"));
        System.out.println(search(new int[]{1, 3, 5, 7, 9}, 11));
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
//    function giveMeSomething(a) {
//        return "something " + a;
//
//    }
/*    public is access modifier , it controls the level of access have
    for the modifier
     method signature .google it
      static allows the use of methods and fields without creating a new instance java, it also creates a reference to call  */

//    version 2
    public static String giveMeSomething2(String a) {
        String str1 = "Hello";
        String str2 = "Space World";

        System.out.println(str1.concat(str2) );
        System.out.println("hello".concat(str2) );
        System.out.println(String.join( " ","something",a));
        return "something " + a;
    }

    //    version 1
    public static String giveMeSomething(String a) {
        return "something " + a;
    }
//
public static int search(int arr[], int item) {
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] == item) {
            index = i;
            i += arr.length;
        }
    }
    return index;
}

}