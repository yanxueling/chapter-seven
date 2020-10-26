import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoOrderedlists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter list1: ");
	    int[] list1 = new int[input.nextInt()];
	    for (int i = 0; i < list1.length; i++) {
	        list1[i] = input.nextInt();
	    }
	    System.out.print("Enter list2: ");
	    int[] list2 = new int[input.nextInt()];
	    for (int i = 0; i < list2.length; i++) {
	        list2[i] = input.nextInt();
	    }
	    System.out.print("The merged list is " + Arrays.toString(merge(list1, list2)));
	}
	private static int[] merge(int[] list1, int[] list2) {
	    int[] newList = new int[list1.length + list2.length];
	    System.arraycopy(list1, 0, newList, 0, list1.length);
	    System.arraycopy(list2, 0, newList, list1.length, list2.length);
	    Arrays.sort(newList);
	    return newList;
	}

}
