import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the string");
//		String a = s.nextLine();
//		int subSize = s.nextInt();
//		
//		s.close();
//	
//		String smallest = "";
//		String largest = "";
//		smallest = a.substring(0,subSize);
//		largest = a.substring(0,subSize);
//		
//
//		String ans1 = smallest;
//		String ans2 = largest;
//		System.out.println("CURRENT SMALL IS "+ans1);
//		System.out.println("CURRENT LARGE IS "+ans2);
//		
//		for(int i=1;i<a.length()-subSize;i++)
//		{
//			String b = a.substring(i,i+subSize);
//			System.out.println("NEW SUBSTRING IS "+" "+b);
//			System.out.println("CURRENT SMALL IS "+ans1);
//			System.out.println("CURRENT LARGE IS "+ans2);
//			
//			 ans1 =lexico(b,smallest,subSize);
//			 ans2 = lexico2(b,largest,subSize);
//			
//			// System.out.println(a.substring(i, i+3));
//		}
//		System.out.println(ans1);
//		System.out.println(ans2);
//		
//		
//
//	}
//	// amaana
//	static String  lexico(String b,String smallest,int subsize)
//	{
//		/// ama ana 
//		
//		for(int i=0;i<3;i++)
//		{
//			if(b.charAt(i)<smallest.charAt(i))
//			{
//				//System.out.println("No");
//				
//				
//			}
//			else
//			{
//				break;
//			}
//			
//		}
//	
//		return smallest;
//		
//	}
//	
//	static String  lexico2(String b,String largest, int subsize)
//	{
//		
//		for(int i=0;i<3;i++)
//		{
//			if(b.charAt(i)>largest.charAt(i))
//			{
//				//System.out.println("No");
//				largest = b;
//				
//			}
//			else
//			{
//				break;
//			}
//			
//		}
//	
//		return largest;
//		
//	}
//  
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
