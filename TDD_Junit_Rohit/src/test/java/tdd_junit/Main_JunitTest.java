package tdd_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd_junit.Main_Junit;

public class Main_JunitTest {

	Main_Junit m=new Main_Junit();
	
	public void test1() 
	{
		assertEquals("BCD",m.remove("AABCD"));
	}
	public void test2()
	{
		assertEquals("DUDE",m.remove("ADUDE"));	
	}
	public void test3()
	{
		assertEquals("ZXYA",m.remove("ZXYA"));	
	}
}
