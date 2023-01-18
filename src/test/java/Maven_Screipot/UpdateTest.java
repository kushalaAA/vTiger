package Maven_Screipot;

import org.testng.annotations.Test;

public class UpdateTest {
	
	@Test
	public void create()
	{
	String BROWSER = System.getProperty("browser");
	String URL = System.getProperty("url");
	String USERNAME = System.getProperty("username");
	String PASSWORD = System.getProperty("password");
	
	
	System.out.println(BROWSER);
	System.out.println(URL);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	}
	
//	@Test
//	public void update() {
//		System.out.println("Project Updated Successfully");
//	}
//	
//	@Test
//	public void delete() {
//		System.out.println("Project Deleted Successfully");
//	}

}
