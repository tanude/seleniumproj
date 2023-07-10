package Grouping.com;

import org.testng.annotations.Test;

public class Grouping {
	@Test(priority=1,groups={"sanity","regression"})
	void loginbyemail()
	{
		System.out.println("login by email");
		
	}
	
	@Test(priority=2,groups={"sanity"})
	void loginbyfacebook()
	{
		System.out.println("login by facebook");
	}
	
	@Test(priority=3,groups={"sanity"})
	void loginbytwitter()
	{
		System.out.println("login by twitter");
	}
	
	@Test(priority=4,groups={"sanity","regression"})
	void sighnupbyemail()
	{
		System.out.println("sighnup by email");
	}
	@Test(priority=5,groups={"regression"})
	void sighnupbyfacebook()
	{
		System.out.println("sighnup by facebook");
	}
	@Test(priority=6,groups={"regression"})
	void sighnupbytwitter()
	{
		System.out.println("sighnup by twitter");
	}
	@Test(priority=7,groups={"sanity","regression"})
	void payemntinrupees()
	{
		System.out.println("inrupees");
	}
	
	@Test(priority=8,groups={"sanity"})
	void  payemntindollar()
	{
		System.out.println(" by dollar");
	}
	@Test(priority=9,groups={"regression"})
	void payemntreturnbybank()
	{
		System.out.println("bank return payment");
	}

}
