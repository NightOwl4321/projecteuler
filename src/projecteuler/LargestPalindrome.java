package projecteuler;

public class LargestPalindrome {
	public static void main(String[] args) {
		LargestPalindrome lp = new LargestPalindrome();
		int leBigPal = 0;
		for (int i = 100; i < 1000; i++) {
			for (int k = 100; k < 1000; k++) {
				if (lp.checkIfPal(Integer.toString(i * k))) {
					if(leBigPal < i * k) {
						leBigPal = i * k;
					}
				}
			}
		}
		System.out.println(leBigPal);

	}

	private boolean checkIfPal(String line) {
		int matches = 0;
		for (int j = 0; j < line.length() / 2; j++) {
			String start = line.substring(j, j + 1);
			if (start.equalsIgnoreCase(line.substring(line.length() - 1 - j, line.length() - j))) {
				matches++;
			}
		}
		if (matches == line.length() / 2) {
			return true;
		}
		return false;
	}
}
//906609
