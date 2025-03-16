package com.example.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BussinessTest {

	Bussiness b = null;
	
	@BeforeEach
	public void myBfore(){
		
		System.out.println("Executing before every test case ");
		b=new Bussiness();
		
	}
	
	@AfterEach
	public void myAfter(){
		
		System.out.println("Executing after every test case ");
		
		b=null;
		
	}

	@Test
	public void testCheckConditionQA() {
		Bussiness.checkCondition("QA");
	}

//	@Test
	public void testCheckConditionDev() {
		Bussiness.checkCondition("Dev");
	}

	//@Test
	public void testCheckConditionInvalid() {
		Bussiness.checkCondition("Test");
	}
}
