package Operations;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import DB.Records;
import DB.Student;

public class Transactions 
{
	Student st;
	
	void enterRecord()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll No : ");
		int r = sc.nextInt();
		
		System.out.println("Enter Name : ");
		String nm = sc.next();
		
		System.out.println("Enter Contact No : ");	
		int ph = sc.nextInt();
		
		System.out.println("Enter City : ");
		String ct = sc.next();
		
		System.out.println("Enter  Email : ");
		String em = sc.next();
		
		System.out.println("Enter Standard : ");
		int sd = sc.nextInt();
		
		st = new Student(r,nm,ph,ct,em,sd);
		Logics L = new Logics();
		L.add(st);
	}
	public static void main(String...strings)
	{
		int option1;
		Scanner sc = new Scanner(System.in);
		Transactions obj = new Transactions();
		
		String choice = "";
		while(!(choice.equals("N") || (choice.equals("n"))))
		{
			

			MenuOptions mu = new MenuOptions();
			option1 = mu.mainmenu();
			
			switch(option1)
			{
				case 1 : 
						  obj.enterRecord();
						  break;
				case 2 :
						  int op = mu.searchmenu();
						  Student s;
						  switch(op)
						  {
						  case 1 : 
							  System.out.println("Enter the roll no to search : ");
							  int rn = sc.nextInt();
							  s = Records.AL.stream().filter(m -> m.getRollNo() == rn).collect(Collectors.toList()).get(0);
							  System.out.println(s);
							  break;
							
						  case 2 : 
							  System.out.println("Enter the name to search : ");
							  String nm = sc.next();
							  s = Records.AL.stream().filter(m -> m.getName().equals(nm)).collect(Collectors.toList()).get(0);
							  System.out.println(s);
							  break;
							  
						  case 3 : 
							  System.out.println("Enter the city to search : ");
							  String city = sc.next();
							  List<Student> L1 = Records.AL.stream().filter(m -> m.getCity().equals(city)).collect(Collectors.toList());
							  L1.forEach(m -> {System.out.println(m);});
							  break;
							  
						  case 4 : 
							  System.out.println("Enter the standard to search : ");
							  int std = sc.nextInt();
							  List<Student> L2 = Records.AL.stream().filter(m -> m.getStandard() == std).collect(Collectors.toList());
							  L2.forEach(m -> {System.out.println(m);});
							  break;
						  }
						  break;
				case 3 :
						System.out.println("Enter the roll no to search and update : ");
						int rn = sc.nextInt();
							
						s=Records.AL.stream().filter(m->m.getRollNo() == rn).collect(Collectors.toList()).get(0);
						int index = Records.AL.indexOf(s);
							
						System.out.println("Enter new contact number : ");
						int con = sc.nextInt();
							
						Records.AL.get(index).setContactNo(con);
						System.out.println("New context number is updated ! ");
						
					break;
					
				case 4 : 
						System.out.println("Enter the roll no to search and delete : ");
						int rno = sc.nextInt();
							
						s=Records.AL.stream().filter(m->m.getRollNo() == rno).collect(Collectors.toList()).get(0);
						int in= Records.AL.indexOf(s);
						
						Records.AL.remove(in);
						System.out.println("Record deleted successfully !");
					break;
					
				case 5 : 
					  	  Logics ob = new Logics();
					  	  ob.display();
					  	  break;
				case 6 : 
					     System.out.println("\n Exit Successfully.");
					     System.exit(0);
			    default:
				    	System.out.println("Invalid choice");
				    	break;
			}
			System.out.println("\n Do u want to continue : ");
			choice = sc.next();
		} //while end
		
	}
}
