package com.java8.lmdaex;
import java.io.File;
import java.io.FileFilter;

public class FileFilterAnnonymousClass {

	FileFilter filter = new FileFilter() {
		
		@Override
		public boolean accept(File pathname) {
			return pathname.getName().endsWith(".java");
		}
	};
}
