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
		if (passwordFile.exists() && passwordFile.isFile())
		{
			try 
			{
				Scanner scanBook = new Scanner(bookFile); 
				while (scanBook.hasNextLine()) // Cycle through all lines and add them to output with a line break
				{
					String bookLine = scanBook.nextLine();
					output += bookLine + "\n";
				}
				scanBook.close(); // Close the scanner
			}
			catch (FileNotFoundException e) // Catch proper exception if file isn't found and print message
			{
				output = "File not found. The file has likely been moved or deleted since the book was created.";																															
			}
		}
		System.out.println("Enter your password.");
		typedPassword = input();
		if typedPassword == secretPassword
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