import java.util.Scanner;

public class LineComparison {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value for line_1");
		System.out.println("X1 is");
		int x1 = sc.nextInt();
		
		System.out.println("Y1 is");
		int y1 = sc.nextInt();
		
		
		System.out.println("X2 is");
		int x2 = sc.nextInt();
		
		System.out.println("Y2 is");
		int y2 = sc.nextInt();
		
		double lenght = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
		System.out.println("Lenght of line_1 is "+lenght);
		
		
		
		System.out.println("Enter value for line_2");
		System.out.println("A1 is");
		int a1 = sc.nextInt();
		
		System.out.println("B1 is");
		int b1 = sc.nextInt();
		
		
		System.out.println("A2 is");
		int a2 = sc.nextInt();
		
		System.out.println("B2 is");
		int b2 = sc.nextInt();
		
		double lenght_2 = Math.sqrt((a2-a1) * (a2-a1) + (b2-b1) * (b2-b1));
		System.out.println("Lenght of line_2 is "+lenght_2);
		
		if(lenght == lenght_2) 
		{
			System.out.println("line are equal");
		}
		else 
		{
			System.out.println("line are not equal");
		}
	}
	
}
