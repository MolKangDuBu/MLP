import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Student> Student_List = new ArrayList<Student>();
	
	final int MAX =10;
	int MAX_student=0;
	String JungDap ="1234512345";
	
	
	public Manager() {
		Input();
		Check();
		calculate();
		output();
	}
	
	
	
	public void Check() {
		for(Student list: Student_List) {
			for(int i=0; i<MAX; i++) {
				if(list.getS_JungDap().charAt(i)==JungDap.charAt(i)) {
			
					list.setAnswer("O");
				}else {
					list.setAnswer("X");
				}
			}
			
		}
	}
	
	public void calculate() {
		for(Student list: Student_List) {
			for(int i=0; i<MAX; i++) {
				if(list.getAnswer().charAt(i)=='O') {
					list.setNum_answer(1);
					list.setTotal(5);
				}
			}
			
		}
	}
	
	
	public void Input() {
		Student student;
		System.out.print("학생 수를 입력해주세요 : ");
		MAX_student = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<MAX_student;i++) {
			student = new Student();
			System.out.print("학생 이름 : ");
			student.setName(sc.nextLine());
			System.out.print("문제10개의 답안 ex)1234512 : ");
			student.setS_JungDap(sc.nextLine());
			Student_List.add(student);
		}
	
	}
	
	
	public void output(){
		
		for(Student list: Student_List) {
			System.out.println(list.getName()+"\t"+list.getS_JungDap()+"\t"+
								list.getAnswer()+"\t"+list.getNum_answer()+"\t"+list.getTotal());
		}
	}
}
