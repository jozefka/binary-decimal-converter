import java.util.Scanner;

public class converter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to convert from binary or decimal (type 'binary' or 'decimal')?");
		String binaryOrDecimal = input.nextLine();
		
		// Converts from binary to decimal
		if (binaryOrDecimal.equals("binary")) {
			System.out.println("Enter a binary number:");
			Scanner input1 = new Scanner(System.in);
			String binaryNumber = input1.nextLine();
			int binarySolution = Integer.parseInt(binaryNumber, 2);
			System.out.println("Answer: " + binarySolution);
		}
		else if (binaryOrDecimal.equals("decimal")) {
			System.out.println("Enter a decimal number:");
			Scanner input2 = new Scanner(System.in);
			String decimalNumber = input2.nextLine();
			int decimalSolution = Integer.parseInt(Integer.toBinaryString(Integer.parseInt(decimalNumber)));
			System.out.println("Answer: " + decimalSolution);
			
		}
		else {
			System.out.println("Error.");
		}
	}

}
