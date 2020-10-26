import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double [] num = new double[10];
        for(int i=0;i<10;i++) {
        	num[i]= Math.random()*100;
        }
        bubbleSort(num);
        
        for(int i =0;i<10;i++) {
        	System.out.printf("%4.2f\n",num[i]);
        }
        
	}
	
	public static void bubbleSort(double [] list) {
		double temp=0;
		for(int i=0;i<list.length;i++) {
			for(int j=i+1;j<list.length;j++) {
				if(list[i]>list[j]) {
					temp=list[j];
					list[j]=list[i];
					list[i]=temp;
				}
					
			}
		}		
		
	}
}

