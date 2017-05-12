import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_commandL() {
		PlanetExplorer pe=new PlanetExplorer(0,0,"");
		
		assertEquals("(0,1,N)",pe.executeCommand("l"));
		
	}
}
