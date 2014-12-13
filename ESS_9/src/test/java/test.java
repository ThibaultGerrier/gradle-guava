import static org.junit.Assert.*;

import org.junit.Test;


public class test {

	@Test
	public void test() {
		Main test = new Main();
		String[] strArr = {"alpha", "beta", "gamma"};
		String seperator = ", ";
		String joinedString = test.joiner(strArr, seperator);
		assertEquals ("alpha, beta, gamma", joinedString);
	}

}
