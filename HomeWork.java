package MavenAssignment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork extends HomeWorkBase{
	
	/* Precondition: Create repo in GitHub
Steps:
Create Maven project with 1 Test Case that will navigate to google an get a title of the page. 
Push your code into the remote repo. 
Go back to your project and add assertion of the title.
Push changed to the remote repo.
Note: please provide your remote repo URL. Do not submit any files.
	 */
	
	@BeforeMethod
	public void open() {
		setup();
	}
	
	@Test
	public void getTitle() {
		
	String googleTitle = driver.getTitle();
	System.out.println(googleTitle);
		
	}

}
