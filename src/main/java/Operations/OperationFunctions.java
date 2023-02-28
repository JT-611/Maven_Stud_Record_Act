package Operations;
import DB.Student;

// business interface
public interface OperationFunctions 
{
	//business operations 
	void add(Student s);
	void delete(int rollno);
	void update(int ct,String em,int rollno);
	void searchRollNo(int rollno);
	void searchName(String name);
	void searchCity(String city);
	void searchStandard(int st);
	void display();
	
}
