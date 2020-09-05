package com.syntax.class33;
public class GettingSystemProperties {

	public static void main(String[] args) {
		
		// Users/Syntax/eclipse-workspace/SyntaxBatchVII/JavaBatch7/configs/Example.properties
		
		String username=System.getProperty("user.name");
		System.out.println(username);
		
		String os=System.getProperty("os.name");
		System.out.println(os);
		
		String directory=System.getProperty("user.dir");
		System.out.println(directory);
		
		String filePath=System.getProperty("user.dir")+"/configs/Example.properties";
	}
}