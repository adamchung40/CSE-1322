//Adam Chung
import java.util.Scanner;

public class Lab1AConsole {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.print("How old are you?: ");
		int age = input.nextInt();
		System.out.println("Hello "+name+". You are "+age+" years old.");
	}

}