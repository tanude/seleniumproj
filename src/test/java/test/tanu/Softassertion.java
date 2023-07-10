package test.tanu;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Softassertion {
	//@Test
	void testhardassertion()
	
	{
		System.out.println("testing....");
		System.out.println("testing....");
		System.out.println("testing....");
		System.out.println("testing....");
		Assert.assertEquals(1, 2);

		System.out.println("hard assertion completed");
		
	}
	@Test
void testsoftassertion()
	
	{
		System.out.println("testing....");
		System.out.println("testing....");
		System.out.println("testing....");
		System.out.println("testing....");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);

		System.out.println("hard assertion completed");
		sa.assertEquals(1, 1);
		System.out.println("soft assertion executed");
		sa.assertAll();//madatory
		
	}

}
