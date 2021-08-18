package com.company;

public class Main {

    public static void main(String[] args) {
	// Array - a collection of elements that is a set size
        String[] newArr = new String[5];
        // could be int instead of string, if you wanted (FYI)
       // example: {"hello", "hi", "tim", "bill", "joe"}
        // computers start counting at zero, so "hello" is in position zero, and "joe" is in position 4

        newArr[0] = "hello";
        newArr[1] = "hi";
        newArr[2] = "tim";
        newArr[3] = "bill";
        newArr[4] = "joe";

        int[] nums = {2,3,54,6,6};
        int x = nums[4];
        System.out.println(x);
        // this gives us 6 (the number in position 4)


        double [] nums2 = {2.0, 3.0};
        double y = nums2[0];
        System.out.println(y);
        // this gives us 2.0 (the number in position 0)


    }
}
