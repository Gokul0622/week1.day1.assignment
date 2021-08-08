package assignments;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 13;
		boolean flag = false;
		int remainder;
		for (int i = 2; i <= num / 2; i++) {
			remainder = num % i;
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)

			System.out.println(num + " is Prime Number");
		else
			System.out.println(num + " Not a Prime Number");
	}

}
