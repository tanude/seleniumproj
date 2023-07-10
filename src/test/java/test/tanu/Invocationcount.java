package test.tanu;

import org.testng.annotations.Test;

public class Invocationcount {
	@Test(invocationCount = 10)
	void test() {
		System.out.println("testing.....");
	}
}
