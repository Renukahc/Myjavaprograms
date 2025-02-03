package Assignment1;

public class Prohram6_IfblockTrue{
	public static void main(String[] args) 
	{
		int age = 25;
		double temprature = 39.0;
		boolean isRaining = true;
		float celcius = 10.5f;
		//String color = "Blue";
		if(age>18)
		{
			System.out.println("Age is greater then 18. True");
		}
		else {
			System.out.println("Age is not greater then 18. False");
		}
		if(temprature > 30.0)
		{
			System.out.println("temprature is greater then 30. True");
		}
		else {
			System.out.println("temprature is not greater then 30. False");
		}
		if(isRaining)
		{
			System.out.println("Is is raining. True");
		}
		else {
			System.out.println("It is not raining. False");
		}
	/*	if(color.equalsIgnoreCase("Blue"))
		{
			System.out.println("Your favorite color is blue. True");
		}
		else
		{
			System.out.println("Your favorite color is not blue. False");

		}*/
		if(celcius >= 8.8)
		{
			System.out.println("Celcius is greater then 8.8c. True");
		}
		else 
			{
				System.out.println("Celcius is not greater then 8.8c. False");
			}
		}
		
	}


