package com.bawei.commons.utils.test;

import java.io.File;
import java.util.List;

import org.junit.Test;

import com.bawei.commons.utils.FileUtil;

public class FileUtilTest {
	/**
	 * 获取自定义的文件扩展名
	 */
	@Test
	public void getExtNameTest() {
		String extName = FileUtil.getExtName("C:\\Users\\77028\\Desktop\\file\\english1.txt");
		System.out.println("获取指定的文件扩展名:"+extName);
	}
	
	/**
	 * 获取操作系统临时目录
	 */
	@Test
	public void getSystemTempDirectoryTest() {
		String extName = FileUtil.getSystemTempDirectory();
		System.out.println("获取操作系统临时目录:"+extName);
	}
	
	/**
	 * 按行读取自定义的文件内容
	 */
	@Test
	public void readTextFileByLineTest() {
		String extName = FileUtil.readTextFileByLine("C:\\Users\\77028\\Desktop\\file\\english1.txt");
		System.out.println("按行读取指定的文件内容:\n"+extName);
	}
	
	/**
	 * 按行读取自定义的文件内容(List集合的形式)
	 */
	@Test
	public void readTextFileOfListTest() {
		List<String> extName = FileUtil.readTextFileOfList("C:\\Users\\77028\\Desktop\\file\\english1.txt");
		System.out.println("按行读取指定的文件内容(List集合的形式):");
		for (String string : extName) {
			System.out.println(string);
		}
	}
	
	/**
	 * 删除文件(如果是文件夹删除文件夹下所有目录)
	 */
	@Test
	public void deleteFileTest() {
		FileUtil.deleteFile(new File("C:\\Users\\77028\\Desktop\\file\\exam09.txt"));
		System.out.println("删除文件(如果是文件夹删除文件夹下所有目录)");
	}
	
	/**
	 * 判断指定文件大小(以整数的形式)
	 */
	@Test
	public void getFileSizeTest() {
		String fileSize = FileUtil.getFileSize("C:\\Users\\77028\\Desktop\\file\\aa.txt");
		System.out.println("判断指定文件大小(以整数的形式):"+fileSize);
	}
	
	/**
	 * 判断指定文件大小(以指定小数点后几位的形式)
	 */
	@Test
	public void getFileNumSizeTest() {
		String fileSize = FileUtil.getFileSize("C:\\Users\\77028\\Desktop\\file\\aa.txt",3);
		System.out.println("判断指定文件大小(以指定小数点后几位的形式):"+fileSize);
	}
	
}
