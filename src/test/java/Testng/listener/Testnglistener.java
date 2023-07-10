package Testng.listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testnglistener  {
	@Test(priority=1)
	void test1()
	{
		Assert.assertEquals(1, 1);
	}
	@Test(priority=2)
	void test2()
	{
		Assert.assertEquals("a", "b");
	}
	@Test(priority=3 ,dependsOnMethods={"test2"})
	void test3()
	{
		Assert.assertEquals(1, 1);
	}



}
