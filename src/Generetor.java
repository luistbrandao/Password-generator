import java.util.Random;
import java.util.Scanner;

public class Generetor {

	public static void main(String[] args) {
		int nextLine;
		do {
			System.out.println("How many characters your password will be? ");
			int value;
			Scanner scanner = new Scanner(System.in);
			value = scanner.nextInt();
			String generate = generatePassword(value);
			System.out.println(generate);
			System.out.println("DDo you like to run it again? 1-yes/2-no");
			nextLine = scanner.nextInt();
		} while (nextLine == 1);
		System.out.println("The End :)");
	}

	public static String generatePassword(int length) {
		String[] charSequences = new String[] { "abcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				"0123456789", "!@#$%ˆ&*()_-+={}[]?/<>" };
		StringBuilder password = new StringBuilder(length);
		Random random = new Random(System.nanoTime());

		for (int i = 0; i < length; i++) {
			String charSequence= charSequences[random.nextInt(charSequences.length)];
			int position = random.nextInt(charSequence.length());
			password.append(charSequence.charAt(position));
		}

		return new String(password);
	}
}
