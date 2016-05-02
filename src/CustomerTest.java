import static org.junit.Assert.*;
import org.junit.Test;

public class CustomerTest {

	@Test
	public void testGetName() {
		Customer TestCustomer = new Customer("Lukas");
		assertTrue(TestCustomer.getName()== "Lukas");
	}

	@Test
	public void testStatement() {
		Customer TestCustomer = new Customer("Lukas");
		assertTrue(TestCustomer.statement()!= "");
	}

}
