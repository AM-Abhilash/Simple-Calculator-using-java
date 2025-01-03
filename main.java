import java.util.Scanner;
public class main
{
	public static void main(String[] args) {
	    
		System.out.println("Simple Calculator");
		Scanner scanner=new Scanner(System.in);
		
			System.out.println("Enter the first number");
			int n1=scanner.nextInt();
			
		   System.out.println("Enter the second number");
            int n2=scanner.nextInt();
            
            System.out.println("Choose Your Operator");
            
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            
            int op=scanner.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Addition :" +(n1+n2));
                    break;
                     case 2:
                    System.out.println("Subtraction :" +(n1-n2));
                    break;
                     case 3:
                    System.out.println("Multiplication :" +(n1*n2));
                    break;
                     case 4:
                    System.out.println("Division :" +(n1/n2));
                    break;
            }
		
	}
}