//Adam Chung
import java.util.Random;

public class Lab1BLinear {

	static void linearSearch(int[] nums) {
		int index = 0;
		int key = 4;
		int count = 0;
		int occurrence = 0;
		for(int i:nums) {
			if(i == key) {
				count += 1;
				occurrence += 1;
				index = count;
			}else {
				count += 1;
			}
		}
		if(occurrence >= 1) {
			System.out.println("Index: "+index+" Occurred: "+occurrence);
		}else {
			System.out.println("Value not found in the array ");
		}
	}
	
	static int[] fillArray(int[] data) {
		Random rand = new Random();
		for(int i=0;i<data.length;i++) {
			data[i] = rand.nextInt((100-1+100)-100);
		}
		return data;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,4,4,22,-5,10,21,-47,23};
		System.out.print("Num Array: ");
		linearSearch(nums);
		
		int[] data = new int[20];
		fillArray(data);

		System.out.print("Data array: ");
		linearSearch(data);
		
		for(int i:data) {
			System.out.print(i+" ");
		}
		
	}

}
