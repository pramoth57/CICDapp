package applicationPackage;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Appsource {

	@Test
	public void verifysum(){
		


	
		int a=50,b=80,c;
		c=a+b;
		System.out.println("***********************************");
		Assert.assertEquals(c, 130);
		


		}
}
