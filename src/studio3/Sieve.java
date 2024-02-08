package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Up to what number would you like to find prime numbers?: ");
		int n = in.nextInt();
		boolean[] prime = new boolean[n+1];

		for (int i = 2; i < prime.length; i++) {
			prime[i] = true;
		}
		for(int i = 2; i < prime.length; i++ ) {
			for (int j = i + i; j < prime.length; j += i) {
				prime[j] = false;
			}
		}
		for (int i = 2; i < prime.length; i++)  {	
			if (prime[i] == true) {
				System.out.println(i);
			}
		}	
	}

}
