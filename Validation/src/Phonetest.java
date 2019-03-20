import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Phonetest {

	@Test
	void test() {
//		fail("Not yet implemented");
		PhoneNumber phnTest = new PhoneNumber();
		assertEquals("Success->Grameen,airtel,robi,Banglalink",phnTest.validation());
		
	}

}
