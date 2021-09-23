package Com.comCastOrgTest;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups = "SmokeTest")
	public void CreatOrgTest() 
	
	
	{
		
		System.out.println("execute CreatOrgTest ");
		String BROWSER = System.getProperty("chrome");
		String ENV = System.getProperty("http://testenv.com");
		System.out.println("BROWSER====>"+BROWSER +"   ,URL===>"+ ENV);
	}
 
	@Test(groups = "RegressionTest")
	public void CreatOrgWithIndustriesTest()
	{
		System.out.println("execute CreatOrgWithIndustriesTest ");
	}
	
	@Test(groups = "RegressionTest")
	public void deletOrgTest()
	{
		System.out.println("execute deletOrgTest ");
	}
	@Test(groups = "RegressionTest")
	public void searchOrgTest()
	{
		System.out.println("execute searchOrgTest ");
	}
}
