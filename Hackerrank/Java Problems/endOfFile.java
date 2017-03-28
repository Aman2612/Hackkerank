import java.util.Calendar;
import java.util.Scanner;

public class endOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		Scanner s = new Scanner(System.in);
		do
		{
			String data = s.nextLine();
			System.out.println(i+" "+data);
			i++;
		}while(s.hasNext());
		

		
		

	}

}
