package com.saikat.backtracking;

import java.util.ArrayList;

public class FindPaths {
    public static void main(String[] args) {
        int row = 3,column = 3;
        System.out.println(findNumberOfPath(row,column));
        //path("",row,column);
        System.out.println();
        ArrayList<String> ls = pathRet("",row, column);
        System.out.println(ls);
        ArrayList<String> ls1 = pathRetDiagonal("",row, column);
        System.out.println(ls1);
    }
   public static int findNumberOfPath(int row, int col)
    {
        if(row == 1 || col == 1)
        {
            return 1;
        }
        int down = findNumberOfPath(row-1,col);
        int right = findNumberOfPath(row,col-1);
        return down + right;
    }

    static void path(String p, int r, int c)
    {
        if(r==1 && c == 1)
        {
            System.out.print(p+", ");
            return;
        }
        if(r > 1)
            path(p+"D",r-1,c);
        if (c>1)
            path(p+'R',r,c-1);
    }
    static ArrayList<String> pathRet(String p, int r, int c)
    {
        if(r == 1 && c == 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1)
            list.addAll(pathRet(p+'D',r-1,c));
        if(c>1)
            list.addAll(pathRet(p+"R",r,c-1));
        return list;
    }
    static ArrayList<String> pathRetDiagonal(String p, int r, int c)
    {
        if(r == 1 && c == 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1)
            list.addAll(pathRetDiagonal(p+'V',r-1,c));
        if(c>1)
            list.addAll(pathRetDiagonal(p+"H",r,c-1));
        if(r>1 && c>1)
        {
            list.addAll(pathRetDiagonal(p+"D",r-1,c-1));
        }
        return list;
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