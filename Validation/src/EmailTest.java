import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void test() {
//		fail("Not yet implemented");
		Emailvalidation evt = new Emailvalidation();
		
		assertEquals("Email validation success",evt.valEmail());
	}

}
