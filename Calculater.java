import java.util.*;
class Calculater
{
	public static void main(String [] args)
	{
		int num1,num2,ch;
		System.out.println("Enter your choice.......\n1 for Addition\n2 for subtraction\n3 for Multiplication\n4 for Divide");
		Scanner s2=new Scanner(System.in);
		ch=s2.nextInt();
		if(ch!=1 && ch!=2 && ch!=3 && ch!=4)
		{
			System.out.println("You enterd "+ ch +" that is wrong choice\nPlease enter correct choice");
		}
		else
			{
				System.out.println("Enter first number");
				num1=s2.nextInt();		
				System.out.println("Enter second number");
				num2=s2.nextInt();
				switch(ch)
				{
					case 1:
						System.out.println("Addition of "+ num1 +" and "+ num2 +" is = "+(num1+num2));
						break;
						
					case 2:
						System.out.println("Subtraction of "+ num1 +" and "+ num2 +" is = "+(num1-num2));
						break;
						
					case 3:
						System.out.println("Multiplication of "+ num1 +" and "+ num2 +" is = "+(num1*num2));
						break;
						
					case 4:
						System.out.println("Division of "+ num1 +" and "+ num2 +" is = "+(num1/num2));
						break;
				}
			}
	}
}
