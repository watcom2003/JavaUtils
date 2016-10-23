import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
	public class TestReader {
	
		public static void main(String[] args) throws IOException {
			int year;
			Reader.init(new FileInputStream(new File("data/input.txt")));
			Reader.setDelimeter("\t ,");
			
			System.out.print("Input year : ");
			year = Reader.nextInt();
			System.out.println(year);
		}

	}
