import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a line of text:");
		String str = s.nextLine();
		System.out.println("Enter a character:");

		char ch = s.next().toLowerCase().charAt(0);

		// Check if the character is present in the string

		if (!str.toLowerCase().contains(Character.toString(ch))) {
			System.out.println("Given character is not in the string");
			return;
		}
		while (true) {
			if (ch >= 'a' && ch <= 'z') {
				switch (ch) {
				// Enter the loop only if the character is in the string
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.println("Vowel");
					break;
				default:
					System.out.println("Consonant");
					break;
				}
			} else {

				System.out.println("Given character is not an alphabet");

			}

		}

	}
}
