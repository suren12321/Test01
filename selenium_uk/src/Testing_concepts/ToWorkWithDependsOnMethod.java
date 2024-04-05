package Testing_concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithDependsOnMethod {
	@Test
	public void register_module() {
		//int a=10/0;//error
		Reporter.log("From register module",true);
	}
	@Test(dependsOnMethods = "register_module")//use this method to skip if one test fails
	public void login_module() {
		int a=10/0;//error
		Reporter.log("From register module",true);
	}
}
