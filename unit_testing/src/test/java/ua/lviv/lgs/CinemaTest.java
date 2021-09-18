package ua.lviv.lgs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

public class CinemaTest {

	public Cinema cinema;

	@Rule
	public TestWatcher testWatcher = new TestWatcher() {
		protected void failed(Throwable e, org.junit.runner.Description description) {
			System.out.println("FAILED-->" + description.getMethodName());
		};

		protected void succeeded(org.junit.runner.Description description) {
			System.out.println("SUCCEDED-->" + description.getMethodName());
		};
	};

	@Before
	public void beforeTest() {
		cinema = new Cinema(null, null, null, null);
	}

	@After
	public void afterTest() {
		cinema = null;
	}

	@Test
	public void addMovieTest() {
		assertNotNull("Value added!", cinema);

	}
	
	@Test
	public void addSeanceTest() {
		assertNotNull("Value added!", cinema);

	}

	@SuppressWarnings("deprecation")
	@Test
	public void removeMovieTest() {
		assertEquals(null, null);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void removeSeanceTest() {
		assertEquals(null, null);
	}
}
