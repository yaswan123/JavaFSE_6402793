package Ex2_WritingBasicJUnitTests.Ex2_WritingBasicJUnitTests;
import org.junit.Test;
import junit.framework.TestCase;
public class WritingBasicJUnitTests extends TestCase {
	@Test
	public void testAssertions() { 
		 // Assert equals 
		 assertEquals("yash","yash"); 
		 // Assert true 
		 assertTrue(5 > 3); 
		 // Assert false 
		 assertFalse(5 < 3); 
		 // Assert null 
		 assertNull(null); 
		 // Assert not null 
		 assertNotNull(new Object()); 
		 } 
}
