/* TODO Demonstrate the use of final keyword with class, with the method, with
*the constructor, and with a variable.
*Final is used when a function/specific data is needed to be preserved.
*
*Uncomment code to see where Compile-time Errors result from final keyword usage 
*/
public class FinalInritance {
	
	public static void main(String[] args) {
		//Instance of final class
		FinalClass fc = new FinalClass();
		System.out.println(fc);
		
		//Instance of a child class inheriting Maths class
		Geometry problem = new Geometry();
		
		//add method is constant for all instances of Maths including its sub-class(es) 
		int sum = problem.add(3, 5);
		System.out.println("The sum of 3 and 5 is " +sum+".");
		
		//Printing out a variable initiated using the area method
		double area = problem.area(2.5);
		System.out.println("The area of a circle with radius 2.5 is " +area+ "." );	
	}
}

final class FinalClass{						//FinalClass can't be modified because it's marked final  
		
	@Override
	public String toString() {
		return "This is a final class, it can't be inherited!";
	}	
}

//class ChildClass extends FinalClass{		//Compiler Error because FinalClass can't be inherited
//}

class Maths{
	
	final double pi = 3.14159265359;		//Pi is marked final so that it's specific value can't be changed
	
//	final Maths(){							//Compiler Error because a Constructor can't be marked final 
//	}										//It's implicitly final and static.	
	
	final int add(int x, int y){			//Method "add" must only return the sum of it's parameters
		return x+y;
	}
}

class Geometry extends Maths{				//Child Class of Maths
	
//	int add(int x, int y){					//Compiler Error because Method "add" is marked final in Parent (Maths)
//		return Math.sqrt(x*y);				//and can't be overridden by child classes as a result.
//	}

	double area(double value){
//		pi *= Math.pow(value,2);			//Compiler Error because pi is marked final and can't be modified.
//		return pi;
		return pi*Math.pow(value,2);		//this is a right way to return the result.
	}	
}