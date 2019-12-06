package com.bawei.commons.utils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	/**
	 * 判断是否字符串是否为空
	 * 
	 * @param string
	 * @return
	 */
	public static boolean isBlank(String string) {
		if (string == null) {
			System.out.println(string);
			return false;
		}
		// 去空格
		string = string.trim();
		// 判断字符串的长度是否0
		if (string.length() == 0) {
			return false;
		}
		return true;
	}

	/**
	 * 判断字符串不为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotBlank(String string) {
		return !isBlank(string);
	}

	/**
	 * 判断手机号是否正确
	 * 
	 * @param args
	 */
	public static boolean isPhoneNum(String phoneNum) {
//		String regex="1[3578]\\d{9}";
//		return phoneNum.matches(regex);

		// 这种方法是把所有的开头两个数字定死
//		String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
		String regex = "^1((3[0-9])|(5[0-9])|(7[0-9])|(8[0-9]))\\d{8}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(phoneNum);
		boolean isMatch = m.matches();
		return isMatch;
	}

	/**
	 * 判断email是否正确
	 * 
	 * @param args
	 */
	public static boolean isEmailPath(String emailPath) {
		String regex = "[A-z0-9]+@[A-z0-9]+.(com|cn)";
		return emailPath.matches(regex);
	}

	/**
	 * 判断字符串是否全为字母
	 * 
	 * @param args
	 */
	public static boolean isLetter(String str) {
		if (isBlank(str)) {
			str = str.toLowerCase();
			String regex = "[a-z]+";
			return str.matches(regex);
		}
		return false;
	}

	/**
	 * 获取随机字符串
	 * 
	 * @param args
	 */
	public static char getRandom() { 
		// 生成随机类 
		Random random=new Random();
		// 第一种方式
  	    //开始字符在acsii码
		int startChar = 'a'+0; 
 		//生成随机字符 
		char newChar = (char) (startChar + random.nextInt(26)); 
		return newChar;
	}
	
	/**
	 * 生成数字随机数
	 * @param num
	 * @return
	 */
	public static String getRandomLetter(int num) {
		//保存生成胡字符
		StringBuffer sb=new StringBuffer();
		//生成随机字符
		for(int i=0;i<num;i++) {
			char random = getRandom();
			sb.append(random);
		}
		
		//大小写都可以生成的方式
//		String randomcode = "";
//		for(int i=0;i<num;i++)
//		{
//			//52个字母与6个大小写字母间的符号；范围为91~96
//			int value = (int)(Math.random()*58+65);
//			while(value>=91 && value<=96)
//				value = (int)(Math.random()*58+65);
//			randomcode = randomcode + (char)value;
//		}
		
		return sb.toString();
	}

	/**
	 * 生成随机的数字
	 * @param args
	 */
	public static char getNumLetter() {
		// 生成随机类 
		Random random=new Random();
		// 第一种方式
  	    //开始字符在acsii码
		int startChar = '0'+0; 
 		//生成随机字符 
		char newChar = (char) (startChar + random.nextInt(10)); 
		return newChar;
	}
	
	public static String getNumAndLetter(int num) {
		//保存生成胡字符
		StringBuffer sb=new StringBuffer();
		Random random=new Random();
		//生成随机字符
		for(int i=0;i<num;i++) {
			if(random.nextInt(36)>10) {
				sb.append(getRandom());
			}else {
				sb.append(getNumLetter());
			}
		}
		return sb.toString();
	}
}
