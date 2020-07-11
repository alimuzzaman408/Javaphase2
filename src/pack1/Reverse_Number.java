package pack1;

public class Reverse_Number {

	public static void main(String[] args) {
		int num=1234567890;
		int rev=0;
		while(num!=0) {
			int reminder=num%10;
			rev=rev*10+reminder;
			num/=10;
	}
		System.out.println("Reverse number is:"+rev);
	}
}