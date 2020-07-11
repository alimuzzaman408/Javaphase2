package pack1;

public class ReverseString {

	public static void main(String[] args) {
		String  s="MD ALIMUZZAMAN";
		//Using for loop
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println("Reverse string is:"+rev);
		
		//Using String buffer
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println("Reverse string is:"+sb.reverse());

	}

}
