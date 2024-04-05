package Testing_concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithGroups {
	@Test(groups = "functional testing")
	public void register_module_FT_01() {
		int a=10/0;//error
		Reporter.log("From register module",true);
	}
		@Test(dependsOnGroups = "functional testing", alwaysRun = true)
		//@Test(dependsOnMethods = "register_module")//use this method to skip if one test fails
		public void login_module_FT_01() {
			int a=10/0;//error
			Reporter.log("From register module",true);
		}
	}