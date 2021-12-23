package 해쉬;

public class Main {
	public static void main(String[] args) {
		Hash hash = new Hash();
		hash.creatHashTable();
		hash.display();
		hash.search("호두마루");
		hash.search("월드콘");
	}
}
