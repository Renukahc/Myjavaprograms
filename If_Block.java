package Assignment1;

public class If_Block {
	public static void main(String[] args) {
		int salary=20000;
		char grade='A';
		//boolean = answer;
		
		if(salary>=21000)
		{
			System.out.println(salary);
		}
		else if(grade=='A')
		{
			System.out.println(grade);
		}
		else if(salary>=20000)
		{
			System.out.println("Salary is " +salary);
		}
		else
		{
			System.out.println("salary is high");
		}
		
	}

}
