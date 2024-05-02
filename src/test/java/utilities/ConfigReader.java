package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.util.Properties;

import constants.Constants;

public class ConfigReader {
	private final static String propertyFilePath = "./src/test/resources/Config.properties";
	 private static Properties properties = new Properties();

	public  Properties  loadConfig() throws Throwable {

		try {
			FileInputStream fis; 
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();
			properties.load(getClass().getResourceAsStream("/Config.properties"));
			Constants.URL=properties.getProperty("url");
			Constants.user_name=properties.getProperty("username");
			Constants.pass_word=properties.getProperty("password");
			  try { properties.load(fis); fis.close(); } catch (IOException e) {
			  e.printStackTrace(); }
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("config.properties not found at config file path " + propertyFilePath);
		}
		return properties;
	}

	private static String browserType=null;
	
	public static void setBrowserType(String browser) {
		browserType=browser;
	}
	
//	public static String getBrowserType() throws Throwable {
//		//String browser = properties.getProperty("browser");
//		LoggerLoad.info("Get property BrowserType");
//		if (browserType != null)
//			return browserType;
//		else
//			throw new RuntimeException("browser not specified in the config.properties file.");
//	}
	
//	public static String getBrowserType()throws Throwable {
//        String browser = properties.getProperty("browser");
//        LoggerLoad.info("Get property BrowserType");
//		if (browser != null)
//			return browser;
//		else
//			throw new RuntimeException("browser not specified in the config.properties file.");
//	}
	
	public static String getBrowserType() {
		 browserType = properties.getProperty("browser");
		if (browserType != null)
			return browserType;
		else
			throw new RuntimeException("browser not specified in the testng.xml");
	}
	public static String getExcelFilepPath() {
		String path=properties.getProperty("excelpath");
	//	LoggerLoad.info("Get property BrowserType");
		if (path != null)
			return path;
		else
			throw new RuntimeException("Excel path not specified in the config.properties file.");
	}
	
	public static String getUrl() {
		String url=properties.getProperty("url");
				if (url != null)
					return url;
				else
					throw new RuntimeException("URL not specified in the config.properties file.");	
	}
	public static String getInvalidUrl() {
		String url=properties.getProperty("invalidUrl");
				if (url != null)
					return url;
				else
					throw new RuntimeException("URL not specified in the config.properties file.");	
	}
	
}