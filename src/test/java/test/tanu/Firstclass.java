package test.tanu;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firstclass {
	@Test
	void abc()
	{
		System.out.println("from class abc");
	}

	@BeforeTest
	void m()
	{
		System.out.println("beforetest method");
	}
	@BeforeSuite
	void bs()
	{
		System.out.println("beforesuit method");
	}
	@AfterSuite
	void as()
	{
		System.out.println("aftersuit method");
	
	}
	
	
}
