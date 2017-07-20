import java.util.Scanner;

public class TestReverseAPI {
	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}

	public static void main(String[] args) {
		ReverseAPI revInteger = new IntegerSequence();
		ReverseAPI revChar = new CharSequence();

		while (true) {
			System.out.println("\nOptions:");
			System.out.println("1- Reverse");
			System.out.println("2- Reverse by middle");
			System.out.println("3- Exit");
			System.out.println("Your decision:");
			Scanner input = new Scanner(System.in);
			int decision = input.nextInt();

			switch (decision) {
			case 1:
				System.out.println("Insert the number/string: ");
				Scanner input1 = new Scanner(System.in);
				String s = input1.nextLine();
				if (isNumeric(s)) {
					System.out.println("Number.");
					System.out.println(revInteger.reverse(Long.parseLong(s)));
				} else {
					System.out.println("String.");
					System.out.println(revChar.reverse(s));
				}
				break;

			case 2:
				System.out.println("Insert the number/string: ");
				Scanner input2 = new Scanner(System.in);
				String s2 = input2.nextLine();
				if (isNumeric(s2)) {
					System.out.println("Number.");
					System.out.println(revInteger.reverseByMiddle(Integer.parseInt(s2)));
				} else {
					System.out.println("String.");
					System.out.println(revChar.reverseByMiddle(s2));
				}
				break;
			case 3:
				System.out.println("Bye bye!");
				System.exit(0);

			}
		}
	}
}
