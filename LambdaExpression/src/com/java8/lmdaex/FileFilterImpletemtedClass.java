package com.java8.lmdaex;
import java.io.File;
import java.io.FileFilter;

public class FileFilterImpletemtedClass implements FileFilter{

	@Override
	public boolean accept(File pathname) {

		return pathname.getName().endsWith(".java");
	}
	
	public void getAllJavaFileName() {
		
		File dir = new File("E:\\ajaiswal595Repository\\DataStructure\\DataStructure\\src\\com\\linear\\ds");
		File[] files = dir.listFiles(new FileFilterImpletemtedClass());
		
		for(File f : files) {
			System.out.println(f);
		}
	}

}
