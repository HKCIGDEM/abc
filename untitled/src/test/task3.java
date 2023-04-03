package test;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {

        int[] inrArr = { 15, 30, 45,60,75};
        inrArr[2] = inrArr[4];
        inrArr[4] = 90;

        System.out.println(Arrays.toString(inrArr));
    }
}
