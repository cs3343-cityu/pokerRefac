package testPoker;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import poker.Poker;

public class PokerTest {
	private Poker poker;

	/**
	 * Sets up the test fixture. Called before every test case method.
	 */
	@Before
	public void setUp() {
		poker = new Poker();
	}

	/**
	 * Tears down the test fixture. Called after every test case method.
	 */
	@After
	public void tearDown() {
	}

	// Test case 1: n = 0, cards = { }
	@Test
	public void testNoCards() {
		boolean result;
		String[] input = null;
		result = poker.isFullHouse(input, 0);
		assertEquals(false, result);
	}

	// Test case 2: n = 5, cards = {"C2", "D2", "H2", "S3", "S4"};
	@Test
	public void test22234() {
		boolean result;
		String[] input = new String[] { "C2", "D2", "H2", "S3", "S4" };
		result = poker.isFullHouse(input, 5);
		assertEquals(false, result);
	}

	// Test case 3: n = 5, cards = {"DJ", "SJ", "CK", "DK", "HK"};
	@Test
	public void testJJKKK() {
		boolean result;
		String[] input = new String[] { "DJ", "SJ", "CK", "DK", "HK" };
		result = poker.isFullHouse(input, 5);
		assertEquals(true, result);
	}

	// Test case 4: n = 5, cards = {"C3", "D3", "S3", "HX", "SX"};
	@Test
	public void test333XX() {
		boolean result;
		String[] input = new String[] { "C3", "D3", "S3", "HX", "SX" };
		result = poker.isFullHouse(input, 5);
		assertEquals(true, result);
	}

	// Test case 5: n = 5, cards = {"C2", "D2", "C3", "D3", "C4"};
	@Test
	public void test22334() {
		boolean result;
		String[] input = new String[] { "C2", "D2", "C3", "D3", "C4" };
		result = poker.isFullHouse(input, 5);
		assertEquals(false, result);
	}

	// Test case 6: n = 5, cards = {"CA", "C2", "C3", "C4", "C5"};
	@Test
	public void testA2345() {
		boolean result;
		String[] input = new String[] { "CA", "C2", "C3", "C4", "C5" };
		result = poker.isFullHouse(input, 5);
		assertEquals(false, result);
	}
	
	@Test
	public void testIsTwoPairs_1()
	{
		boolean result;
		String[] input = new String[] {"D1", "C5", "D5", "H8", "C9"};
		result = poker.isTwoPairs(input, 5);
		assertEquals(false, result);
	}
	@Test
	public void testIsTwoPairs_2()
	{
		boolean result;
		String[] input = new String[] {"D1", "C5", "D5", "H9", "C9"};
		result = poker.isTwoPairs(input, 5);
		assertEquals(true, result);
	}
	
	@Test 
	public void testIsThreeOfaKind_1()
	{
		boolean result;
		String[] input = new String[] {"D1", "C5", "D5", "H5", "C9"};
		result = poker.isThreeOfaKind(input, 5);
		assertEquals(true, result);
	}
	@Test 
	public void testIsThreeOfaKind_2()
	{
		boolean result;
		String[] input = new String[] {"D1", "C5", "D5", "H7", "C9"};
		result = poker.isThreeOfaKind(input, 5);
		assertEquals(false, result);
	}

}
