package Templates;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Template_HackerRankBasics {

    public static void main(String[] args) {
        
//scanning the input    	
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //String str = in.nextLine();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
                      
        }
        for(int a_i=0; a_i < n; a_i++){
            System.out.println(a[a_i]);
                      
        }
    in.close();
    
    
  //logic
  //variables
  		int min=0;
  		
  		
  		
  //Printing desired output 
  		System.out.println(min);


    }
}



