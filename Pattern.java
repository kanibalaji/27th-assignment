package org.patternreverse;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     
     int n;
     n=sc.nextInt();
     for(int i=n;i>0;i--)
     {
    	 for(int j=i;j>=1;j--)
    	 {
    		 System.out.print(j+"");
    		 
    	 }
    	 System.out.println();
    	 
     }
     
	}

}
