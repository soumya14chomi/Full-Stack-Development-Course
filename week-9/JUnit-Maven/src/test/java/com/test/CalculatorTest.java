package com.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.demo.Calculator;

public class CalculatorTest {

	Calculator nc;

	@BeforeEach
	void init() {
		nc = new Calculator();
	}

	@Test
	void testAdd() {
		assertEquals(nc.add(10, 20), 30);
	}

	@Nested
	class AddTest {
		@Test
		void addPositive() {
			assertEquals(nc.add(1, 2), 3);
		}

		@Test
		void addPositiveNegative() {
			assertEquals(nc.add(-1, 10), 9);
		}

		@Test
		void addNegative() {
			assertEquals(-2, nc.add(-1, -1));
		}
	}

	@Test
	void testMultiply() {
		assertAll(() -> assertEquals(10, nc.multiply(2, 5)), () -> assertEquals(nc.multiply(5, 3), 15));
	}
}
