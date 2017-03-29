import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 Scanner br = new Scanner(System.in);
	        String main = br.nextLine();
	        int subLength = br.nextInt();
	        ArrayList<String> mainSub = new ArrayList<String>();
	        for (int i=0;i<=main.length()-subLength;i++)
	            mainSub.add(main.substring(i,i+subLength));
	        Collections.sort(mainSub);
	        System.out.println(mainSub.get(0));
	System.out.println(mainSub.get(mainSub.size()-1));	
		
}
}
