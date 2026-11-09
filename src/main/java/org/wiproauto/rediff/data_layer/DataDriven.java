package org.wiproauto.rediff.data_layer;

import org.testng.annotations.DataProvider;

public class DataDriven 
{

	@DataProvider(name ="login")
	public Object[][] login_data()
	{
		//String username = "testuser";
		
		//Object[] data1 = {"testuser1", "testpass1"};  //-d array
		
		Object[][] data2 = {{"testuser1", "testpass1"},{"testuser2", "testpass2"},{"testuser3", "testpass3"}};  //2-d array
		
		return data2;
		
	}
	
	@DataProvider(name ="signup")
	public Object[][] signup_data()
	{
		//String username = "testuser";
		
		//Object[] data1 = {"testuser1", "testpass1"};  //-d array
		
		Object[][] data2 = {{"testuser1", "testpass1"},{"testuser2", "testpass2"},{"testuser3", "testpass3"}};  //2-d array
		
		return data2;
			
	}
	
}
