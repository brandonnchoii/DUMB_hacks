import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Interpreter {
	private String email = "";
	private String message = "";
	
	public void interpret() {
		readEmail();
		for (int i = 0; i < email.length(); i++){
			if (Character.isUpperCase(email.charAt(i)))
				message += email.charAt(i);
		}
		System.out.println(message);
	}
	
	private void readEmail() {
		File f = new File("/Users/brandonchoi/Desktop/DUMB_hacks/src/email");
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNext()){
				email += sc.next();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args []) {
		Interpreter i = new Interpreter();
		i.interpret();
	}
}
