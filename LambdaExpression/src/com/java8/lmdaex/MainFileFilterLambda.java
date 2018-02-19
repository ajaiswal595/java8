package com.java8.lmdaex;
import java.io.File;
import java.io.FileFilter;

public class MainFileFilterLambda {

	public static void main(String[] args) {

		/*
		 * calling implemented class
		 * 
		 */

		// 1st way
		System.out.println("--------------Implemented Class--------------------");
		File dir = new File("E:\\ajaiswal595Repository\\DataStructure\\DataStructure\\src\\com\\linear\\ds");
		File[] files = dir.listFiles(new FileFilterImpletemtedClass());

		for (File f : files) {
			System.out.println(f);
		}

		// 2nd way
		System.out.println("--------------Implemented 2nd Way--------------------");
		new FileFilterImpletemtedClass().getAllJavaFileName();

		/*
		 * 
		 * calling annonymous class
		 */
		System.out.println("--------------annonymous Class--------------------");
		File dir1 = new File("E:\\ajaiswal595Repository\\DataStructure\\DataStructure\\src\\com\\linear\\ds");
		File[] files1 = dir1.listFiles(new FileFilterAnnonymousClass().filter);

		for (File f : files1) {
			System.out.println(f);
		}
		/*
		 * lambada call
		 * 
		 */

		System.out.println("--------------Lambda Expression--------------------");

		// LambdaExpression Class refrerence = (parameter )->implementation
		FileFilter filterlambda = (File pathName) -> pathName.getName().endsWith(".java");

		File dirLambda = new File("E:\\ajaiswal595Repository\\DataStructure\\DataStructure\\src\\com\\linear\\ds");
		File[] filesLambda = dirLambda.listFiles(filterlambda);

		for (File f : filesLambda) {
			System.out.println(f);
		}
	}
}