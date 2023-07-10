package test.tanu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertion {
	@Test
	void test() 
	{int x = 15;
	int y = 15;
		/*
		
		if (x == y) {
			System.out.println("test is passed");
		} else {
			System.out.println("tets is falied");
		}*/
		//Assert.assertEquals(x, y);
	//Assert.assertTrue(false);
		

	int a=20;
	int b =10;
	//Assert.assertEquals(a>b, true,"a is not greatr than b");//false
	String fa="xcd";
	String gd="xcd";
	Assert.assertNotEquals(fa, gd);;
	
	}
	
}
