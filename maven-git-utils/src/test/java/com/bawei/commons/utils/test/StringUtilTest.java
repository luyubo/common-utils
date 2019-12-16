package com.bawei.commons.utils.test;

import org.junit.Test;

import com.bawei.commons.utils.StringUtil;

public class StringUtilTest {
	
	/**
	 * 测试字符串是否是空
	 */
	@Test
	public void isBlankTest() {
		boolean blank = StringUtil.isBlank("a");
		System.out.println("测试字符串是否为空:"+blank);
	}
	
	/**
	 * 测试字符串是否不是空
	 */
	@Test
	public void isNotBlankTest() {
		boolean blank = StringUtil.isNotBlank("");
		System.out.println("测试字符串是否不为空:"+blank);
	}
	
	/**
	 * 测试手机号是否正确
	 */
	@Test
	public void isPhoneNumTest() {
		boolean blank = StringUtil.isPhoneNum("13345678910");
		System.out.println("测试手机号是否正确:"+blank);
	}
	
	/**
	 * 测试邮箱号是否正确
	 */
	@Test
	public void isEmailPathTest() {
		boolean blank = StringUtil.isEmailPath("770286812@qq.com");
		System.out.println("测试邮箱是否正确:"+blank);
	}
	
	/**
	 * 测试是否是字母
	 */
	@Test
	public void isLetterTest() {
		boolean letter = StringUtil.isLetter("a");
		System.out.println("测试是否是字母:"+letter);
	}
	
	/**
	 * 获得一个随机的小写英文字符
	 */
	@Test
	public void getRandomTest() {
		char random = StringUtil.getRandom();
		System.out.println("获得一个随机的小写英文字符:"+random);
	}
	
	/**
	 * 获得一个随机的大写英文字符
	 */
	@Test
	public void getBigRandomTest() {
		char random = StringUtil.getBigRandom();
		System.out.println("获得一个随机的大写英文字符:"+random);
	}
	
	/**
	 * 获得自定义个数的随机小写英文字符
	 */
	@Test
	public void getRandomLetterTest() {
		String random = StringUtil.getRandomLetter(5);
		System.out.println("获得自定义个数的随机小写英文字符:"+random);
	}
	
	/**
	 * 获得自定义个数的随机小写或大写英文字符
	 */
	@Test
	public void getRandomBigAndLittleLetterTest() {
		String random = StringUtil.getRandomBigAndLittleLetter(5);
		System.out.println("获得自定义个数的随机小写或大写英文字符:"+random);
	}
	
	/**
	 * 获得自定义个数的随机大写英文字符
	 */
	@Test
	public void getRandomBigLetterTest() {
		String random = StringUtil.getRandomBigLetter(5);
		System.out.println("获得自定义个数的随机大写英文字符:"+random);
	}
	
	/**
	 * 获得一个数的随机数字
	 */
	@Test
	public void getNumLetterTest() {
		char random = StringUtil.getNumLetter();
		System.out.println("获得一个数的随机数字:"+random);
	}
	
	/**
	 * 获得自定义个数的随机小写英文字符或数字
	 */
	@Test
	public void getNumAndLittleLetterTest() {
		String random = StringUtil.getNumAndLittleLetter(5);
		System.out.println("获得自定义个数的随机小写英文字符或数字:"+random);
	}
	
	/**
	 * 获得自定义个数的随机大写英文字符或数字
	 */
	@Test
	public void getNumAndBigLetterTest() {
		String random = StringUtil.getNumAndBigLetter(5);
		System.out.println("获得自定义个数的随机大写英文字符或数字:"+random);
	}
	
	/**
	 * 获得自定义个数的随机大写或小写英文字符或数字
	 */
	@Test
	public void getNumAndBigAndLittleLetterTest() {
		String random = StringUtil.getNumAndBigAndLittleLetter(5);
		System.out.println("获得自定义个数的随机大写或小写英文字符或数字:"+random);
	}
	
	/**
	 * 获得一个中文字符
	 */
	@Test
	public void randomChineseStringTest() {
		String random = StringUtil.randomChineseString();
		System.out.println("获得一个数的随机中文字符:"+random);
	}
	
	/**
	 * 获得自定义个中文字符
	 */
	@Test
	public void randomChineseStringMoreTest() {
		String chineseString = StringUtil.randomChineseString(5);
		System.out.println("获得自定义个数的随机中文字符:"+chineseString);
	}
	
	/**
	 * 获得随机中文名
	 */
	@Test
	public void randomStringChineseNameTest() {
		String random = StringUtil.randomStringChineseName();
		System.out.println("随机生成中文名:"+random);
	}
	
	/**
	 * 自定义循环量获得姓名
	 */
	@Test
	public void randomStringChineseNameListTest() {
		for (int i=0;i<5;i++) {
			String chineseName = StringUtil.randomStringChineseName();
			System.out.println("自定义循环量获得姓名:"+chineseName);
		}
	}
	
	/**
	 * 判断输入的是否是数字
	 */
	@Test
	public void isNumberTest() {
		boolean number = StringUtil.isNumber("123");
		System.out.println("判断输入的是否是数字:"+number);
	}
	
	/**
	 * 判断输入的是否是手机号,要进行是否是num判断
	 */
	@Test
	public void judgeTelephoneIsOkTest() {
		boolean number = StringUtil.judgeTelephoneIsOk("13a01860829");
		System.out.println("判断输入的是否是手机号,要进行是否是num判断:"+number);
	}
	
}
