package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

	 private static Properties prop;
	  
	  public static void intializePropertyFile() throws IOException {
		  File file= new File("E:\\practiceForInterview\\WorkSpace\\Guru99\\src\\test\\resources\\TestData\\Config.Properties");
		  FileInputStream fis= new FileInputStream(file);
		  prop=new Properties();
		  prop.load(fis);
	  }
	  
	  public static String readProperty(String KeyName) {
		 return prop.getProperty(KeyName);
	  }

}
