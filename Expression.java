//Program to print the result of the given expression.
package mypackage;

public class Expression {
	
	//Declaration of main method
	public static void main(String[] args) {
		
		//Declaring and assigning two integer variables
		int a=20;
		int b=10;
		
		//code for the given expression with different operations
		b=a-- - --a; //using pre,post decrement operators
		int c=a--; //using post decrement operator
		int d=a>>2;//sing using Bitwise Right shift operator
		int e=a&b; //Using Bitwise and operator
		
		System.out.println("    The output for the given expression");
		//To insert a new line
		System.out.println();
		
		//To display the value of b,c,d,e after the operations as performed.
		System.out.println("	The value of b is " + b);
		System.out.println("	The value of c is " + c);
		System.out.println("	The value of d is " + d);
		System.out.println("	The value of e is " + e);
		
	}

}//End program
