package com.bawei.commons.utils.test;

import org.junit.Test;

import com.bawei.commons.utils.RandomUtil;

/**
 * 随机类测试类
 * @author 77028
 *
 */
public class RandomUtilTest {
	
	/**
	 * 获取自定义的最小数到最大数之间的随机数
	 */
	@Test
	public void randomTest() {
		int random = RandomUtil.random(1, 10);
		System.out.println("获取自定义的最小数到最大数之间的随机数1-10(测试数据):"+random);
	}
	
	/**
	 * 获取自定义数的最小数到最大数之间的随机数
	 */
	@Test
	public void randomListTest() {
		int[] random = RandomUtil.random(1,10,5);
		for (int i : random) {
			System.out.println("获取自定义的条数的最小数到最大数之间的随机数1-10(定义输出5个数,测试数据):"+i);
		}
	}
	
}
