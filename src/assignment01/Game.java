package assignment01;

import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		int a,b,c,temp,smallest;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1st number a=");
		a=sc.nextInt();
		System.out.println("enter 2nd number b=");
		b=sc.nextInt();
		System.out.println("enter 3rd number c=");
		c=sc.nextInt();
		
		temp=a<b?a:b;
		smallest=c<temp?c:temp;
		if(a==b && b==c) {
			System.out.println("all numbers are equal"); 
		}
		else {
				System.out.println("the smallest number is="+smallest);
			}
		

	}

}

