import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class_Test {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String s1 = new String("Hello");
		Class c1 = s1.getClass();
		System.out.println(c1.getClass());
		
		Class c2 =String.class;
		System.out.println(c2.getName());
		
		
	
		Class c3 = Class.forName("java.lang.String");
		System.out.println(c3.getName());

		
		Field[] field = c3.getFields();
		
		System.out.println(field);
		for(Field f : field) {
			System.out.println(f.getName());
		}
		Method[] method = c3.getMethods();
		for(Method m : method) {
			System.out.println(m);
		}
		
		
			
	}

}
