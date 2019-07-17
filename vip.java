import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VIP
{

	public static void main(String[] args)
	{
		System.ou.println("Hey guys ");
		System.out.println("What is your name?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		System.out.println("Hello " + name);
		
		String easier = "Wow, that was easy!";
		System.out.println(easier);

		File passwordFile = new File("SecretPasswordFile.txt");
		String secretPassword = "";
		if (passwordFile.exists() && passwordFile.isFile())
		{
			try
			{
				Scanner scanPass = new Scanner(passwordFile);
				while (scanPass.hasNextLine())
				{
					String passLine = scanPass.nextLine();
					secretPassword += passLine;
				}
				scanPass.close();
			}
			catch (FileNotFoundException e)
			{
				System.out.println("File not found.");
				System.exit(1);
			}
		}
		else
		{
			System.out.println("File not found.");
			System.exit(1);
		}
		System.out.println("Enter your password.");
		Scanner typedPassword = new Scanner(System.in);
		String password = typedPassword.nextLine();
		if (password.equals(secretPassword))
		{
			System.out.println("Access Granted");
		}
		else if (password.equals("12345"))
		{
			System.out.println("That password is one that an idiot puts on their luggage.");
		}
		else
		{
			System.out.println("Access Denied");
		}
		typedPassword.close();
		scanner.close();
	}
}
