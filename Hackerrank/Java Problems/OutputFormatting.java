import java.util.Scanner;

public class OutputFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner sc=new Scanner(System.in);
		 
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.next();
             int x=sc.nextInt();
             System.out.print(s1);
             for(int j=s1.length();j<15;j++)
             {
            	 
            	 System.out.print(" ");
            	 
             }
            	 if(x>=0 && x<=9)
            	 {
            		 System.out.print("00"+x);
            	 }
            	 if(x>=10 && x<=99)
            	 {
            		 System.out.print("0"+x);
            	 }
            	 if(x>=100 && x<=999)
            	 {
            		 System.out.print(x);
            	 }
            	 System.out.println();
            	 
             }
     
         System.out.println("================================");
	}

}

