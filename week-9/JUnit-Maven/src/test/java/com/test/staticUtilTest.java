package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.StaticUtil;

@ExtendWith(MockitoExtension.class)
public class staticUtilTest {

	StaticUtil st;

	@BeforeEach
	public void init() {
		st = new StaticUtil();
	}

//	@Test
//	public void testPrivateMethod() {
//		assertEquals(StaticUtil.getTest("Hello"), "Hello");
//	}

	@Test
	public void testPrivateMethod1() {
//		Method method = StaticUtil.class.getDeclaredMethod("privateTest", String.class);

	}
}
