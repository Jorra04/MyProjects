package FileReading;
import java.io.File;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		try {
			File file = new File(Path.path);
			Scanner buff = new Scanner(file);
			while(buff.hasNext()) {
				sb.append(buff.nextLine());
			}
		}
		catch(Exception e) {
			System.out.println("Exception incurred");
			e.printStackTrace();
		}
		System.out.println(sb.toString());
	}

}
