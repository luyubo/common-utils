package com.bawei.commons.utils.test;
/**
 * CarUtil测试类
 * @author 77028
 *
 */

import org.junit.Test;

import com.bawei.commons.utils.CarUtil;

public class CarUtilTest {
	/**
	 * 判断是否是c汽车
	 */
	@Test
	public void isTypeCTest() {
		System.out.println(CarUtil.isTypeC("C"));
	}
	
	/**
	 * 判断是否是A型摩托车
	 */
	@Test
	public void isTypeMATest() {
		System.out.println(CarUtil.isTypeMA("MA"));
	}
	
	/**
	 * 判断汽车单双号
	 */
	@Test
	public void getCarIdNumTest() {
		System.out.println(CarUtil.getCarIdNum("京H.20102A"));
	}
	
	/**
	 * 判断汽车单双号
	 */
	@Test
	public void getIsJingTest() {
		System.out.println(CarUtil.getIsJing("京H.20102A"));
	}
}
