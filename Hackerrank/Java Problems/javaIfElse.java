import java.util.Scanner;

public class javaIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		 Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();            
         String ans="";
         if(n%2==1){
           ans = "Weird";
         }
         
         else{
        	 
         if(n>=2 && n<=5)
             {
             System.out.println("Not Weird");
             }
         
             if(n>=6 && n<=20)
                 {
                 System.out.println("Weird");
                 }
             
             if(n>20)
                 {
                 System.out.println("Not Weird");
                 }
             
         		}
         System.out.println(ans);
         
     }
		

	}


