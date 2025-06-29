package Ex_1SettingUpJUnit.SettingUpJUnit;

import static org.junit.Assert.*;

import org.junit.Test;


import learn.test;

public class Exercise1_Test {
	test a;
	@Test
	public void message()
	{
		a=new test();
		int ans=a.add(5, 4);
		assertEquals(9,ans);
	}
	
}
