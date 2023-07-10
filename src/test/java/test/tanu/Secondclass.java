package test.tanu;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Secondclass {
	@BeforeClass
	void login()
	{
		System.out.println("from class login");
	}
	@Test(priority=1)
	
	void search()
	{
		System.out.println("from class search");
	}
	
	@Test(priority=2)

	
	void advancesearch()
	{
		System.out.println("from class advsearch");
	}


	@AfterClass
	void logout()
	{
		System.out.println("from class logout");
	}


}
