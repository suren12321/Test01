package Testing_concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToWorkWithThreadPoolSize {
	@Test (invocationCount = 3, threadPoolSize =2)
	public void demo_02() {//testing method/test case
		//int a=10/0;
		Reporter.log("Hi testNG2");//on report
		Reporter.log("Hi testNG2",true);//on console
	}
		@Test(priority = -1)
		public void demo_01() {//testing method/test case
			//int a=10/0;
			Reporter.log("Hi testNG1");//on report
			Reporter.log("Hi testNG1",true);//on console
	}
		@Test(priority = -1)
		public void demo_01() {//testing method/test case
			//int a=10/0;
			Reporter.log("Hi testNG1");//on report
			Reporter.log("Hi testNG1",true);//on console
	}
}
