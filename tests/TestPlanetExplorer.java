import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_commandF() {
		PlanetExplorer pe=new PlanetExplorer(3,3,"");
		
		assertEquals("(0,1,N)",pe.executeCommand("f"));
		
	}
	
	@Test
	public void test_commandB() {
		PlanetExplorer pe=new PlanetExplorer(3,3,"");
		
		assertEquals("(0,0,N)",pe.executeCommand("b"));
		
	}
	@Test
	public void test_commandL() {
		PlanetExplorer pe=new PlanetExplorer(3,3,"");
		
		assertEquals("(0,0,W)",pe.executeCommand("l"));	
	}
	
	@Test
	public void test_commandR() {
		PlanetExplorer pe=new PlanetExplorer(3,3,"");
		
		assertEquals("(0,0,E)",pe.executeCommand("r"));	
	}
}
