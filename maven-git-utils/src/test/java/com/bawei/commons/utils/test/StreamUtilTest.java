package com.bawei.commons.utils.test;

import java.util.List;

import org.junit.Test;

import com.bawei.commons.utils.StreamUtil;

public class StreamUtilTest {
	/**
	 * 读取文本文件(以字节流的形式)
	 */
	@Test
	public void readTextFileTest() {
		String readTextFile = StreamUtil.readTextFile("C:\\Users\\77028\\Desktop\\file\\aa.txt");
		System.out.println("读取文本文件(以字节流的形式):"+readTextFile);
	}
	
	
	/**
	 * 写入内容
	 */
	@Test
	public void writeTextFileTest() {
		StreamUtil.writeTextFile("--very good", "C:\\Users\\77028\\Desktop\\file\\aa.txt", true);
		System.out.println("写入内容");
	}
	
}
