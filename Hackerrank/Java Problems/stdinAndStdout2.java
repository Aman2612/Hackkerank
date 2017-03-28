import java.util.Scanner;

public class stdinAndStdout2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();  					/// This line is v.imp as after nextInt(), 
        									///the last newline character for that line of integer input is still queued in the input buffer
        									/// and will read empty string
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
		

	}

}
