package Operatora;
import java.util.Scanner;
public class PosorNeg {

	public static void main(String[] args) {
		int num;
		
	
		
		System.out.println("Enter Positive or Negative Number");
		Scanner pos= new Scanner(System.in);
		num = pos.nextInt();
		
		String p= num>=0?"Positive Number":"Negative Number";
		
		System.out.println(p);
		System.out.println("number enter by User");
		System.out.println(num);
		
		

	}

}
