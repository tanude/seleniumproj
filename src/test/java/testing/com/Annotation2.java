package testing.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 {
	
	
	@Test
	void test1()
	{
		System.out.println("i am in test1" );
	}
	
	@ BeforeClass
	
	
	void tanuapp() {
		System.out.println("before etsttanuapp");
	}

	@AfterClass
	void anshuapp() {
		System.out.println("after test");
	}
}


