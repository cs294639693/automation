package org.cs.project.testcase;

import static org.junit.Assert.*;

import org.cs.project.page.BaiduIndex;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test001 {

	public test001() {
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		BaiduIndex loginpage = new BaiduIndex("http://www.baidu.com");
		// fail("Not yet implemented");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaiduIndex loginPage = new BaiduIndex("http://www.baidu.com");

	}

}
