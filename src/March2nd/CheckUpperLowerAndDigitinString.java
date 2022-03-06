package March2nd;

public class CheckUpperLowerAndDigitinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Rohan25";
		Sentence(str);
		

	}
	public static void Sentence(String str) {
		char ch;
		boolean capital=false;
		boolean lower=false;
		boolean number=false;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(Character.isDigit(ch)){
				number=true;
			}
			else if (Character.isUpperCase(ch)) {
				capital=true;
			}
			else if(Character.isLowerCase(ch)){
				lower=true;
			}
			if (number && capital &&  lower) {
			System.out.println("valid");
			}
			
		}
		System.out.println("Invalid");
	}
}
			
			
		
			
			
		