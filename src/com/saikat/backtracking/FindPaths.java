package com.saikat.backtracking;

public class FindPaths {
    public static void main(String[] args) {
        int row = 3,column = 3;
        System.out.println(findNumberofPath(row,column));
    }
    static int findNumberofPath(int row, int col)
    {
        if(row == 1 || col == 1)
        {
            return 1;
        }
        int left = findNumberofPath(row-1,col);
        int right = findNumberofPath(row,col-1);
        return left + right;
    }
}
/*

* ddrr
* drdr
* drrd
* rddr
* rdrd
* rrdd

*/