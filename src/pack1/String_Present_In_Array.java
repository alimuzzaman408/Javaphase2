package pack1;

public class String_Present_In_Array {

	public static void main(String[] args) {

		String str[]= {"Ali","Jhon","Kamal","Abraham","1234"};
		String value="1234";
		boolean flag=false;
		for(String x:str) {

			if(x.equals(value)) {
				System.out.println("String is present in array");
			flag=true;
			break;
			}
		}

		
		  if(flag==false) { 
			  System.out.println("String is not present in array");
			  }
		 
	}

}
