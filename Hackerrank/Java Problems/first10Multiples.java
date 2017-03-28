import java.util.Scanner;

public class first10Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number :");
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		for(int i=1;i<11;i++)
		{
			System.out.println(num+" "+"x"+" "+i+" "+"="+" "+(num*i));
		}

	}

}
