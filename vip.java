import java.io.File;
import java.io.FileNotFoundException;
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

		File passwordFile = new File("SecretPasswordFile.txt");
		String secretPassword = "";
		if (passwordFile.exists() && passwordFile.isFile())
		{
			try 
			{
				Scanner scanPass = new Scanner(passwordFile); 
				while (scanPass.hasNextLine()) // Cycle through all lines and add them to output with a line break
				{
					String passLine = scanPass.nextLine();
					secretPassword += passLine;
				}
				scanPass.close(); // Close the scanner
			}
			catch (FileNotFoundException e) // Catch proper exception if file isn't found and print message
			{
				System.out.println("File not found. The file has likely been moved or deleted since the book was created.");	
				System.exit(1);
			}
		}
		System.out.println("Enter your password.");
		Scanner typedPassword = new Scanner(System.in);
		if(typedPassword == secretPassword)
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