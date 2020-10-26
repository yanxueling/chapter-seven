import java.util.Scanner;
public class SortCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str = input.nextLine();
		str = sort(str);
		System.out.println(str);
	}
 
	public static String sort(String s){
		char[] chs = s.toCharArray();
		java.util.Arrays.sort(chs);
		String result = String.valueOf(chs);
		return result;
	}
}
