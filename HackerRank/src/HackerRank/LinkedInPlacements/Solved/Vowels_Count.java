package HackerRank.LinkedInPlacements.Solved;

import java.util.Scanner;

public class Vowels_Count {

	public static void main(String[] args) {

		//scanning the input
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int a=in.nextInt();
		int e=in.nextInt();
		int i=in.nextInt();
		int o=in.nextInt();
		int u=in.nextInt();
		//System.out.println(str+a+e+i+o+u);
		in.close();


		//variables
		int min=0;
		int[] count={a,e,i,o,u};
		int[] vowels_n = {97,101,105,111,117};
		char[] vowels_c = "aeiou".toCharArray();

		//logic
		char[] chars = str.toCharArray();

		for(int counter=0;counter<5;counter++){
			if(count[counter]>0){
				//search for vowel[counter] in str 
				//no of occurences as well
				int flag=0;
				for(int counter1=0;counter1<str.length();counter1++){
					if(str.charAt(counter1)==vowels_c[counter]){
						flag++;
					}
				}
				if(flag<count[counter]){
					//replace
					int min1=0;
					for(int counter2=0;counter2<str.length();counter2++){
						min1=999;
						if(flag==count[counter])
							break;
						else{
							if((str.charAt(counter2)=='a' && count[0]>0 )||
									(str.charAt(counter2)=='e' && count[1]>0)||
											(str.charAt(counter2)=='i' && count[2]>0)||
													(str.charAt(counter2)=='o' && count[3]>0)||
														 (str.charAt(counter2)=='u' && count[4]>0))
								continue;
							else{
								min=Math.abs((vowels_c[counter]-(int)str.charAt(counter2)));
								chars[counter2]=vowels_c[counter];
								if(min1<min){
									min=min1;
									flag++;
								}
							}
						}
						min1=min;
					}

				}
				else
					continue;
			}
		}
		//Printing desired output 
		System.out.println(min);

	}

}