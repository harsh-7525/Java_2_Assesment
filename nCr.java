package Assesment2;

import java.util.*;

public class nCr {
	
	static int factorial(int n)
	{
		int res = 1;
		for (int i = 2; i <= n; i++)
			res = res * i;
		return res;
	}

	static int nCr(int n, int r)
	{
		return factorial(n) / (factorial(r) *
				factorial(n - r));
	}

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int r = sc.nextInt();
		//int n = 5;
	    //int r = 3;
		System.out.println(nCr(n, r));
	}

}
