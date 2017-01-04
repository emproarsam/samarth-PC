package Solved;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        boolean flag=true;
        int t = in.nextInt();
        //String[] str=new String[t];
        String str=null;
        char[] ascii={'[',']','{','}','(',')'};
        for(int i=0;i<ascii.length;i++)
        	System.out.println((int)ascii[i]+" ");
        
        for(int a0 = 0; a0 < t; a0++){
            str = in.next();
           // char[] strArr=str.toCharArray();
            for(int a1 = 0; a1 < str.length()/2; a1++){
                
                //if(((new Character(str[a0].charAt(a1))).compareTo(new Character(str[a0].charAt(str[a0].length()-a1-1))))==0){
                if(str.charAt(a1)==str.charAt(str.length()-a1-1)){
                //if(strArr[a1]==strArr[strArr.length-a1-1]){
                  
                	flag=flag && true;
                    System.out.println("inside t "+flag+" for "+str.charAt(a1)+" and "+str.charAt(str.length()-a1-1));
                }
                else{
                    flag=flag && false;
                    System.out.println("inside f "+flag+" for "+str.charAt(a1)+" and " + str.charAt(str.length()-a1-1));
                }
            }
            if(flag==true)
                System.out.println("YES");
            else
                System.out.println("NO");
            }
         
        in.close();
        }
    }

