import java.util.ArrayList;
import java.util.List;

public class Task_2 {
	
	public static class TestGeneric<T> {
		List<T> list = new ArrayList<T>();
		
		public void add(T data) {
			list.add(data);
		}
		public void delete() {
			System.out.println("Removing : " + list.removeLast());
		}
		public void displayAll() {
			System.out.println("Display the current list :");
			for (T printT:list) {
				System.out.println(printT);
			}
			System.out.println("--------------------------");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric<String> name = new TestGeneric<String>(); 
		name.add("Apple");
		name.add("Pinacolada");
		name.add("chicken");

		name.displayAll();
		name.delete();
		name.displayAll();
		TestGeneric<Integer> number = new TestGeneric<Integer>(); 
		number.add(1);
		number.add(2);
		number.add(3);

		number.displayAll();
		number.delete();
		number.displayAll();
	}

}
