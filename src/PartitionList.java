import java.util.Arrays;
import java.util.Scanner;

public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter list: ");
		int[] nums = new int[input.nextInt()];
		for(int i = 0; i < nums.length; ++i){
			nums[i] = input.nextInt();
		}
		int num = partition(nums);
		System.out.print("After the partition. the list is ");
		for(int i = 0; i < nums.length; ++i)
			System.out.print(nums[i] + " ");		
	}
 
	public static int partition(int[] list){
		int temp = 0;
		int j = 0;
		for(int i = 1; i < list.length; ++i){
			if(list[i] <= list[j]){
				temp = list[i];
				list[i] = list[j];
				list[j] = temp;
				
				temp = list[j+1];
				list[j+1] = list[i];
				list[i] = temp;
				
				++j;
			}
		}
		return j;
	}

}

