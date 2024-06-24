package com.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.demo.parameterized.Parameterize;

public class ParameterTest {

	@ParameterizedTest
	@ValueSource(strings = { "radar", "madam", "tacocat", "Soumya" })
	public void palindromeTest(String input) {
		assertTrue(Parameterize.isPalindrome(input));
	}
}
