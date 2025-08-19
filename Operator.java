package com.div;
import java.util.Scanner;

public class Operator {
	
	public static void main(String[] args){
		int a,b,sum,sub,mul,div,rem;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a:");
		a= sc.nextInt();
		System.out.println("Enter value of b:");
		b= sc.nextInt();
		sum= a+b;
		sub= b-a;
		mul=a*b;
		div=b/a;
		rem=b%a;
		System.out.println("Sum of a&b is: "+sum+"\nSub of a&b is: "+sub+"\nMul of a&b is: "+mul+
				"\nDiv of a&b is: "+div+ "\nRem of a&b is: "+rem);
		
		double c, d,sumd,subd,muld,divd,remd;
		System.out.println("Enter value of c: ");
		c = sc.nextDouble();
		System.out.println("Enter value of d: ");
		d = sc.nextDouble();
		sumd= c+d;
		subd= c-d;
		muld=c*d;
		divd=c/d;
		remd=c%d;
		System.out.println("Sum of a&b is: "+sumd+"\nSub of a&b is: "+subd+"\nMul of a&b is: "+muld+
				"\nDiv of a&b is: "+divd+ "\nRem of a&b is: "+remd);
		
		float e, f,sumf,subf,mulf,divf,remf;
		System.out.println("Enter value of e: ");
		e = sc.nextFloat();
		System.out.println("Enter value of f: ");
		f = sc.nextFloat();
		sumf= e+f;
		subf= e-f;
		mulf=e*f;
		divf=e/f;
		remf=e%f;
		System.out.println("Sum of a&b is: "+sumf+"\nSub of a&b is: "+subf+"\nMul of a&b is: "+mulf+
				"\nDiv of a&b is: "+divf+ "\nRem of a&b is: "+remf);
		
		String str1,str2,concate;
		System.out.println("Enter value of str1:");
		str1 = sc.nextLine();
		System.out.println("Enter value of str2:");
		str2 = sc.nextLine();
		concate = str1+str2;
		System.out.println("Output is:" +concate);
		sc.close();	
	}
}
