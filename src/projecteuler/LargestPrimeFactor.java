package projecteuler;

public class LargestPrimeFactor {
	public static void main(String[] args) {
		LargestPrimeFactor lpf = new LargestPrimeFactor();
		
		long largestPrime = 0;
		for (long j = 0; j < 600851475143l; j++) {
			if(lpf.checkIfPrime(j)) {
				if(600851475143l%j==0) {
					largestPrime = j;
					System.out.println(largestPrime);
				}
			}
		}
		System.out.println(largestPrime); // this line doesn't run?

	}

	public static boolean checkIfPrime(long n) {
		if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2) { //odds
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
//6857
