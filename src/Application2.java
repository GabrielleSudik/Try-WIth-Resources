import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

	public static void main(String[] args) {
		
		File file2 = new File("testtwo.txt");
		
		//to read that line by line, you need some class/method to do it
		//in last lesson we used FileReader and BufferedReader
		//it took three object total
		//a more streamlined way is:
		
		try(BufferedReader br = new BufferedReader(new FileReader(file2))){
			//instead of creating an object of FileReader
			//then passing that to BufferedReader,
			//we do both steps at once.
			System.out.println("Can't find file: " + file2.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Unable to read file: " + file2.toString());
		}

		//note you added try/catch after the primary line of code.
		//it's hard to tell with all your notes, but this code is much shorter than the last lesson
		//this shorter code only works with java 7 or later (so you're good)
	}
}
