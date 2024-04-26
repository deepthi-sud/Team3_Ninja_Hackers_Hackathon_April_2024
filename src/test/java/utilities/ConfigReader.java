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
	@@ -33,13 +37,12 @@ public static void setBrowserType(String browser) {
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
	@@ -61,9 +64,9 @@ public static String getExcelFilepPath() {
	}

	public static String getUrl() {
		String URL=properties.getProperty("url");
				if (URL != null)
					return URL;
				else
					throw new RuntimeException("URL not specified in the config.properties file.");	
	}
