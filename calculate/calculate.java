import java.util.Scanner;
public class calculate
{
	public static void main(String[] args) 
	{
	int firstNumber, secondNumber;
	Scanner sc = new Scanner(System.in);
        System.out.println("\n1. Addition \n2.Subtraction");
        System.out.print("\n Choose any");
        int choice = sc.nextInt();
        System.out.print("\nEnter two numbers");
        // Scanner sc = new Scanner(System.in);
        firstNumber = sc.nextInt(); 
        secondNumber =sc.nextInt();
        System.out.println();
        if (choice == 1)
        {
            add(firstNumber,secondNumber);
        }
        else if (choice == 2)
        {
            subtract(firstNumber,secondNumber);
        }
        System.out.println();
        sc.close();
        
    }
	public static void add(int firstNumber, int secondNumber)
	{
        
        
        System.out.println( firstNumber + secondNumber);
	}
	public static void subtract(int firstNumber,int secondNumber)
	{

        
        System.out.println(firstNumber + secondNumber);
	}
}