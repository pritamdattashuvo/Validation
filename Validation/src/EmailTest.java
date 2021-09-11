import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void test() {
//		fail("Not yet implemented");
		Emailvalidation evt = new Emailvalidation();
		
		assertEquals("Email validation success",evt.valEmail("pritamewu@naztech.io"));
	}

	@Test
	void testThDomain() {
		Emailvalidation evt = new Emailvalidation();
		String[] thDomains = new String[4];
		thDomains[0] = "email-test@universal-acceptance-test.international";
		thDomains[1] = "email-test@universal-acceptance-test.icu";
		thDomains[2] = "อีเมลทดสอบ@ยูเอทดสอบ.ไทย";
		thDomains[3] = "อีเมลทดสอบ@ทีเอชนิค.องค์กร.ไทย";
		for(String thDomain : thDomains){
			assertEquals("Email validation success",evt.valEmail(thDomain));
		}
	}

}
