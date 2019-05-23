package dev.utils;

import org.junit.Assert;
import org.junit.Test;
import dev.utils.StringUtils;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance1() {
		String lhs = "chat";
		String rhs = "chats";
		Assert.assertEquals(1, StringUtils.levenshteinDistance(lhs, rhs));
	}

	@Test
	public void testLevenshteinDistance2() {
		String lhs = "machins";
		String rhs = "machine";
		Assert.assertEquals(1, StringUtils.levenshteinDistance(lhs, rhs));
	}

	@Test
	public void testLevenshteinDistance3() {
		String lhs = "aviron";
		String rhs = "avion";
		Assert.assertEquals(1, StringUtils.levenshteinDistance(lhs, rhs));
	}

	@Test
	public void testLevenshteinDistance4() {
		String lhs = "distance";
		String rhs = "instance";
		Assert.assertEquals(2, StringUtils.levenshteinDistance(lhs, rhs));
	}

	@Test
	public void testLevenshteinDistance5() {
		String lhs = "chien";
		String rhs = "chine";
		Assert.assertEquals(2, StringUtils.levenshteinDistance(lhs, rhs));
	}

	@Test
	public void testLevenshteinDistance6() {
		String lhs = "abc";
		String rhs = "def";
		Assert.assertEquals(3, StringUtils.levenshteinDistance(lhs, rhs));
	}
	
	@Test
	public void testLevenshteinDistance7() {
		String lhs = "blabla";
		String rhs = "blabla";
		Assert.assertEquals(0, StringUtils.levenshteinDistance(lhs, rhs));
	}

	@Test(expected = NullPointerException.class)
	/**
	 * Test avec des valeurs null
	 */
	public void testLevenshteinDistanceWithNull1() {
		String lhs = null;
		String rhs = "coucou";

		StringUtils.levenshteinDistance(lhs, rhs);
	}
	
	@Test(expected = NullPointerException.class)
	public void testLevenshteinDistanceWithNull2() {
		String lhs = "salut";
		String rhs = null;

		StringUtils.levenshteinDistance(lhs, rhs);
	}
	
	@Test(expected = NullPointerException.class)
	public void testLevenshteinDistanceWithNull3() {
		String lhs = null;
		String rhs = null;
		
		StringUtils.levenshteinDistance(lhs, rhs);
	}
}
