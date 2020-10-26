import java.util.Scanner;

public class PrintDefferentNumber {
	final static int NUM =10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int [NUM];
	
		Scanner input = new Scanner(System.in);
		System.out.print("Etner the numbers:");
		for(int i =0;i<NUM;i++) {
			arr[i]= input.nextInt();
		}
		
		int count =0;
		
		for(int i = 0;i<NUM;i++) {
				for(int j =i+1;j<NUM;j++) {
					if(arr[i]==arr[j])
						arr[j]=-1;
			}
				if(arr[i]!=-1)
					count++;
		}
		System.out.print("The number of distinct number is "+count+"\n");
		System.out.print("The distinct numbers are: ");
		for(int i=0;i<NUM;i++) {
			if(arr[i]!=-1)
				System.out.print(arr[i]+" ");
			
		}
	}
}




