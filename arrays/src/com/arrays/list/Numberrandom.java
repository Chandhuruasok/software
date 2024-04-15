package com.arrays.list;
import java.util.*;
public class Numberrandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		int a=s.nextInt();
		int b=s.nextInt();
		int c=b-a+1;
		double d=Math.random()*c+a;
		System.out.println(d);

	}

}
