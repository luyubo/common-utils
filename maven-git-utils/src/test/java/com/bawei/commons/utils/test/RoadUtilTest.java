package com.bawei.commons.utils.test;
/**
 * 测试汽车的经纬度
 * @author 77028
 *
 */

import org.junit.Test;

import com.bawei.commons.utils.RoadUtil;

public class RoadUtilTest {
	@Test
	public void car() {
		double journey = RoadUtil.journey(39.5, 116.23);
		System.out.println(journey);
	}
}
