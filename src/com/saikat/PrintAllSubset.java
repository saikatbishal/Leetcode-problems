package com.saikat;

import java.util.ArrayList;

public class PrintAllSubset {
    public static void main(String[] args) {
        String s = "abcd";
        ArrayList<String> arr =  printSubset("",s);
        for (String value : arr) {
            System.out.print(value+" ");
        }
        System.out.println("\n"+arr);
        }
    static ArrayList<String> printSubset(String proc, String unproc)
    {
        if(unproc.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }
        char ch = unproc.charAt(0);

        ArrayList<String> left = printSubset(proc+ch,unproc.substring(1));
        ArrayList<String> right = printSubset(proc,unproc.substring(1));
        left.addAll(right);
        return left;
    }
}
