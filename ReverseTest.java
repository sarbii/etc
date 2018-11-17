import java.util.Scanner;
public class ReverseTest {

	public static void main(String[] args) {
		
		String str;
		int i;
		int j;
		System.out.print("문자열을 입력하세요");
		Scanner input = new Scanner(System.in);
		str = input.next();
		
	
		
		for(i = str.length()-1; i>=0; i--) {
			
			System.out.print(str.charAt(i));
		
		
	}
	}
}
