import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Task_1 {

	public static void main(String[] args) {
		
		// concept of set
		Set<String> userNameSet = new HashSet<String>();
		userNameSet.add("Charles");
		userNameSet.add("Sarah");
		userNameSet.add("Awsome");
		userNameSet.add("Morgan");
		userNameSet.add("Awsome");
		System.out.println("Demo of HashSet");
		for (String name: userNameSet) {
			System.out.println(name);
		}
		if (userNameSet.contains("Charles")) {
			System.out.println("Charles is in the Hashset");
		}
		
		// concept of list
		System.out.println("\nDemo of list");
		List<String> foodList = new ArrayList<String>();
		foodList.add("Orange");
		foodList.addFirst("Apple");
		foodList.addLast("grapes");
		for (String result:foodList) {
			System.out.println(result);
		}
		foodList.add(1, "PineApple");
		System.out.println("\nList after ADDING PineApple at index 1");
		for (String result:foodList) {
			System.out.println(result);
		}
		
		// concept of deque
		System.out.println("\nDemo of Deque");
		Queue<String> carModel = new ArrayDeque<String>();
		carModel.add("Tesla model S");
		carModel.add("Hyundai ioniq 5");
		carModel.add("mitsubishi outlander");
		for (String extract:carModel) {
			System.out.println(extract);
		}
		System.out.println("We are removing this from the queue : " + carModel.poll());
		System.out.println("Here is what is left:");
		for (String extract:carModel) {
			System.out.println(extract);
		}
	}

}
