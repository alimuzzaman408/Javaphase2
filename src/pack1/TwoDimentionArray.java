package pack1;

public class TwoDimentionArray {

	public static void main(String[] args) {
		
		int a[][]= {{100,200,789},{300,400,800},{500,600,567},{564,789,453},{678,987,123},{879,564,432}};
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		
		/*for(int i=0;i<a.length;i++) {
			
			
			for(int j=0;j<a[i].length;j++) {
				
				System.out.print(a[i][j]+"  ");
				
			}
			System.out.println();
			
			
		}*/
		
		for(int x[]:a) {
			
			for(int y:x) {
				
				System.out.print(y+" ");
								
			}
			System.out.println();
		}
		
		
		
		

	}

}
