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
			bw.write("���ع��� ��λ���\n");
			bw.write("������ �⵵��\n");
			bw.write("�ϴ����� �����ϻ�\n");
			bw.write("�츮���� ����\n");
			bw.write("����ȭ ��õ�� ȭ������\n");
			bw.write("���� ��� �������� ���� �����ϼ�\n");
			bw.close();
			
			
		}
	}
}
