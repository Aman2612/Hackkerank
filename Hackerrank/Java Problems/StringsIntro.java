import java.util.Scanner;

public class StringsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = s.nextLine();
		s.close();
		boolean flag=false;
		
		// Summing the length of both strings
		
		int sum = a.length()+b.length();
		System.out.println(sum);
		
		// Checking if string b is lexicographically greater than a
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)<b.charAt(i))
			{
				System.out.println("No");
				flag = false;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("Yes");
		}
		
		System.out.println(Character.toUpperCase(a.charAt(0))+a.substring(1, a.length())+" "+Character.toUpperCase(b.charAt(0))+b.substring(1, b.length()));
		
	}
	
	

	

}
