package java8.mod.romanDecimal;

import static org.junit.Assert.*;

import org.junit.Test;
import static java8.mod.romanDecimal.TestUtils.*
;public class MainTest {

	@Test
	public void testConvertRomanToDecimal() throws Exception {
		yakshaAssert(currentTest(),Main.convertRomanToDecimal("XIV")==14?"true":"false",businessTestFile);
		yakshaAssert(currentTest(),Main.convertRomanToDecimal("xvi")==16?"true":"false",businessTestFile);
		yakshaAssert(currentTest(),Main.convertRomanToDecimal("mmdcl")==2650?"true":"false",businessTestFile);
		yakshaAssert(currentTest(),Main.convertRomanToDecimal("MMCDIL")==2449?"true":"false",businessTestFile);
	}
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }


}
