import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test(expected = BowlingException.class)
	public void test() throws BowlingException {
		
		for (int i=0; i<11;i++)
			new Frame(2,2);
		
		//fail("Not yet implemented");
	}

}
