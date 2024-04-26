package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.util.Properties;

import constants.Constants;

public class ConfigReader {
	//private static Properties properties;
	private final static String propertyFilePath = "./src/test/resources/Config.properties";
	 private static Properties properties = new Properties();

	public Properties  loadConfig() throws Throwable {

		try {
			FileInputStream fis; 
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();
			properties.load(getClass().getResourceAsStream("/Config.properties"));
			Constants.URL=properties.getProperty("url");
			
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
	
	public static String getBrowserType() {
		 browserType = properties.getProperty("browser");
		if (browserType != null)
			return browserType;
		else
			throw new RuntimeException("browser not specified in the testng.xml");
	}
	
//	public static String getBrowserType()throws Throwable {
//        String browser = properties.getProperty("browser");
//        LoggerLoad.info("Get property BrowserType");
//		if (browser != null)
//			return browser;
//		else
//			throw new RuntimeException("browser not specified in the config.properties file.");
//	}
	
	public static String getExcelFilepPath() {
		String path=properties.getProperty("excelpath");
	//	LoggerLoad.info("Get property BrowserType");
		if (path != null)
			return path;
		else
			throw new RuntimeException("Excel path not specified in the config.properties file.");
	}
	
	public static String getUrl() {
		String URL=properties.getProperty("url");
				if (URL != null)
					return URL;
				else
					throw new RuntimeException("URL not specified in the config.properties file.");	
	}
	
}