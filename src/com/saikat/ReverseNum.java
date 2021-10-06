package com.saikat;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        int ans = RevNum(n,p);
        System.out.print("Product of digits is : "+ans);
    }
    static int RevNum(int n, int rev){
        if (n<1)
            return rev;
        rev=10*rev+n%10;
        return RevNum(n/10,rev);
    }
}
