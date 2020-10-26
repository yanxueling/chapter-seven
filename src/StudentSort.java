import java.util.Scanner;

public class StudentSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int num = input.nextInt();
		
		String [] name = new String [num];
		double [] score = new double [num];
		System.out.println("Enter "+num+" students' name ,score: ");
		for(int i =0;i<num;i++) {
			name[i]=input.next();
			score[i]=input.nextDouble();
		}
		
		double temp=0;
		String tempName ;
		for(int i=0;i<score.length;i++) {
				for(int j =i+1;j<score.length;j++) {
					if(score[j]>score[i]) {
						temp = score[i];
						score[i]=score[j];
						score[j]=temp;
					
					    tempName = name[i];
						name[i]=name[j];
						name[j]=tempName;
				}
				}
		}
		
		for(int i=0;i<score.length;i++) {
			System.out.println(name[i]+" "+score[i]);
		}		
		
	}

}
