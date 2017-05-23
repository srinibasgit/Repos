package sort;

import java.util.LinkedList;

public class SortHelper {

	public static LinkedList<Integer> getRandomList(int length) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for (int i = 0; i < length; i++) {
			list.add((int) (Math.random() * 1000));
		}
		
		System.out.println("List created.. \n" + list + "\n");
		return list;
	}
	
	public static void insertInLinkedListAt(Integer item, int pos, LinkedList<Integer> list) {
		
	}
}
