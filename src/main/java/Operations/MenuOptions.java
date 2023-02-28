package Operations;

import java.util.Scanner;

public class MenuOptions 
{
	int mainmenu()
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.printf("%45s\n","Main Menu");
		System.out.printf("%-30s\n","1 : Add");
		System.out.printf("%-30s\n","2 : Search");
		System.out.printf("%-30s\n","3 : Update");
		System.out.printf("%-30s\n","4 : Delete");
		System.out.printf("%-30s\n","5 : Display");
		System.out.printf("%-30s\n","6 : Exit");
		System.out.println("Enter ur Choice : ");
		ch = sc.nextInt();
		return ch;
	}
	
	int searchmenu()
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.printf("%45s\n","Search Menu");
		System.out.printf("%-20s\n","1: By RollNo");
		System.out.printf("%-30s\n","2: By Name");
		System.out.printf("%-30s\n","3: By City");
		System.out.printf("%-30s\n","4: By Standard");		
		System.out.printf("%-30s\n","6: Exit");
		System.out.println("Enter your choice : ");
		ch = sc.nextInt();
		return ch;
	}

}
