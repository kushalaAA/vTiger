package Practice_Maven;

import org.testng.annotations.Test;

public class TestScript_02 {
	//Test Annotation
	@Test(groups = {"smoke","regression"})
	public void script03() {
		System.out.println("script03");
	}
    
	@Test(groups = {"smoke","regression"})
	public void script04() {
		System.out.println("script04");
	}
}
