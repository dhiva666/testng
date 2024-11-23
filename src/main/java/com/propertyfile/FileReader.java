package com.propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FileReader {
	private static FileInputStream fis;
	private static Properties property;
			
	private static Properties setupPropertyFile () {
		File file = new File (
			"E:\\luma_project\\luma\\src\\main\\java\\com\\propertyfile\\LumaFile.properties");
		
	try {
		fis =new FileInputStream (file);
		property = new Properties ();
		property.load(fis);
	}
	catch (FileNotFoundException e) {
		Assert.fail("ERROR: OCCURS DURING THE FILE INPUTSTREAM FROM READER FILE EXCEPTION FILE NOT FOUND");
		
	}
	catch (IOException e) {
		Assert.fail("ERROR: OCCURS DURING THE VALUE READED IN THE PROPERTY FILE EXCEPTION IO EXCEPTION");
		
	}
	return property;
}

	public String getPropertyFileData(String key) {
		setupPropertyFile();
		String data = property.getProperty(key);
		return data;
	}
	

}
