package Com.comCastOrgTest;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups = "SmokeTest")
	public void CreatOrgTest()
	{
		System.out.println("execute CreatOrgTest ");
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
