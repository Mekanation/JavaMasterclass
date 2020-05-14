package com.Mekanation;

public class Main {

    public static void main(String[] args) {
        //Java Challenge.
        //        Create a byte variable and set it to any valid byte number. Create a short variable and set it to any valid short number.
        //        Create an int and set it to any valid int. Then set a long and make it equal to 50000 plus 10 times the sum of the byte plus the short plus the integer values.
        byte bite = 2;
        short smally = 5;
        int mathy = 20;
        long longest = 50000 + (10*(bite + smally + mathy));
        System.out.println(longest);
    }
}
