package testing.com;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1 {
	@Test
	void hutum()
	{
		System.out.println("test methit hutum");
	}
	
	@BeforeTest
	void tanuapp() {
		System.out.println("before etsttanuapp");
	}
	

	@AfterTest
	void anshuapp() {
		System.out.println("after test");
	}
}
