package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				int n = 0;
		do {
			n = scan.nextInt();
			System.out.println(Factorial(n));
		}while (n!=0);
	}
	public static long Factorial(int n )
	{
		if (n >0)
		{
			 return n*Factorial(n-1);
		}
		else 
		{	
			return 1;
		}
	}

}
