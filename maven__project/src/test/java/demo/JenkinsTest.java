package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest {
	@Test
	public void launch() {
		Reporter.log("Testcase passed", true);
	}
}
