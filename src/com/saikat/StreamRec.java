package com.saikat;

public class StreamRec {
    public static void main(String[] args) {
        //System.out.println();
        System.out.println(skipAppnotApple("saikat apple bishal",""));
        System.out.println(skipAppnotApple("saikat applic bishal",""));
    }
    static void skip(String p, String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        if (up.charAt(0)== 'a') {
            skip(p,up.substring(1));
        }
        else
        {
            skip(p+up.charAt(0),up.substring(1));
        }
    }
    /*static String skip(String up)
    {
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a')
        {
            return skip(up.substring(1));
        }
        else
            return ch+skip(up.substring(1));
    }*/
    static String skipApple(String up,String p){
        if(up.isEmpty())
            return p;
        if(up.startsWith("apple"))
        {
           return skipApple(up.substring(5),p);
        }
        else{
           return skipApple(up.substring(1),p+up.charAt(0));
        }
    }
    static String skipAppnotApple(String up,String p){
        if(up.isEmpty())
            return p;
        if(up.startsWith("app") && !up.startsWith("apple"))
        {
            return skipAppnotApple(up.substring(3),p);
        }
        else{
            return skipAppnotApple(up.substring(1),p+up.charAt(0));
        }
    }
}
