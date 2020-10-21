import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author lukes
 *
 */
class SuperStackTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	//@AfterEach
	//void tearDown() throws Exception {
	//}

	/**
	 * Test method for {@link SuperStack#isEmpty()}.
	 */
	@Test
	void testIsEmpty() {
		// Create empty stack and check for emptiness!
		
		SuperStack<Integer> stack = new SuperStack<Integer>(1);
		boolean result = stack.isEmpty();
		assertTrue(result);

		stack.push(new Integer(0));

		assertFalse(stack.isEmpty());
		
	}

	/**
	 * Test method for {@link SuperStack#isFull()}.
	 */
	@Test
	void testIsFull() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link SuperStack#push(java.lang.Object)}.
	 */
	@Test
	void testPush() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link SuperStack#pop()}.
	 */
	@Test
	void testPop() {
		fail("Not yet implemented");
	}

}
