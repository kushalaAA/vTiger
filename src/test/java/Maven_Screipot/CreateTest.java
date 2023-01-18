package Maven_Screipot;

import org.testng.annotations.Test;

public class CreateTest {
	
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
//	public void Create(){
//		System.out.println("Project Created Succesfully");	
//	}
	
//	@Test
//	public void edit(){
//		System.out.println("Project Modified Succesfully");	
//	}
}
