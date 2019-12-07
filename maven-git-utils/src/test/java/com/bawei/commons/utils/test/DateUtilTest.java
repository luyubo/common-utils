package com.bawei.commons.utils.test;

import java.sql.Date;

import org.junit.Test;

import com.bawei.commons.utils.DateUtil;
/**
 * DateUtil测试类
 * @author 77028
 *
 */
public class DateUtilTest extends DateUtil {
	
	/**
	 * 测试今年几岁
	 */
	@Test
	public void getAgeTest() {
		System.out.println(getAge("2000-02-01"));
	}
	
	/**
	 * 测试今年几岁
	 */
	@Test
	public void getDateNumTest() {
		System.out.println(getDayNum(Date.valueOf("2019-05-01"),Date.valueOf("2019-05-01")));
	}
}
