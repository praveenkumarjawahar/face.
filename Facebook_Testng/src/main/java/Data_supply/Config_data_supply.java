package Data_supply;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

//import Dataprovider.String;

public class Config_data_supply {
	
	public static String brow_driver;
	Properties Pro;
	public Config_data_supply() {
		
	
	File src = new File("./Config_data");
	try {
	FileInputStream util = new FileInputStream(src);
	
	 Pro = new Properties();
	
	Pro.load(util);
	
	} catch (Exception e) {
		System.out.println("Exception is :" + e.getMessage());
	}
}

public String Facebook_username() {
	
	String face_Username = Pro.getProperty("Username");
	return face_Username;
}

public String Facebook_password() {
	
	String face_password =  Pro.getProperty("Password");
	return face_password;
	
}

public String browser_driver() {
	 final String brow_driver = Pro.getProperty("Browser");
	return brow_driver;
}
public String getchromepath() {
	String chrome_path = Pro.getProperty("chrome_driver_path");
	return chrome_path;
	
}

public String get_url() {
	String face_url = Pro.getProperty("UrL");
			return face_url;
	
}



}
