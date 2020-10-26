import java.util.Scanner;

public class SortYesOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter list: ");
		int num = input.nextInt();
		int []list = new int [num];
		for(int i =0;i<num;i++) {
			list[i]=input.nextInt();
			
		}
		
		if(isSorted(list))
			System.out.println("Tht list is already sorted");
		else
			System.out.println("The list is not sorted");
		
	}
	
	public static  boolean isSorted(int [] list) {
		
		for(int i =0;i<list.length;i++) {
			for(int j =i+1;j<list.length;j++) {
				if(list[i]>list[j])
					return false;
			}
		}
		
		return true;
	}

}
