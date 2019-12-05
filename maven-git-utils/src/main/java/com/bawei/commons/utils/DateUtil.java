package com.bawei.commons.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 * @author 77028
 *
 */
public class DateUtil {
	/**
	 * 根据生日判断年龄
	 * @param birthDate
	 * @return
	 */
	public static int getAge(Date birthDate) {
		/**
		 * 获得年、月、日
		 */
		Calendar calendar=Calendar.getInstance();
		int nowYear = calendar.get(Calendar.YEAR);
		int nowMonth = calendar.get(Calendar.MONTH);
		int nowDay = calendar.get(Calendar.DAY_OF_MONTH);
		//设置生日
		//设置生日
		calendar.setTime(birthDate);
		int birthYear = calendar.get(Calendar.YEAR);
		int birthMonth = calendar.get(Calendar.MONTH);
		int birthDay = calendar.get(Calendar.DAY_OF_MONTH);
		//年龄
		int age = nowYear-birthYear;
		//如果生日的月份大于当前月份时，年龄-1
		if(birthMonth>nowMonth) {
			age--;
		}
		//如果月份相等，判断日期
		if(birthMonth==nowMonth && nowDay<birthDay) {
			age--;
		}
		return age;
		
	}
}
