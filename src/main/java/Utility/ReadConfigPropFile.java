package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigPropFile {

	public static String readConfigPropFile(String value) throws Exception {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\gaura\\eclipse-workspace\\MyStoreFramework\\TestData\\config.properties");
		prop.load(file);
		return prop.getProperty(value);
		
	}
}
