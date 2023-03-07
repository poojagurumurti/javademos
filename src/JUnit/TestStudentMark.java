package JUnit;


import org.junit.Test;
import static org.junit.Assert.*;


public class TestStudentMark {
	@Test
	public void test_getTotalMarks() {
		assertEquals(300.0,StudentMark.getTotalMarks(100, 100,100),0.0f);
		
	}
@Test(expected=ArithmeticException.class)
public void test_getTotalMarksAbove() {
	StudentMark.getTotalMarks(1000, 1000, 1000);
   }

@Test(expected=ArithmeticException.class)
public void test_getTotalMarksBelow() {
	StudentMark.getTotalMarks(-1,-1,-1);	
}
@Test
public void test_getTotalMarkArithmeticCheck() {
	StudentMark.getTotalMarks(10+20+30,30+40,40+20+10);	
}

	
}