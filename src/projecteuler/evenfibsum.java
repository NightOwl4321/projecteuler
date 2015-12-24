package projecteuler;


public class evenfibsum {
	public static void main(String[] args) {
		int pastSum = 1;
		int currentSum = 0;
		int pastpastSum = 0;
		
		int evenFibSum = 0;
		
		while(currentSum < 4000000) {
			currentSum = pastSum + pastpastSum;
			pastpastSum = pastSum;
			pastSum = currentSum;
			if(currentSum%2==0) {
				evenFibSum+=currentSum;
			}
		}
		
		System.out.println(evenFibSum);
	}
}
//4613732