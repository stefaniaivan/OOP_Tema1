import java.util.InputMismatchException;
import java.util.Scanner;

public class DataScanner {

	public static final int PASSWORD_LENGTH = 8;

	public static void main(String[] args) {

		String username = readUsername();
		String password = readPassword();
		String fullName = readFullName();
		int age = readAge();
		System.out.println("You have successfully entered all data.");

		User user1 = new User(username, password, fullName, age);
		System.out.println(user1.toString());
		User user2 = new User("ana", "Parola2!", "Popa Ana", 28);
		System.out.println(user1.equals(user2));
	}

	public static String readUsername() {
		String username;
		Scanner s_username = new Scanner(System.in);
		System.out.println("Enter username: ");
		username = s_username.nextLine();
		System.out.println("Username: " + username);
		return username;

	}

	public static String readPassword() {
		String password;
		Scanner s_password = new Scanner(System.in);
		System.out.println("Enter your password: ");
		password = s_password.nextLine();
		if (validPassword(password)) {
			System.out.println("Password:" + password);
			String confirmPassword;
			Scanner s_confirmPassword = new Scanner(System.in);
			System.out.println("Confirm password: ");
			confirmPassword = s_confirmPassword.nextLine();
			if (confirmPassword.equals(password)) {
				if (validPassword(confirmPassword)) {
					System.out.println("Confirmed password!");
				} else {
					System.out.println("Invalid password!");
					System.exit(0);
				}
			} else {
				System.out.println("Invalid Password!");
				System.exit(0);
			}
		} else {
			System.out.println("Invalid Password!");
			System.exit(0);
		}
		return password;
	}

	public static int readAge() {
		Scanner s_age = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = s_age.nextInt();
		try {
			if (age > 0 && age < 140) {
				System.out.println("Your age: " + age);
			} else
				throw new InputMismatchException();
		} catch (InputMismatchException ex) {
			System.out.println("Wrong age!");
			System.exit(0);
			s_age.nextInt();
			age = 5;
		}
		return age;
	}

	public static String readFullName() {
		String fullName;
		System.out.println("Enter your full name: ");
		Scanner s_fullName = new Scanner(System.in);
		fullName = s_fullName.nextLine();
		System.out.println("Full name: " + fullName);
		return fullName;
	}

	public static boolean validPassword(String password) {
		int upChars = 0;
		int special = 0;
		int digits = 0;
		char ch;
		String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		if (password.length() < PASSWORD_LENGTH) {
			return false;
		} else {
			for (int i = 0; i < password.length(); i++) {
				ch = password.charAt(i);
				if (Character.isUpperCase(ch)) {
					upChars = 1;
				}
				if (Character.isDigit(ch)) {
					digits = 1;
				}
				if (specialCharactersString.contains(Character.toString(ch))) {
					special = 1;
				}
			}
			if (upChars >= 1 && digits >= 1 && special >= 1) {
				return true;
			} else
				return false;
		}
	}
}
