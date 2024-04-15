package com.arrays.list;
import java.util.*;
public class Sort {

	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  int n,i,j,temp;
	  System.out.println("Enter n value:");
	  n=s.nextInt();
	  if(n<0)
	  {
		  System.out.println("enter the n value again:");
		  n=s.nextInt();
	  }
	  int []a=new int[n];
	  for(i=0;i<n;i++)
	  {
		  a[i]=s.nextInt();
	  }
	  for(i=0;i<n;i++)
	  {
		  for(j=i+1;j<n;j++)
		  {
			  if(a[i]>a[j]) //ascending sort
			  {
				  temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
			  }
		  }
	  }
	  for(i=0;i<n;i++)
	  {
		  System.out.print(a[i]+" ");
	  }
	  
	  

	}

}
