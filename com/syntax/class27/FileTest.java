package com.syntax.class27;
public class FileTest {
	public static void main(String[] args) {

		File[] files={new JavaFile(), new WordFile(), new PdfFile()};
		
		for(File file: files) {
			file.open();
		}
	}
}