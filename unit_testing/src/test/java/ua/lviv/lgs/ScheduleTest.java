package ua.lviv.lgs;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

public class ScheduleTest {
	public Schedule schedule;

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
		schedule = new Schedule(null);
	}

	@After
	public void afterTest() {
		schedule = null;
	}

	@Test
	public void addSeanceTest() {
		assertNotNull("Value added!", schedule);

	}

	@SuppressWarnings("deprecation")
	@Test
	public void removeSeanceTest() {
		assertEquals(null, null);
	}
}
