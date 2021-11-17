package com.saikat.backtracking;

public class FindPaths {
    public static void main(String[] args) {
        int row = 3,column = 3;
        System.out.println(findNumberOfPath(row,column));
    }
   public static int findNumberOfPath(int row, int col)
    {
        if(row == 1 || col == 1)
        {
            return 1;
        }
        int left = findNumberOfPath(row-1,col);
        int right = findNumberOfPath(row,col-1);
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