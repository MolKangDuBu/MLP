import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		FileTest ft = new FileTest();
		
		try {
			//ft.TextFileWrite();
			ft.TestFileRead();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void TestFileRead() throws IOException {
		File file = new File("test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line ="";
		line = br.readLine();
		while(line!=null) {
			System.out.println(line);
			line= br.readLine();
		}
		br.close();
	}
	
	public void TextFileWrite() throws IOException {
		File file = new File("test.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		
		if(file.isFile()&&file.canWrite()) {
			bw.write("동해물과 백두산이\n");
			bw.write("마르고 닳도록\n");
			bw.write("하느님이 보우하사\n");
			bw.write("우리나라 만세\n");
			bw.write("무궁화 삼천리 화려강산\n");
			bw.write("대한 사람 대한으로 길이 보전하세\n");
			bw.close();
			
			
		}
	}
}
