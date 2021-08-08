package assignments;

public class Fibonacci_Series {

	public static void main(String[] args) {

		int range = 8, firstNum = 0, secNum = 1, Sum;

		System.out.println(" Value of First Number " + firstNum);

		for (int i = 1; i <= range; i++) {
			Sum = firstNum + secNum;
			firstNum = secNum;
			secNum = Sum;
			System.out.print( Sum + "," );

		}

	}

}
