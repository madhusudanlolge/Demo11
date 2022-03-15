package Pack;

//public --> access modifier means globaly available to access
// static --> keyword save the memory for declaration of object using static it is not neccessary to declare object
// String[] args --> command line argument array of type java.lang.String , name of string array is args but it is not fixed and user can change 
public class Calculator2 {
	// in java no garbadge value
	int a=1;//data member
	int b;
	 
	void add() // mumber funcation
	{
		//int a;// local variable (it will gives error due to local variable not initialize
		System.out.println(a);
	}
	
	public static void main(String...args) {
		Calculator2 c = new Calculator2();
		c.add();

	}

}

