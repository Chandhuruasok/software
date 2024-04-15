package com.arrays.list;
import java.util.*;
public class Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,n,k;
		System.out.println("Enter the n value for array size:");
		n=s.nextInt();
		if(n<0)
		{
			System.out.println("Enter the n value again:");
			n=s.nextInt();
		}
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
			
		}
		for(i=n-1;i>=0;i--)
		{
			System.out.println("array values after reverse:"+a[i]);
		
		}
		
		
	}

}
