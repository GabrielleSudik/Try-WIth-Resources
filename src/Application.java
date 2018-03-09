//Try With simplifies what was learned in the File Reader lesson
//that was full of try-catch blocks
//this will have a lot less code

//re-uses some code from that lesson

//this code involves making some selections from the error menus
//I"ll usually leave out details because you're getting the hang of that

class Temp implements AutoCloseable {
	
	//AutoCloseable is a built-in class with a method that says you have to close other methods

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing.");
		
		//here's a new thing:
		throw new Exception("Oh no!");
		//that'll print in the stack trace.
		
	}
	
}

public class Application {

	public static void main(String[] args) {
		
		try (
		Temp temp1 = new Temp()) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Caught an exception.");
		}
		
		//by putting the instantiation of the object inside the try block
		//it'll first run any class methods in that class
		//and since throwing an exception happens in that class
		//it'll do the thing in the catch block too.
		//something like that.
		//sounds like using the AutoCloseable class is required.
		
	}
}
