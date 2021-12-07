import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception_Test02 {

	public static void main(String[] args) {
		File file;
		file = new File("test.txt");
		
		try {
			FileInputStream fs = new FileInputStream(file);
			byte []b = new byte[40];
			fs.read(b);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �Y�� �� �����ϴ�.");
		}catch(IOException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		}
		
		finally {
			System.out.println("����");
		}
		
	}
}
