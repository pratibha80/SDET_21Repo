package Com.comCastTest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "SmokeTest")
	public void CreatContactTest()
	{
		System.out.println("execute CreatContactTest ");
		System.out.println("execute CreatOrgTest ");
		String BROWSER = System.getProperty("chrome");
		String ENV = System.getProperty("http://testenv.com");
		System.out.println("BROWSER====>"+BROWSER +"   ,URL===>"+ ENV);
	}
 
	@Test(groups = "RegressionTest")
	public void CreatWithOrgTest()
	{
		System.out.println("execute CreatWithOrgTest ");
	}
	
	@Test(groups = "RegressionTest")
	public void deletContactTest()
	{
		System.out.println("execute deletContactTest ");
	}
}
