package March2nd;

public class TruncateSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello how are you Contestent";
		int k=4;
		TruncateSentence(s,k);		
	}
	public static void TruncateSentence(String s,int k) {
		String arr[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<k;i++) {
			sb.append(arr[i]+" ");
		}
		System.out.print(sb.toString().trim());
		
	}

}
