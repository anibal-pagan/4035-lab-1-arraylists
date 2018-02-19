import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLab1 {
	
	public static void main(String[] args){
		
		ArrayList<Integer> numbers = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int value;
		boolean active = true;
		
		System.out.println("Input 1 to add a number to the Array, 2 to remove "
				+ "a number, 3 to show the size, or any other number to "
				+ "terminate.");
		
		while(active){
			switch(input.nextInt()){
			case 1:
				value = input.nextInt();
				numbers.add(value);
				System.out.println(numbers);
				break;
			case 2:
				value = input.nextInt();
				while(numbers.contains(value)){
						numbers.remove(numbers.indexOf(value));
				}
				System.out.println(numbers);
				break;
			case 3:
				System.out.println("Size of list: " + numbers.size());
				break;
			default:
				System.out.println("Goodbye!");
				active = false;
			}
		}
		input.close();
	}
}