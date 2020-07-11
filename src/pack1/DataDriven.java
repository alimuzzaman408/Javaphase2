package pack1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	@Test(dataProvider="getData")
	public void logintest(String username,String password) {
  


	}

	@DataProvider
	public String[][]getData() {

		String[][]data=new String[3][2];
		//1st row
		data[0][0]="Username1";
		data[0][1]="Password1";
		//2nd Row
		data[1][0]="Username2";
		data[1][1]="Password2";
		//3rd Row
		data[2][0]="Username3";
		data[2][1]="Password3";
		return data;


	}





}
