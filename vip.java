import java.util.Scanner;

public class VIP
{

	public static void main(String[] args) { 
		System.out.println("Hey guys ");
    		System.out.println("What is your name?");
   		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("Hello " + name);

		String string = new String("This is a string");
		String easier = "Wow, that was easy!";
		System.out.println(easier);

		passwordFile = open("SecretPasswordFile.txt")
		secretPassword = passwordFile.read()
		print('Enter your password.')
		typedPassword = input()
		if typedPassword == secretPassword:
		{
			print('Access Granted')
		}
		else if typedPassword == '12345'
		{
			print("That password is one that an idiot puts on their luggage.")
		}
		else
		{
			print("Access Denied");
		}
}