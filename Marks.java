package Operatora;
import java.util.*;

public class Marks {

	public static void main(String[] args) {
		int m1;
		String res;
	
		System.out.println("Enter The marks by user");
		Scanner m= new Scanner(System.in);
		m1=m.nextInt();
		res= m1> 40? "Pass":"Fail";
		System.out.println(res);
		
		
	}
		

}
