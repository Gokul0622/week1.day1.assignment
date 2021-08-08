package assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int Num =153, calculated = 0, remainder, original;
		original = Num;
		while(original !=0) {
			remainder = original % 10;
			calculated = calculated + remainder*remainder*remainder;
			original /=10;
		}
		if(calculated ==Num)
			System.out.println(Num + " Armstrong Number");
		else
			System.out.println(Num + "Not an Arm Strong");
			
			
		}
		
	}


 