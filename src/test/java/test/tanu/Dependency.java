package test.tanu;
import org.testng.Assert;

import org.testng.annotations.Test;


public class Dependency {
	@Test(priority=1)
	void openapp()
	{
	Assert.assertTrue(true);
		
	}
	@Test (priority=2 ,dependsOnMethods={"openapp"})
	void Login()
	{
		Assert.assertTrue(false);

	}
	@Test(priority=3,dependsOnMethods={"Login"}) 
	void Search()
	{
		Assert.assertTrue(true);

	}
	@Test(priority=4,dependsOnMethods={"Search","Login"})
	void advanceSearch()
	{
		Assert.assertTrue(true);

	}
	@Test (priority=5)
	void logout()
	{
		Assert.assertTrue(true);

	}
	
	

}
