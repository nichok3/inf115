import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import main.NicholasKim;

public class TestNicholasKim {
	NicholasKim n;
	
	@BeforeEach
	void setUp() {
		n = new NicholasKim();
	}
	
	@Test
	void testFullName() {
		Assertions.assertEquals(n.getFullName(), "Nicholas Kim");
	}
	
	@Test
	void testFirstName() {
		Assertions.assertEquals(n.getFirstName(), "Nicholas");
	}
	
	@Test
	void testLastName() {
		Assertions.assertEquals(n.getLastName(), "Kim");
	}
	
	@Test
	void testUCInetID() {
		Assertions.assertEquals(n.getUCInetID(), "nichok3");
	}
	
	@Test
	void testStudentNumber() {
		Assertions.assertEquals(n.getStudentNumber(), 93176609);
	}
	
	@Test
	void testRotationPos() {
		Assertions.assertEquals(n.getRotatedFullName(3), "holas KimNic");
	}
	
	@Test
	void testRotationNeg() {
		Assertions.assertEquals(n.getRotatedFullName(-7), "las KimNicho");
	}
}
