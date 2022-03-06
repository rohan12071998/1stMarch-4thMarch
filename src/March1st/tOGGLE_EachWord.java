package March1st;

public class tOGGLE_EachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Toggle="This is Geekster";
		String word[]=Toggle.split(" ");
		for(int i=0;i<word.length;i++) {
			String w=word[i];
			String FirstLetter=w.substring(0,1);
			String LastLetter=w.substring(1,w.length());
			String sum=(FirstLetter.toLowerCase()+LastLetter.toUpperCase());
			System.out.print(sum+" ");
			
			
		}
	}

}
