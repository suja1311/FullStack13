import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class circleTest {


	@Test
	void testAreaForCircleWithRadiusAs2() {
		circle c = new circle();
		
		System.out.println(c.CalculateArea(2));
		
		//fail("Not yet implemented");
		assertEquals(12.566370614359172, c.CalculateArea(2));
	}
	
	@Test
	void testAreaForCircleWithRadiusAs22() {
		circle c = new circle();
		
		//System.out.println(c.CalculateArea());
		
		//fail("Not yet implemented");
		assertEquals(78.53981633974483, c.CalculateArea(5));
	}
	
}
