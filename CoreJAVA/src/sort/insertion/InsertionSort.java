package sort.insertion;

import java.util.ArrayList;
import java.util.LinkedList;

import sort.SortHelper;

/**
 * Insertion sort example
 * 
 * https://en.wikipedia.org/wiki/Insertion_sort#/media/File:Insertion-sort-example-300px.gif
 * 
 * @author spanda
 *
 */
public class InsertionSort {

	public static void main(String[] args) {

		LinkedList<Integer> list = SortHelper.getRandomList(20);

		sort(list);

		System.out.println(list);

	}

	private static LinkedList<Integer> sort(LinkedList<Integer> list) {
		for (int i = 1; i < list.size(); i++) {
			int integer = list.get(i);
			int j = i-1;
			while (integer > list.get(j)) {
				j--;
				if(j<0){
					j++;
					break;
				}
			}

			if (list.get(i) > list.get(j)) {
				int temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			}
		}

		return list;
	}

}
